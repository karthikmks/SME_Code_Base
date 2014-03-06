package proxy
{
	import components.BusyCursorPopup;
	import components.LoadingMask;
	
	import flash.display.DisplayObject;
	import flash.events.Event;
	
	import mx.controls.Alert;
	import mx.core.Application;
	import mx.core.FlexGlobals;
	import mx.managers.PopUpManager;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;
	
	import util.SMEConstants;
	
	import valueobject.CustomerVO;
	import valueobject.RequestVO;
	import valueobject.BranchDetailsVO;

	public class ManageLoansProxy extends BaseProxy
	{
		public static const PROXY_NAME:String = "ManageLoansProxy";
		public function ManageLoansProxy()
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
		
		
		public function getLoanMetaData(branchDetailVO:BranchDetailsVO):void{
			showLoadingMask();
			createRPCRequest("retrieveApplicationComponentsData", onGetLoanMetaData).send(branchDetailVO);
		}
		
		private function onGetLoanMetaData(e:Event):void{
			closeLoadingMask();
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onGetLoanMetaData);
				sendNotification(SMEConstants.ON_LOAN_META_DATA, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				e.target.removeEventListener("result",onGetLoanMetaData);
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function saveAddNewLoanData(prams:Object):void{
			showLoadingMask();
			createRPCRequest("addNewJewelLoanDetails", onSaveAddNewLoanData).send(prams);
		}
		
		private function onSaveAddNewLoanData(e:Event):void{
			closeLoadingMask();
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onSaveAddNewLoanData);
				sendNotification(SMEConstants.ON_SAVE_RESPONSE, true);
			}
			else if (e is FaultEvent){
				e.target.removeEventListener("result",onSaveAddNewLoanData);
				sendNotification(SMEConstants.ON_SAVE_RESPONSE, false);
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function searchCustomer(prams:CustomerVO):void{
			showLoadingMask();
			createRPCRequest("searchCustomer", onSearchCustomer).send(prams);
		}
		private function onSearchCustomer(e:Event):void{
			closeLoadingMask();
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onSearchCustomer);
				sendNotification(SMEConstants.SEARCH_CUSTOMER_RESPONSE, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				e.target.removeEventListener("result",onSearchCustomer);
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function getNewLoanNumber(prams:RequestVO):void{
			showLoadingMask();
			createRPCRequest("addLoan", onGetNewLoanNumber).send(prams);
		}
		private function onGetNewLoanNumber(e:Event):void{
			closeLoadingMask();
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onGetNewLoanNumber);
				sendNotification(SMEConstants.ON_GET_NEW_LOAN_NUMBER, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				e.target.removeEventListener("result",onGetNewLoanNumber);
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function searchLoan(prams:RequestVO):void{
            showLoadingMask();
            createRPCRequest("searchLoans", onSearchLoan).send(prams);
        }
        private function onSearchLoan(e:Event):void{
            closeLoadingMask();
            if (e is ResultEvent){
                e.target.removeEventListener("fault",onSearchLoan);
                sendNotification(SMEConstants.ON_SEARCH_LOAN, (e as ResultEvent).result);
            }
            else if (e is FaultEvent){
                e.target.removeEventListener("result",onSearchLoan);
                Alert.show("Error Message: "+(e as FaultEvent).message);
            }           
        }
		
		
	}
}