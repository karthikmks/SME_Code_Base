package proxy
{
	import components.LoadingMask;
	
	import flash.events.Event;
	import flash.utils.ByteArray;
	
	import mx.controls.Alert;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;
	
	import util.SMEConstants;
	
	import valueobject.DayBookVO;

	public class ManageDocumentsProxy extends BaseProxy
	{
		public static const PROXY_NAME:String = "ManageDocumentsProxy";
		
	
		public function ManageDocumentsProxy()
		{
			super(PROXY_NAME);
		}
		private static var popCounter:int=0;
		
		private static function showLoadingMask():void {
			if(popCounter<1){
				LoadingMask.show();
			}
			popCounter++;	
		}
		
		private static function closeLoadingMask():void {
			if(popCounter >0)
				popCounter--;
			if(popCounter==0){
				LoadingMask.hide();
			}	
			trace("popCounter"+popCounter)
		}

		
		public function updateDayBook(prams:DayBookVO):void{
			showLoadingMask();
			createRPCRequest("updateDayBook", onUpdateDayBook).send(prams);
		}
		private function onUpdateDayBook(e:Event):void{
			closeLoadingMask();
			e.target.removeEventListener("result",onUpdateDayBook);
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onUpdateDayBook);
				sendNotification(SMEConstants.ON_UPDATE_DAY_BOOK, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function getHTMLFromExcel(prams:ByteArray):void{
			showLoadingMask();
			createRPCRequest("getHTMLFromExcel", onGetHTMLFromExcel).send(prams);
		}
		private function onGetHTMLFromExcel(e:Event):void{
			closeLoadingMask();
			e.target.removeEventListener("result",onGetHTMLFromExcel);
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onGetHTMLFromExcel);
				sendNotification(SMEConstants.ON_GET_HTML_FROM_EXCEL, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
	}
}