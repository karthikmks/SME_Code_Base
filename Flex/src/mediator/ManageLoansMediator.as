package mediator
{
	import components.ManageLoans;
	
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.utils.ObjectUtil;
	
	import org.puremvc.as3.multicore.interfaces.IMediator;
	import org.puremvc.as3.multicore.interfaces.INotification;
	import org.puremvc.as3.multicore.patterns.mediator.Mediator;
	
	import proxy.ManageLoansProxy;
	
	import util.SMEConstants;
	import util.SMEModel;
	
	import valueobject.AppComponentVO;
	import valueobject.ApplicationComponentsDataVO;
	import valueobject.CustomerVO;
	import valueobject.JewelLoanTransactionVO;
	import valueobject.JewelLoanTypeVO;
	import valueobject.JewelSchemeVO;
	import valueobject.RequestVO;
	import valueobject.ResponseVO;

	public class ManageLoansMediator extends Mediator implements IMediator
	{
		public static const MEDIATOR_NAME:String = "ManageLoansMediator";
		
		public var manageLoansProxy:ManageLoansProxy;
		private var view:ManageLoans;
		private var appCompMetaData:ApplicationComponentsDataVO = model.appCompMetaData;
		
		public function ManageLoansMediator(viewComponent:ManageLoans)
		{
			super(MEDIATOR_NAME, viewComponent);
			view = viewComponent;
		}
		
		public function get model():SMEModel{
			return SMEModel.getinstance();
		}
		
		override public function onRegister():void{
			super.onRegister();
		}
		
		override public function listNotificationInterests():Array{
			return [	
				SMEConstants.ON_LOAN_META_DATA,	
				SMEConstants.ON_SAVE_RESPONSE,
				SMEConstants.SEARCH_CUSTOMER_RESPONSE,
				SMEConstants.CUSTOMER_SELECTED,
				SMEConstants.SAVE_NEW_JEWEL_LOAN,
				SMEConstants.SEARCH_CUSTOMER,
				SMEConstants.GET_NEW_LOAN_NUMBER,
				SMEConstants.ON_GET_NEW_LOAN_NUMBER,
				SMEConstants.SEARCH_LOAN,
				SMEConstants.ON_SEARCH_LOAN,
				SMEConstants.LOAD_NEW_LOAN_META_DATA
			]
		}
		
		override public function handleNotification(notification:INotification):void{
			var notifBody:Object = notification.getBody();
			
			switch(notification.getName()){
				case SMEConstants.LOAD_NEW_LOAN_META_DATA:
					/*if(appCompMetaData==null){
						manageLoansProxy.getLoanMetaData();
					}else{*/
						setAddNewLoanMetaData();
					//}
					break;
				case SMEConstants.ON_LOAN_META_DATA:
					//Alert.show("Receive Datas: "+notifBody);
					if(notifBody!=null && view.addNewLoan!=null){
						appCompMetaData = notifBody as ApplicationComponentsDataVO;
						setAddNewLoanMetaData();
					}else{
						appCompMetaData = notifBody as ApplicationComponentsDataVO;
					}
					break;
				
				case SMEConstants.ON_SAVE_RESPONSE:
					if(notifBody!=null){
						var result:Boolean = notifBody as Boolean;
						if(result == true){
							Alert.show("Record Saved Successfully for Loan#: "+view.addNewLoan.loanNumberStr,"Add New Loan");
							view.addNewLoan.clearAllfields();
						}else{
							Alert.show("Record Not Saved","Add New Loan");
						}
					}
					break;
				
				case SMEConstants.SEARCH_CUSTOMER:
					//Alert.show("SEARCH_CUSTOMER: "+notifBody);
					manageLoansProxy.searchCustomer(notifBody as CustomerVO);
					break;
				
				case SMEConstants.SEARCH_CUSTOMER_RESPONSE:
					if(notifBody!=null){
						var customerList:ArrayCollection = notifBody as ArrayCollection;
						if(customerList.length==0){
							//Alert.show("No Customer Found for ID/Name: "+view.addNewLoan.enteredCustomerId,"Search Customer");
							Alert.show("No Customer Found for ID/Name: \nPlease modify your search criteria" , "Search Customer");
						}else if(view.addNewLoan.selectCustomerPopUpWindow!=null){
							view.addNewLoan.selectCustomerPopUpWindow.setSearchResultData(customerList);
						}else if(customerList.length == 1){
							view.addNewLoan.setCustomerInfo(CustomerVO(customerList.getItemAt(0)));
						}else{
							view.addNewLoan.launchSelectCustomerPopUp(customerList);
						}
					}
					break;
				
				case SMEConstants.CUSTOMER_SELECTED:
					view.addNewLoan.setCustomerInfo(notifBody as CustomerVO);
					break;
				
				case SMEConstants.SAVE_NEW_JEWEL_LOAN:
					manageLoansProxy.saveAddNewLoanData(notifBody);	
					break;
					
				case SMEConstants.GET_NEW_LOAN_NUMBER:
					manageLoansProxy.getNewLoanNumber(notifBody as RequestVO);	
					break;
				
				case SMEConstants.ON_GET_NEW_LOAN_NUMBER:
					view.addNewLoan.newLoanNum = Number(notifBody);	
					break;
					
				case SMEConstants.SEARCH_LOAN: 
                    manageLoansProxy.searchLoan(RequestVO(notifBody));   
                    break;
               
                case SMEConstants.ON_SEARCH_LOAN:
                    if(notifBody!=null && notifBody as ResponseVO){
                        if(ResponseVO(notifBody).status != SMEConstants.STATUS_OK){
                            var arrColl:ArrayCollection = ResponseVO(notifBody).responseData;
                            view.searchLoan.loanSearchGrid.setSearchResultData(arrColl);
                        }else{
                            Alert.show("No Record Found. PLease Try With Different Filter","Search Loan");
                        }
                    }else{
                        Alert.show("No Record Found. PLease Try With Different Filter","Search Loan");
                    }
                    break;
			}
		}
		
		private function setAddNewLoanMetaData():void{
			if(appCompMetaData!=null && view!=null && view.addNewLoan!=null &&view.addNewLoan.schemeCmb!=null){
				view.addNewLoan.schemeCmb.dataProvider = appCompMetaData.jewelSchemes;
				view.addNewLoan.loanModeCmb.dataProvider = appCompMetaData.jewelLoanModes;
			
				view.addNewLoan.takeoverFromCmb.dataProvider = appCompMetaData.jewelTakeOverFrom;
				view.addNewLoan.repaymentTypeCmb.dataProvider = appCompMetaData.paymentTypes;
				view.addNewLoan.loanDeatilGrid.loanJewelCategoryCmb.dataProvider = appCompMetaData.jewelCategories;
				view.addNewLoan.loanDeatilGrid.loanJewelTypeCmb.dataProvider = view.addNewLoan.loanDeatilGrid.loanJewelCategoryCmb.selectedItem.jewelCategoryTypes;
				view.addNewLoan.loanDeatilGrid.loanQualityCmb.dataProvider = appCompMetaData.jewelQualities;
				
				view.addNewLoan.loanTypeCmb.dataProvider = appCompMetaData.jewelLoanTypes;
				
				view.addNewLoan.schemeCmb_changeHandler(null);
				
				//to get new loan number
				//view.addNewLoan.loanType_clickHandler(null);
				
				//view.addNewLoan.loanTypeCmb.dataProvider = applyFilterOnLoanType(appCompMetaData.jewelLoanTypes);
			}
		}
		private function applyFilterOnLoanType(arrColl:ArrayCollection):ArrayCollection{
			var loanTypeList:ArrayCollection = ObjectUtil.copy(arrColl) as ArrayCollection;
			if(loanTypeList && loanTypeList.length>0 && model.appCompMetaData.branchConfigData!=null){
				for each(var appCompVO:AppComponentVO in model.appCompMetaData.branchConfigData.componentList){
					if(appCompVO.componentId ==  SMEConstants.ADD_LOAN_TYPE_COMP_ID){
						if(appCompVO.possibleValues!=null && appCompVO.possibleValues!=""){
							var possibleIds:Array = appCompVO.possibleValues.split(",");
							for each(var loanTypeVO:JewelLoanTypeVO in arrColl){
								if(possibleIds.indexOf(loanTypeVO.jewelLoanTypeId)!=-1){
									loanTypeList.removeItemAt(loanTypeList.getItemIndex(loanTypeVO));
								}
							}
						}
					}
					if(appCompVO.componentId == SMEConstants.DOC_SERVICE_TAX_CHARGES_ID){
						view.addNewLoan.ALNCHG.visible = false;
					}
				}
			}
			return loanTypeList;
		}
	}
}