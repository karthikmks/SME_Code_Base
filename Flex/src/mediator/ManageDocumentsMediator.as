package mediator
{
	import components.ManageDocuments;
	
	import flash.utils.ByteArray;
	
	import mx.controls.Alert;
	
	import org.puremvc.as3.multicore.interfaces.IMediator;
	import org.puremvc.as3.multicore.interfaces.INotification;
	import org.puremvc.as3.multicore.patterns.mediator.Mediator;
	
	import proxy.ManageDocumentsProxy;
	
	import util.SMEConstants;
	import util.SMEModel;
	
	import valueobject.DayBookVO;
	import valueobject.ManageDocumentsVO;

	public class ManageDocumentsMediator extends Mediator implements IMediator
	{
		public static const MEDIATOR_NAME:String = "ManageDocumentsMediator";
		
		private var _proxy:ManageDocumentsProxy;
		
		public function get docProxy():ManageDocumentsProxy{
			return _proxy;
		}
		
		public function set docProxy(value:ManageDocumentsProxy):void{
			_proxy = value;
		}
		
		public function get model():SMEModel{
			return SMEModel.getinstance();
		}
		
		public function get view():ManageDocuments{
			return viewComponent as ManageDocuments;
		}
		
		public function ManageDocumentsMediator(viewComponent:ManageDocuments){
			super(MEDIATOR_NAME, viewComponent);
		}
		
		override public function onRegister():void{
			super.onRegister();
		}
		
		override public function listNotificationInterests():Array{
			return [	
				SMEConstants.UPDATE_DAY_BOOK,
				SMEConstants.GET_HTML_FROM_EXCEL,
				SMEConstants.ON_GET_HTML_FROM_EXCEL,
				SMEConstants.SAVE_TEMP_FILES,
				SMEConstants.ADD_NEW_MANAGE_DOC,
				SMEConstants.ON_ADD_NEW_MANAGE_DOC
			]
		}
		
		override public function handleNotification(notification:INotification):void{
			var notifBody:Object = notification.getBody();
			 
			switch(notification.getName()){
				case SMEConstants.UPDATE_DAY_BOOK:
					var dayBook:DayBookVO = new DayBookVO;
					dayBook.createdBy = model.userProfileVO.employeeId as String;
					dayBook.branchId = model.userProfileVO.branchId;
					dayBook.dayBookWorkSheet = notifBody as ByteArray;
					docProxy.updateDayBook(dayBook);
					break;
				 
				case SMEConstants.ON_UPDATE_DAY_BOOK:
					if(notifBody!=null && Boolean(notifBody)==true){
						Alert.show("Successfully updated","Update Day Book");
						view.manageDayBook.clearAllFields();
					}else{
						Alert.show("Fail to update. Please try again.","Update Day Book");
					}
					break;
				
				case SMEConstants.GET_HTML_FROM_EXCEL:
					docProxy.getHTMLFromExcel(notifBody as ByteArray);
					break;
				
				case SMEConstants.ON_GET_HTML_FROM_EXCEL:
					if(notifBody!=null && String(notifBody)!=""){
						view.manageDayBook.showIFrame(String(notifBody));
					}else{
						Alert.show("Please check the file and try again."," Day Book Upload Error");
						view.manageDayBook.clearAllFields();
					}
					break;
				case SMEConstants.SAVE_TEMP_FILES:
					docProxy.saveFileInTempFolder(notifBody);
					break;
				case SMEConstants.ADD_NEW_MANAGE_DOC:
					docProxy.addNewMamagedDocuments(notifBody as ManageDocumentsVO);
					break;
				case SMEConstants.ON_ADD_NEW_MANAGE_DOC:
					if(notifBody == "SUCCESS"){
						Alert.show("Saved Successfully","Managed Documents");
						view.mfplAttachments.clearAllfields(null);
					}else{
						Alert.show("Saved failure, Please try again.","Managed Documents");
					}
					break;
			}
		}
	
	}
}