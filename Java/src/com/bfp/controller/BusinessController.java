package com.bfp.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.bfp.services.AuthenticationService;
import com.bfp.services.DatabaseService;
import com.bfp.services.EntitlementService;
import com.bfp.services.UserProfileManager;
import com.bfp.valueobjects.AppConfigurationVO;
import com.bfp.valueobjects.ApplicationComponentsDataVO;
import com.bfp.valueobjects.BranchDetailsVO;
import com.bfp.valueobjects.CustomerVO;
import com.bfp.valueobjects.DepositLoanAccountHoldersVO;
import com.bfp.valueobjects.DepositLoanInterestPeriodVO;
import com.bfp.valueobjects.DepositLoanTransactionVO;
import com.bfp.valueobjects.DepositPlaceVO;
import com.bfp.valueobjects.EmployeeVO;
import com.bfp.valueobjects.EntitlementsVO;
import com.bfp.valueobjects.JewelLoanTransactionVO;
import com.bfp.valueobjects.JewelMasterVO;
import com.bfp.valueobjects.JewelSchemeVO;
import com.bfp.valueobjects.JewelTakeOverFromVO;
import com.bfp.valueobjects.PaymentTransactionVO;
import com.bfp.valueobjects.ReportInputParamsVO;
import com.bfp.valueobjects.RequestVO;
import com.bfp.valueobjects.ResponseVO;
import com.bfp.valueobjects.SearchRequestVO;
import com.bfp.valueobjects.SearchResponseVO;
import com.bfp.valueobjects.TempVO;
import com.bfp.valueobjects.UserProfileVO;
/**
 * @author tiruppathir
 *
 */
public class BusinessController extends MultiActionController {

	/**
	 * 
	 */
	private static final Log log = LogFactory.getLog(BusinessController.class);
	/**
	 * 
	 */
	private DatabaseService databaseService;
	/**
	 * 
	 */
	private UserProfileManager userProfileManager;
	/**
	 * 
	 */
	private EntitlementService entitlementService;
	/**
	 * 
	 */
	private AuthenticationService authenticationService;

	/**
	 * @return the userProfileManager
	 */
	public UserProfileManager getUserProfileManager() {
		return userProfileManager;
	}

	/**
	 * @param userProfileManager the userProfileManager to set
	 */
	public void setUserProfileManager(UserProfileManager userProfileManager) {
		this.userProfileManager = userProfileManager;
	}

	/**
	 * @return the entitlementService
	 */
	public EntitlementService getEntitlementService() {
		return entitlementService;
	}

	/**
	 * @param entitlementService the entitlementService to set
	 */
	public void setEntitlementService(EntitlementService entitlementService) {
		this.entitlementService = entitlementService;
	}

	/**
	 * @return the authenticationService
	 */
	public AuthenticationService getAuthenticationService() {
		return authenticationService;
	}

