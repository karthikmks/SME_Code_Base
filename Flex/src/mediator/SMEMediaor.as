package mediator
{
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.core.IUITextField;
	import mx.events.CloseEvent;
	import org.puremvc.as3.multicore.interfaces.IMediator;
	import org.puremvc.as3.multicore.interfaces.INotification;
	import org.puremvc.as3.multicore.patterns.mediator.Mediator;
	
	import proxy.SMEProxy;
	
	import util.SMEConstants;
	import util.SMEModel;
	import valueobject.AppConfigurationVO;
	import valueobject.ApplicationComponentsDataVO;
	import valueobject.CustomerVO;
	import valueobject.BranchDetailsVO;
	import valueobject.UserProfileVO;
	import components.AddOrUpdateCustomer;
	
	public class SMEMediaor extends Mediator implements IMediator
	{
		public static const MEDIATOR_NAME:String = "SMEMediaor";
		
		private var _smeProxy:SMEProxy;
		private var isUpdateScreen:Boolean;
		
		public function get smeProxy():SMEProxy{
			return _smeProxy;
		}
		
		public function get model():SMEModel{
			return SMEModel.getinstance();
		}

		public function set smeProxy(value:SMEProxy):void{
			_smeProxy = value;
		}
		
		public function SMEMediaor(viewComponent:SME)
		{
			super(MEDIATOR_NAME, viewComponent);
		}
		
		override public function onRegister():void{
			super.onRegister();
		}
		
		override public function listNotificationInterests():Array{
			return [	
				SMEConstants.FACADE_STATRED,
				SMEConstants.LOAD_APPLN_COMP_META_DATA,
				SMEConstants.ON_SAVE_NEW_CUSTOMER_INFO,
				SMEConstants.UPDATE_FLOW_CUSTOMER_SEARCH,
				SMEConstants.ON_UPDATE_FLOW_CUSTOMER_SEARCH,
				SMEConstants.ON_APPLN_COMP_META_DATA,
				SMEConstants.GET_NEXT_AVAILABLE_CUST_ID,
				SMEConstants.ON_GET_NEXT_AVAILABLE_CUST_ID,
				SMEConstants.UPDATE_CUSTOMER_INFO,
				SMEConstants.ON_UPDATE_CUSTOMER_INFO,
				SMEConstants.UPDATE_FLOW_CUSTOMER_SELECTED,
				SMEConstants.SAVE_BRANCH_ENTITLEMENTS,
				SMEConstants.ON_SAVE_BRANCH_ENTITLEMENTS,
				SMEConstants.LINKED_OR_REFERRAL_CUSTOMER_SEARCH,
				SMEConstants.ON_LINKED_OR_REFERRAL_CUSTOMER_SEARCH,
				SMEConstants.ON_VALIDATE_USER_PROFILE,
				SMEConstants.VALIDATE_USER_PROFILE,
				SMEConstants.SEARCH_FLOW_CUSTOMER_SEARCH,
				SMEConstants.ON_SEARCH_FLOW_CUSTOMER_SEARCH,
				SMEConstants.SAVE_NEW_CUSTOMER_INFO	
			]
		}
		
		override public function handleNotification(notification:INotification):void{
			var notifBody:Object = notification.getBody();
			
			switch(notification.getName()){
				case SMEConstants.FACADE_STATRED:
					trace("FACADE_STATRED");
					break;
				
				case SMEConstants.LOAD_APPLN_COMP_META_DATA:
					model.branchDetails = new BranchDetailsVO;
					model.branchDetails.branchId = model.userProfileVO.branchId;
					smeProxy.getApplnCompMetaData(model.branchDetails);
					break;
				
				case SMEConstants.SAVE_NEW_CUSTOMER_INFO:
					smeProxy.saveNewCustomerInfo(CustomerVO(notifBody));
					break;
				
				case SMEConstants.ON_SAVE_NEW_CUSTOMER_INFO:
					if(notifBody!=null && Number(notifBody)!=0){
						if(Number(notifBody) == Number(model.manageCustomer.addNewCustomer.nextAvailCustomerId)){
							var alertMsg:String="Record Saved Successfully. <b>Customer ID: <b>"+model.manageCustomer.addNewCustomer.nextAvailCustomerId+"</b>";
							var alert:Alert = Alert.show(alertMsg,"Add New Customer");
							use namespace mx.core.mx_internal;
							IUITextField(alert.alertForm.textField).htmlText = alertMsg;
							//Alert.show("Record Saved Successfully Customer ID: "+model.manageCustomer.addNewCustomer.nextAvailCustomerId,"Add New Customer");
						}else{
							var alertMsg:String="Record Saved Successfully.<br>	 Please note Customer ID has been changed from <b>"+
										model.manageCustomer.addNewCustomer.nextAvailCustomerId+"</b> to <b>"+notifBody+"</b>";
							var alert:Alert = Alert.show(alertMsg,"Add New Customer");
							use namespace mx.core.mx_internal;
							IUITextField(alert.alertForm.textField).htmlText = alertMsg;
						}
						model.manageCustomer.addNewCustomer.clearAllfields();
					}else{
						Alert.show("Record Saved Failure, Please Try Again","Add New Customer");
					}
					break;
				
				case SMEConstants.UPDATE_CUSTOMER_INFO:
					smeProxy.updateCustomerDetail(CustomerVO(notifBody));
					break;
				
				case SMEConstants.ON_UPDATE_CUSTOMER_INFO:
					if(notifBody && Boolean(notifBody)==true){
						var alertMsg:String="Details Updated Successfully.<br><b> Customer ID: "+model.manageCustomer.updateCustomer.nextAvailCustomerId+"</b>";
						var alert:Alert = Alert.show(alertMsg,"Update Customer Details");
						use namespace mx.core.mx_internal;
						IUITextField(alert.alertForm.textField).htmlText = alertMsg;
						model.manageCustomer.updateCustomer.clearAllfields();
					}else{
						Alert.show("Details Updation Failure for Customer ID: "+model.manageCustomer.updateCustomer.nextAvailCustomerId,"Update Customer Details");
					}
					break;
					
				
				case SMEConstants.UPDATE_FLOW_CUSTOMER_SEARCH:
					smeProxy.searchCustomer(CustomerVO(notifBody));
					break;
				
				case SMEConstants.ON_UPDATE_FLOW_CUSTOMER_SEARCH:
					if(notifBody!=null){
						var customerList:ArrayCollection = notifBody as ArrayCollection;
						if(customerList.length == 0){
							//Alert.show("No Customer Found for ID/Name: "+model.manageCustomer.updateCustomer.custSearchWidget.customerSearchValue,"Search Customer");
							Alert.show("No Customer Found for ID/Name: \nPlease modify your search criteria" ,"Search Customer");
						}else if(model.manageCustomer.updateCustomer.custSearchWidget.selectCustomerPopUpWindow!=null){
							//Alert.show("Cont 1: ");
							model.manageCustomer.updateCustomer.custSearchWidget.selectCustomerPopUpWindow.setSearchResultData(customerList);
						}else if(customerList.length == 1){
							//Alert.show("Cont 2: ");
							model.manageCustomer.updateCustomer.setCustomerInfo(CustomerVO(customerList.getItemAt(0)));
						}else{
							//Alert.show("Cont 3: ");
							model.manageCustomer.updateCustomer.custSearchWidget.launchSelectCustomerPopUp(customerList);	
						}
					}else{
						Alert.show("No Customer Found","Search Customer");
					}
					break;
				
				case SMEConstants.UPDATE_FLOW_CUSTOMER_SELECTED:
					model.manageCustomer.updateCustomer.setCustomerInfo(CustomerVO(notifBody));
					break;
					
				case SMEConstants.ON_APPLN_COMP_META_DATA:
                    if(notifBody){
				        model.appCompMetaData = ApplicationComponentsDataVO(notifBody);
                    }
                    break;
				
				case SMEConstants.GET_NEXT_AVAILABLE_CUST_ID:
                    smeProxy.getNextAvailableCustId();
                    break;
               
                case SMEConstants.ON_GET_NEXT_AVAILABLE_CUST_ID:
                    if(notifBody!=null && Number(notifBody)!=0){
                        model.manageCustomer.addNewCustomer.nextAvailCustomerId = String(notifBody);
                    }else{
                        Alert.show("Error Occurred, Pleae Try Again","Error");
                    }
                    break;
				case SMEConstants.SAVE_BRANCH_ENTITLEMENTS:
					smeProxy.saveBranchEntitlements(AppConfigurationVO(notifBody));
					break;
				
				case SMEConstants.ON_SAVE_BRANCH_ENTITLEMENTS:
					if(notifBody && Boolean(notifBody)==true){
						Alert.show("Entitlements Saved Successfully","Add Entitlement To Branch");
						model.manageEntitlments.addEnmtToBranch.clearAllfields();
					}else{
						Alert.show("Entitlements Saved Failure","Add Entitlement To Branch");
					}
					break;
				
				case SMEConstants.LINKED_OR_REFERRAL_CUSTOMER_SEARCH:
                    isUpdateScreen = notifBody.isUpdateFlow as Boolean;
                    smeProxy.searchLinkedCustomer(CustomerVO(notifBody.customerVo));
                    break;
               
                case SMEConstants.ON_LINKED_OR_REFERRAL_CUSTOMER_SEARCH:
					if(notifBody!=null){
                        var customerList:ArrayCollection = notifBody as ArrayCollection;
					    if(isUpdateScreen){
							selectCustomer(model.manageCustomer.updateCustomer, customerList);
                        }else{
							selectCustomer(model.manageCustomer.addNewCustomer, customerList);
                        }
                    } 
                    break;
					
				case SMEConstants.VALIDATE_USER_PROFILE:
					/*var userProfileVO:UserProfileVO = new UserProfileVO;
					userProfileVO.role = 'ADMIN';
					userProfileVO.branchId = "1";
					model.userProfileVO = userProfileVO;*/
                    smeProxy.validateUserProfile(UserProfileVO(notifBody));
                    break;
               
                case SMEConstants.ON_VALIDATE_USER_PROFILE:
                    if(notifBody && notifBody as UserProfileVO){
                        model.userProfileVO = notifBody as UserProfileVO;
						viewComponent.homeWindowStack.selectedIndex = 1;
                    }else{
                        viewComponent.login.showInvalidCredencials(true);
                    }
                    break;
				
				case SMEConstants.SEARCH_FLOW_CUSTOMER_SEARCH:
					smeProxy.searchFlowCustomerSearch(CustomerVO(notifBody));
					break;
				
				case SMEConstants.ON_SEARCH_FLOW_CUSTOMER_SEARCH:
					if(notifBody!=null){
						var customerList:ArrayCollection = notifBody as ArrayCollection;
						model.manageCustomer.searchCustomer.customerGrid.setSearchResultData(customerList);
					}else{
						Alert.show("No Customer Found","Search Customer");
					}
					break;
			}
		}

		private function selectCustomer(customer:AddOrUpdateCustomer, customerList:ArrayCollection):void {
			if(customerList.length == 1 && customer.linkedCustomerPopUpWindow == null){
				var temp:String = String(CustomerVO(customerList.getItemAt(0)).customerId)  + "-" + CustomerVO(customerList.getItemAt(0)).customerName;
				Alert.show("Successfully retrieved the customer id\n" + temp, "Referral Customer",Alert.OK, null,
				function resetConfirmHandler(event:CloseEvent):void {
				// Check to see if the OK button was pressed.
				if (event.detail==Alert.OK) {
					customer.setLinkedCustomerId(String(CustomerVO(customerList.getItemAt(0)).customerId));
				} }, null, Alert.NO);                                
			} else {
				if(customerList.length < 1 && customer.linkedCustomerPopUpWindow == null) {
					customer.setLinkedCustomerId("");
					Alert.show("No customer found.\nPlease refine further your search.", "Referral Customer",Alert.OK, null,
					function resetConfirmHandler(event:CloseEvent):void {
					// Check to see if the OK button was pressed.
					if (event.detail==Alert.OK) {
						customer.launchLinkedCustomerPopUp(customerList);   
					} }, null, Alert.NO);
				} else if(customerList.length > 1 && customer.linkedCustomerPopUpWindow == null) {
					customer.setLinkedCustomerId("");
					Alert.show("Please refine further your search.", "Referral Customer",Alert.OK, null,
					function resetConfirmHandler(event:CloseEvent):void {
					// Check to see if the OK button was pressed.
					if (event.detail==Alert.OK) {
						customer.launchLinkedCustomerPopUp(customerList);   
					} }, null, Alert.NO);									
				} else {
					customer.linkedCustomerPopUpWindow.setSearchResultData(customerList);
				}
			}	
		}
	}
}