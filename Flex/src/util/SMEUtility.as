package util
{
	import flash.net.FileReference;
	import flash.net.URLRequest;
	import mx.formatters.DateFormatter;
	
	import mx.collections.ArrayCollection;
	import mx.collections.CursorBookmark;
	import mx.collections.IList;
	import mx.collections.IViewCursor;
	import mx.collections.XMLListCollection;
	import mx.controls.Alert;
	import mx.controls.DataGrid;
	import mx.controls.dataGridClasses.DataGridColumn;
	import mx.events.ValidationResultEvent;
	import mx.validators.Validator;
	
	public class SMEUtility
	{
		public function SMEUtility()
		{
		}
		
		public static function exportCSV(dg:DataGrid, csvSeparator:String="|", lineSeparator:String="\n"):String
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
			fileName = "export_"+new Date().toDateString()+".txt";
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
	}
}