	/**
	 * @param authenticationService the authenticationService to set
	 */
	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}	

	/**
	 * @param userId
	 * @return
	 */
	public UserProfileVO retrieveUserProfile(String userId) throws Exception {
		log.info("Method entry : BusinessController.retrieveUserProfile");
		return databaseService.retrieveUserDetails(userId);
		//return userProfileManager.retrieveUserProfile(userId);
	}	
	
	/**
	 * @return
	 * @throws Exception
	 */
	public JewelMasterVO getJewelMaster() throws Exception {
		log.info("Method entry : BusinessController.getJewelMaster");
		return databaseService.getJewelMaster();
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public ApplicationComponentsDataVO retrieveApplicationComponentsData(BranchDetailsVO branchDetailVO) throws Exception {
		log.info("Method entry : BusinessController.retrieveApplicationComponentsData");
		return databaseService.retrieveApplicationComponentsData(branchDetailVO);
	}

	/**
	 * @return the databaseService
	 */
	public DatabaseService getDatabaseService() {
		return databaseService;
	}

	/**
	 * @param databaseService the databaseService to set
	 */
	public void setDatabaseService(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}
	
	/**
	 * @return
	 */
	public List<JewelSchemeVO> addJewelScheme(JewelSchemeVO jewelScheme) throws Exception {
		log.info("Method entry : BusinessController.addNewJewelScheme " + jewelScheme);
		return databaseService.addJewelScheme(jewelScheme);
	}
	
	/**
	 * @return
	 */
	public List<JewelTakeOverFromVO> addTakeOverFrom(JewelTakeOverFromVO jewelTakeOverFromVO) throws Exception {
		log.info("Method entry : BusinessController.addTakeOverFrom " + jewelTakeOverFromVO);
		return databaseService.addTakeOverFrom(jewelTakeOverFromVO);
	}
	
	/**
	 * @return
	 */
	public List<DepositPlaceVO> addDepositPlace(DepositPlaceVO depositPlaceVO) throws Exception {
		log.info("Method entry : BusinessController.addDepositPlace " + depositPlaceVO);
		return databaseService.addDepositPlace(depositPlaceVO);
	}
	
	/**
	 * @return
	 */
	public List<DepositLoanAccountHoldersVO> addDepositAccountHolderName(DepositLoanAccountHoldersVO depositLoanAccountHoldersVO) throws Exception {
		log.info("Method entry : BusinessController.addDepositAccountHolderName " + depositLoanAccountHoldersVO);
		return databaseService.addDepositAccountHolderName(depositLoanAccountHoldersVO);
	}
	
	/**
	 * @return
	 */
	public List<DepositLoanInterestPeriodVO> addDepositLoanInterestPeriod(DepositLoanInterestPeriodVO depositLoanInterestPeriodVO) throws Exception {
		log.info("Method entry : BusinessController.addDepositLoanInterestPeriod " + depositLoanInterestPeriodVO);
		return databaseService.addDepositLoanInterestPeriod(depositLoanInterestPeriodVO);
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	/*public int addNewJewelLoan() throws Exception {
		log.info("Method entry : BusinessController.addNewJewelLoan");
		return databaseService.addNewJewelLoan();
	}*/
	
	/**
	 * @return
	 * @throws Exception
	 */
	public boolean addNewJewelLoanDetails(JewelLoanTransactionVO jewelLoanTransactionVO) throws Exception {
		log.info("Method entry : BusinessController.addNewJewelLoanDetails " + jewelLoanTransactionVO);
		return databaseService.addNewJewelLoanDetails(jewelLoanTransactionVO);
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<PaymentTransactionVO> addLoanInterestPayment(PaymentTransactionVO paymentTransactionVO) throws Exception {
		log.info("Method entry : BusinessController.addLoanInterestPayment " + paymentTransactionVO);
		return databaseService.addLoanInterestPayment(paymentTransactionVO);
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public int addNewDepositLoan() throws Exception {
		log.info("Method entry : BusinessController.addNewDepositLoan");
		return databaseService.addNewDepositLoan();
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public boolean addNewDepositLoanDetails(DepositLoanTransactionVO depositLoanTransaction) throws Exception {
		log.info("Method entry : BusinessController.addNewDepositLoanDetails " + depositLoanTransaction);
		return databaseService.addNewDepositLoanDetails(depositLoanTransaction);
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public SearchResponseVO performLoanNoSearch(SearchRequestVO searchRequestVO) throws Exception {
		log.info("Method entry : BusinessController.performLoanNoSearch " + searchRequestVO);
		return databaseService.performLoanNoSearch(searchRequestVO);
	}
	
	/**
	 * @param userProfileVO
	 * @return
	 * @throws Exception
	 */
	public UserProfileVO validateUser(UserProfileVO userProfileVO) throws Exception {
		log.info("Method entry : BusinessController.validateUser " + userProfileVO);
		return databaseService.validateUser(userProfileVO);
	}
	
	/**
	 * @param branchDetailsVO
	 * @return
	 * @throws Exception
	 */
	public boolean configureBranch(BranchDetailsVO branchDetailsVO) throws Exception {
		log.info("Method entry : BusinessController.configureBranch " + branchDetailsVO);
		return databaseService.configureBranch(branchDetailsVO);
	}
	
	/**
	 * @param employee
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeVO> updateEmployeeDetails(EmployeeVO employee) throws Exception {
		log.info("Method entry : BusinessController.updateEmployeeDetails " + employee);
		databaseService.updateEmployeeDetails(employee);
		return fetchEmployees(); 
	}
	
	/**
	 * @param employee
	 * @return
	 * @throws Exception
	 */
	public int addNewEmployee() throws Exception {
		log.info("Method entry : BusinessController.addNewEmployee " );
		return databaseService.addNewEmployee();
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeVO> fetchEmployees() throws Exception {
		log.info("Method entry : BusinessController.fetchEmployees " );
		return databaseService.fetchEmployees();
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public BranchDetailsVO getBranchDetails() throws Exception {
		log.info("Method entry : BusinessController.getBranchDetails " );
		return databaseService.getBranchDetails(new BranchDetailsVO());
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<EntitlementsVO> getUserEntitlements() throws Exception {
		log.info("Method entry : BusinessController.getUserEntitlements " );
		return databaseService.getEntitlements();
	}
	
	/**
	 * @param searchRequestVO
	 * @return
	 * @throws Exception
	 */
	public ResponseVO releaseLoan(SearchRequestVO searchRequestVO) throws Exception {
		log.info("Method entry : BusinessController.releaseLoan " );
		return databaseService.releaseLoan(searchRequestVO);
	}
	
	public List<ResponseVO> generateReport(ReportInputParamsVO reportInputParamsVO) throws Exception {
		log.info("Method entry : BusinessController.generateReport " );
		return databaseService.generateReport(reportInputParamsVO);
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public int addLoan(RequestVO requestVO) throws Exception {
		log.info("Method entry : BusinessController.addLoan");
		return databaseService.addLoan(requestVO);
	}
	
	/**
	 * @param requestVO
	 * @throws Exception
	 */
	public String deleteLoan(RequestVO requestVO) throws Exception {
		log.info("Method entry : BusinessController.deleteLoan");
		return databaseService.deleteLoan(requestVO);
	}
	
	/**
	 * @param requestVO
	 * @throws Exception
	 */
	public String deleteEmployee(RequestVO requestVO) throws Exception {
		log.info("Method entry : BusinessController.deleteEmployee");
		return databaseService.deleteEmployee(requestVO);
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public int addEmployee() throws Exception {
		log.info("Method entry : BusinessController.addEmployee");
		return databaseService.addEmployee();
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<CustomerVO> searchCustomer(CustomerVO customerVO) throws Exception {
		log.info("Method entry : BusinessController.searchCustomer");
		return databaseService.searchCustomer(customerVO);
	}
	
	/**
	 * @param customerVO
	 * @return
	 * @throws Exception
	 */
	public int addNewCustomer(CustomerVO customerVO) throws Exception {
		log.info("Method entry : BusinessController.addNewCustomer");
		return databaseService.addNewCustomer(customerVO);
	}
	/**
	 * @param customerVO
	 * @return
	 * @throws Exception
	 */
	public boolean updateCustomerDetail(CustomerVO customerVO) throws Exception {
		log.info("Method entry : BusinessController.updateCustomerDetail");
		return databaseService.updateCustomerDetail(customerVO);
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public ResponseVO searchLoans(RequestVO requestVO) throws Exception {
		log.info("Method entry : BusinessController.addNewCustomer");
		return databaseService.searchLoans(requestVO);
	}

	public int getNextAvailableCustId() throws Exception {
		log.info("Method entry : BusinessController.getNextAvailableCustId");
		return databaseService.getNextAvailableCustId();
	}
	
	public boolean saveBranchEntitlements(AppConfigurationVO appConfigVO) throws Exception {
		log.info("Method entry : BusinessController.saveBranchEntitlments");
		return databaseService.saveBranchEntitlements(appConfigVO);
	}
	
	
	
	public void testTemp(TempVO temp) throws Exception {
		log.info("Method entry : BusinessController.addNewCustomer");
		databaseService.testTemp(temp);
	}
	
	
}