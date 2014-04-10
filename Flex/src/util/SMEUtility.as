package util
{
	import components.CustomDocAttachment;
	import components.TextInputFormItem;
	
	import flash.net.FileReference;
	import flash.net.URLRequest;
	import flash.utils.ByteArray;
	
	import flashx.textLayout.operations.CutOperation;
	
	import mx.collections.ArrayCollection;
	import mx.collections.CursorBookmark;
	import mx.collections.IList;
	import mx.collections.IViewCursor;
	import mx.collections.XMLListCollection;
	import mx.containers.FormItem;
	import mx.controls.Alert;
	import mx.controls.DataGrid;
	import mx.controls.TextInput;
	import mx.controls.dataGridClasses.DataGridColumn;
	import mx.events.ValidationResultEvent;
	import mx.formatters.DateFormatter;
	import mx.validators.Validator;
	
	import org.alivepdf.colors.RGBColor;
	import org.alivepdf.data.Grid;
	import org.alivepdf.data.GridColumn;
	import org.alivepdf.fonts.CoreFont;
	import org.alivepdf.fonts.FontFamily;
	import org.alivepdf.images.ColorSpace;
	import org.alivepdf.layout.Align;
	import org.alivepdf.layout.Mode;
	import org.alivepdf.layout.Position;
	import org.alivepdf.layout.Size;
	import org.alivepdf.pdf.PDF;
	import org.alivepdf.saving.Method;
	import org.puremvc.as3.multicore.patterns.facade.Facade;
	
	import util.FileIOUtil;
	import util.PdfConstants;
	import util.SMEConstants;
	import util.SMEModel;
	
	import valueobject.UIComponentDetail;
	
	public class SMEUtility
	{
		public function SMEUtility()
		{
		}
		
		public static function exportToCSV(dg:DataGrid, csvSeparator:String="|", lineSeparator:String="\n"):String
		{
			var data:String = "";
			var columns:Array = dg.columns;
			var columnCount:int = columns.length;
			var column:DataGridColumn;
			var header:String = "";
			var headerGenerated:Boolean = false;
			var dataProvider:Object = dg.dataProvider;
			var rowCount:int = dataProvider.length;
			var dp:Object = null;
			var cursor:IViewCursor = dataProvider.createCursor();
			var j:int = 0;
			//loop through rows
			while (!cursor.afterLast)
			{
				var obj:Object = null;
				obj = cursor.current;
				//loop through all columns for the row
				for(var k:int = 0; k < columnCount; k++)
				{
					column = columns[k];
					//Exclude column data which is invisible (hidden)
					if(!column.visible)
					{
						continue;
					}
					data += column.itemToLabel(obj);
					if(k < (columnCount -1))
					{
						data += csvSeparator;
					}
					//generate header of CSV, only if it's not genereted yet
					if (!headerGenerated)
					{
						header += column.headerText ;
						if (k < columnCount - 1)
						{
							header += csvSeparator;
						}
					}
				}
				headerGenerated = true;
				if (j < (rowCount - 1))
				{
					data += lineSeparator;
				}
				j++;
				cursor.moveNext ();
			}
			//set references to null:
			dataProvider = null;
			columns = null;
			column = null;
			var retrundata:String = header + "\n" + data;
			downloadFile(retrundata);
			return retrundata;
		}
		
		public static function downloadFile(data:String,fileName:String=null):void{
			var urlReq:URLRequest;
			var fileRef:FileReference = new FileReference();
			fileName = "export_"+new Date()+".txt";
			try{
				fileRef.save(data,fileName);						
			}catch(err:*){
				Alert.show("Unable to download. Please try again");
			}
		}
		
		
		public static function doValidation(validationArray:Array):String{
			var validationResult:Array=Validator.validateAll(validationArray);
			var validationMsg:String = "";
			if(validationResult.length >0 ){
				validationMsg=(validationResult[0] as ValidationResultEvent).message;
			}
			return validationMsg;
		}
		
		public static function getFormattedDate(dateString:String):String{              
            var currentDF:DateFormatter = new DateFormatter();
            currentDF.formatString = "MM/DD/YYYY"
            return currentDF.format(dateString);
        }
		
		
		public static function exportToPdf(title:String,gridDataProvider:ArrayCollection,gridColumns:Array):ByteArray {
			if(gridDataProvider && gridDataProvider.length>0){
				var pdfColumns:Array = generatePdfColumns(gridColumns);
				var pdfData:ArrayCollection = getData(gridDataProvider,gridColumns);
				
				var pdf:PDF = PdfConstants.createPdf();
				
				writeHeader(pdf,title);
				
				var grid:Grid = new Grid(pdfData.toArray(), PdfConstants.GRID_WIDTH, PdfConstants.GRID_HEIGHT, 
					PdfConstants.HEADER_COLOR, PdfConstants.CELL_COLOR, PdfConstants.ALTERNATE_ROW_COLOR, 
					PdfConstants.BORDER_COLOR, PdfConstants.BORDER_ALPHA, PdfConstants.JOINTS, pdfColumns);
				
				pdf.addGrid(grid, 5, 5);
				
				return pdf.save(Method.LOCAL);
			}else{
				Alert.show("No data found to export!","Export To PDF");
				return null;
			}
		}
		
		private static function getData(gridDataProvider:ArrayCollection,columns:Array):ArrayCollection {
			var resultArr:ArrayCollection = new ArrayCollection();
			
			var numItems:uint = gridDataProvider.length;
			var numColumns:uint = columns.length;
			
			for (var i:int = 0; i < numItems; i++) {
				var item:Object = gridDataProvider.getItemAt(i);
				var resultItem:Object = {};
				
				for (var j:int = 0; j < numColumns; j++) {
					var column:DataGridColumn = columns[j];
					//var column:spark.components.gridClasses.GridColumn = columns[j];
					resultItem[j] = column.itemToLabel(item);
				}
				
				resultArr.addItem(resultItem);
			}
			
			return resultArr;
		}
		
		private static function generatePdfColumns(columns:Array):Array {
			var result:Array = [];
			var calculatedColumnWidth:int = (Size.A4.mmSize[1] - (PdfConstants.LEFT_MARGIN + PdfConstants.RIGHT_MARGIN)) / columns.length;
			
			var i:uint = 0;
			for each (var col:DataGridColumn in columns) {
				//	for each (var col:spark.components.gridClasses.GridColumn in columns) {
				result.push(new org.alivepdf.data.GridColumn(col.headerText, i.toString(), calculatedColumnWidth, PdfConstants.HEADER_ALIGN, PdfConstants.CELL_ALIGN));
				i++;
			}
			
			return result;
		}
		
		protected static function writeHeader(pdf:PDF,headername:String):void
		{
			
			var newFont:CoreFont = new CoreFont(FontFamily.HELVETICA);
			pdf.setFont(newFont, 12);
			/* var img:Image = new Image();
			img.source = "@Embed('../assets/images/muthalagu_logo2.jpg')";
			var image:ByteArray = ByteArray(img.source)
			pdf.addImageStream(image, ColorSpace.DEVICE_RGB, new org.alivepdf.layout.Resize(Mode.NONE,
			Position.LEFT),
			0, 0, 50, 20, 0, 1, 'Normal', null);
			pdf.addCell(80); */
			pdf.addCell(70, 10, headername, 0, 0, Align.CENTER);
			pdf.setFont(newFont, 7);
			pdf.newLine(5);
		//}
	}
	
	public static function dynamicCompGenerator(dynamicUIComp:UIComponentDetail):Object{
		switch(dynamicUIComp.uIComponentType){
			case "TEXT_INPUT":
				var formItem:TextInputFormItem = new TextInputFormItem();
				formItem.uiCompId = dynamicUIComp.uIComponentDetailId;
				formItem.label = dynamicUIComp.label+" :";
				return formItem
				break;
			case "ATTACHMENT":
				var docUploadComp:CustomDocAttachment = new CustomDocAttachment;
				docUploadComp.uiCompId = dynamicUIComp.uIComponentDetailId;
				docUploadComp.label = dynamicUIComp.label+" :";
				docUploadComp.docName = dynamicUIComp.docName;
				return docUploadComp;
				break;
		}
		return null;
	}
	
	
	
	
	}
}