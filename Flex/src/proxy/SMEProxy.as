package proxy
{
	import components.LoadingMask;
	
	import flash.events.Event;
	
	import mx.controls.Alert;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;
	
	import org.puremvc.as3.multicore.interfaces.IProxy;
	import org.puremvc.as3.multicore.patterns.proxy.Proxy;
	
	import util.SMEConstants;
	
	import valueobject.AppConfigurationVO;
	import valueobject.CustomerVO;
	import valueobject.BranchDetailsVO;
	import valueobject.UserProfileVO;
	
	public class SMEProxy extends BaseProxy
	{
		public static const PROXY_NAME:String = "SMEProxy";
		
		public function SMEProxy()
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
		
		
		public function saveNewCustomerInfo(params:CustomerVO):void{
			showLoadingMask();
			createRPCRequest("addNewCustomer", onSaveNewCustomerInfo).send(params);
		}
		
		private function onSaveNewCustomerInfo(e:Event):void{
			closeLoadingMask();
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onSaveNewCustomerInfo);
				sendNotification(SMEConstants.ON_SAVE_NEW_CUSTOMER_INFO, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				e.target.removeEventListener("result",onSaveNewCustomerInfo);
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function updateCustomerDetail(params:CustomerVO):void{
			showLoadingMask();
			createRPCRequest("updateCustomerDetail", onUpdateCustomerDetail).send(params);
		}
		
		private function onUpdateCustomerDetail(e:Event):void{
			closeLoadingMask();
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onUpdateCustomerDetail);
				sendNotification(SMEConstants.ON_UPDATE_CUSTOMER_INFO, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				e.target.removeEventListener("result",onUpdateCustomerDetail);
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function searchCustomer(prams:CustomerVO):void{
			showLoadingMask();
			createRPCRequest("searchCustomer", onSearchCustomer).send(prams);
		}
		private function onSearchCustomer(e:Event):void{
			closeLoadingMask();
			e.target.removeEventListener("result",onSearchCustomer);
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onSearchCustomer);
				sendNotification(SMEConstants.ON_UPDATE_FLOW_CUSTOMER_SEARCH, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function getApplnCompMetaData(branchDetailVO:BranchDetailsVO):void{
            showLoadingMask();
            createRPCRequest("retrieveApplicationComponentsData", onApplnCompMetaData).send(branchDetailVO);
        }
        private function onApplnCompMetaData(e:Event):void{
            closeLoadingMask();
            if (e is ResultEvent){
                e.target.removeEventListener("fault",onApplnCompMetaData);
                sendNotification(SMEConstants.ON_APPLN_COMP_META_DATA, (e as ResultEvent).result);
            }
            else if (e is FaultEvent){
                e.target.removeEventListener("result",onApplnCompMetaData);
                Alert.show("Error Message: "+(e as FaultEvent).message);
            }           
        }
		
		public function getNextAvailableCustId():void{
            showLoadingMask();
            createRPCRequest("getNextAvailableCustId", onNextAvailableCustId).send();
        }
		
        private function onNextAvailableCustId(e:Event):void{
            closeLoadingMask();
            if (e is ResultEvent){
                e.target.removeEventListener("fault",onNextAvailableCustId);
                sendNotification(SMEConstants.ON_GET_NEXT_AVAILABLE_CUST_ID, (e as ResultEvent).result);
            }
            else if (e is FaultEvent){
                e.target.removeEventListener("result",onNextAvailableCustId);
                Alert.show("Error Message: "+(e as FaultEvent).message);
            }           
        }
		public function saveBranchEntitlements(appConfigVO:AppConfigurationVO):void{
			showLoadingMask();
			createRPCRequest("saveBranchEntitlements", onSaveBranchEntitlements).send(appConfigVO);
		}
		private function onSaveBranchEntitlements(e:Event):void{
			closeLoadingMask();
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onSaveBranchEntitlements);
				sendNotification(SMEConstants.ON_SAVE_BRANCH_ENTITLEMENTS, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				e.target.removeEventListener("result",onSaveBranchEntitlements);
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
		
		public function searchLinkedCustomer(prams:CustomerVO):void{
            showLoadingMask();
            createRPCRequest("searchCustomer", onSearchLinkedCustomer).send(prams);
        }
        private function onSearchLinkedCustomer(e:Event):void{
            closeLoadingMask();
			e.target.removeEventListener("result",onSearchLinkedCustomer);
            if (e is ResultEvent){
                e.target.removeEventListener("fault",onSearchLinkedCustomer);
                sendNotification(SMEConstants.ON_LINKED_OR_REFERRAL_CUSTOMER_SEARCH, (e as ResultEvent).result);
            }
            else if (e is FaultEvent){
                Alert.show("Error Message: "+(e as FaultEvent).message);
            }           
        }
		
		public function validateUserProfile(prams:UserProfileVO):void{
            showLoadingMask();
            createRPCRequest("validateUser", onValidateUserProfile).send(prams);
        }
        private function onValidateUserProfile(e:Event):void{
            closeLoadingMask();
            if (e is ResultEvent){
                e.target.removeEventListener("fault",onValidateUserProfile);
                sendNotification(SMEConstants.ON_VALIDATE_USER_PROFILE, (e as ResultEvent).result);
            }
            else if (e is FaultEvent){
                e.target.removeEventListener("result",onValidateUserProfile);
                Alert.show("Error Message: "+(e as FaultEvent).message);
            }           
        }
		
		
		public function searchFlowCustomerSearch(prams:CustomerVO):void{
			showLoadingMask();
			createRPCRequest("searchCustomer", onSearchFlowCustomerSearch).send(prams);
		}
		private function onSearchFlowCustomerSearch(e:Event):void{
			closeLoadingMask();
			e.target.removeEventListener("result",onSearchFlowCustomerSearch);
			if (e is ResultEvent){
				e.target.removeEventListener("fault",onSearchFlowCustomerSearch);
				sendNotification(SMEConstants.ON_SEARCH_FLOW_CUSTOMER_SEARCH, (e as ResultEvent).result);
			}
			else if (e is FaultEvent){
				Alert.show("Error Message: "+(e as FaultEvent).message);
			}			
		}
	}
}