package com.bfp.dataaccess;

import java.util.List;

import javax.sql.DataSource;

import com.bear.gcs.bpm.of.activities.db.spring.sqlrunner.sqlexecutor.SQLDAO;
import com.bfp.util.ApplicationConstants;
import com.bfp.valueobjects.AppComponentVO;
import com.bfp.valueobjects.BankAccountTypeVO;
import com.bfp.valueobjects.BranchDetailsVO;
import com.bfp.valueobjects.CustomerVO;
import com.bfp.valueobjects.DepositLoanAccountHoldersVO;
import com.bfp.valueobjects.DepositLoanInterestPeriodVO;
import com.bfp.valueobjects.DepositLoanTransactionVO;
import com.bfp.valueobjects.DepositPlaceVO;
import com.bfp.valueobjects.EducationVO;
import com.bfp.valueobjects.EmployeeVO;
import com.bfp.valueobjects.EntitlementsVO;
import com.bfp.valueobjects.GenderVO;
import com.bfp.valueobjects.IdNAddressProofVO;
import com.bfp.valueobjects.JewelCategoryVO;
import com.bfp.valueobjects.JewelLoanModeVO;
import com.bfp.valueobjects.JewelLoanTransactionVO;
import com.bfp.valueobjects.JewelLoanTypeVO;
import com.bfp.valueobjects.JewelQualityVO;
import com.bfp.valueobjects.JewelSchemeVO;
import com.bfp.valueobjects.JewelTakeOverFromVO;
import com.bfp.valueobjects.LoanAssestSplitUpVO;
import com.bfp.valueobjects.MaritalStatusVO;
import com.bfp.valueobjects.NationalityVO;
import com.bfp.valueobjects.OccupationVO;
import com.bfp.valueobjects.PaymentTransactionVO;
import com.bfp.valueobjects.PaymentTypeVO;
import com.bfp.valueobjects.ReleaseTypeVO;
import com.bfp.valueobjects.ReportInputParamsVO;
import com.bfp.valueobjects.ReportMetadata;
import com.bfp.valueobjects.RequestVO;
import com.bfp.valueobjects.ResponseVO;
import com.bfp.valueobjects.SearchRequestVO;
import com.bfp.valueobjects.TempVO;
import com.bfp.valueobjects.UserProfileVO;

/**
 * @author tiruppathir
 *
 */
public interface IDataLoader {

	/**
	 * @param sqlDao
	 */
	public void setSqlDao(SQLDAO sqlDao);
	
	/**
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource);
	
	/**
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public UserProfileVO retrieveUserDetails(String userId, String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelCategoryVO> getJewelCategory(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelQualityVO> getJewelQualities(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelSchemeVO> getJewelSchemes(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelLoanTypeVO> getJewelLoanTypes(String xmlFileName) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @return
	 * @throws Exception
	 */
	public List<JewelLoanModeVO> getJewelLoanModes(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelTakeOverFromVO> getJewelTakeOverFrom(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<PaymentTypeVO> getPaymentTypes(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositPlaceVO> getDepositPlaces(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositLoanAccountHoldersVO> getDepositLoanAccountHolders(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public BranchDetailsVO getBranchDetails(String xmlFileName,BranchDetailsVO branchDetailVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<ReleaseTypeVO> getReleaseTypes(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositLoanInterestPeriodVO> getDepositLoanInterestPeriods(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addJewelScheme(String xmlFileName, JewelSchemeVO jewelScheme) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addTakeOverFrom(String xmlFileName, JewelTakeOverFromVO jewelTakeOverFromVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addDepositPlace(String xmlFileName, DepositPlaceVO depositPlaceVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addDepositAccountHolderName(String xmlFileName, DepositLoanAccountHoldersVO depositLoanAccountHoldersVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addDepositLoanInterestPeriod(String xmlFileName, DepositLoanInterestPeriodVO depositLoanInterestPeriodVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addNewJewelLoan(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public JewelLoanTransactionVO getNewJewelLoanNo(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public int addNewCustomer(String storedProcedureName, String xmlFileName, CustomerVO customer) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addNewCustomer(String xmlFileName,CustomerVO inputVO) throws Exception ;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void updateCustomerDetail(String xmlFileName,CustomerVO inputVO) throws Exception ;
	
	
	
	/**
	 * @return
	 * @throws Exception
	 */
	public int getNewCustomerId(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void updateNewJewelLoanDetails(String xmlFileName, JewelLoanTransactionVO jewelLoanTransactionVO) throws Exception;
	
	/**
	 * @param storedProcedureName
	 * @param xmlFileName
	 * @param jewelLoanTransactionVO
	 * @throws Exception
	 */
	public int addJewelTakeOverFromPlace(String storedProcedureName, String xmlFileName, JewelLoanTransactionVO jewelLoanTransactionVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void updateLoanAssetSplitUpDetails(String xmlFileName, LoanAssestSplitUpVO asset) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addLoanInterestPayment(String xmlFileName, PaymentTransactionVO paymentTransactionVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<PaymentTransactionVO> getPaymentTransactionDetails(String xmlFileName, PaymentTransactionVO paymentTransactionVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addNewDepositLoan(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public DepositLoanTransactionVO getNewDepositLoanNo(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void updateNewDepositLoanDetails(String xmlFileName, DepositLoanTransactionVO depositLoanTransactionVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public JewelLoanTransactionVO getJewelLoanDetails(String xmlFileName, JewelLoanTransactionVO jewelLoanTransactionVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public DepositLoanTransactionVO getDepositLoanDetails(String xmlFileName, DepositLoanTransactionVO depositLoanTransactionVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<LoanAssestSplitUpVO> getLoanAssetBreakUp(String xmlFileName, LoanAssestSplitUpVO loanAssestSplitUpVO) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<PaymentTransactionVO> getPaymentTransations(String xmlFileName, PaymentTransactionVO paymentTransactionVO) throws Exception;
	
	/**
	 * @param userProfileVO
	 * @return
	 * @throws Exception
	 */
	public UserProfileVO validateUser(String xmlFileName, UserProfileVO userProfileVO) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param branchDetailsVO
	 * @return
	 * @throws Exception
	 */
	public void configureBranch(String xmlFileName, BranchDetailsVO branchDetailsVO) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param employee
	 * @throws Exception
	 */
	public void updateEmployeeDetails(String xmlFileName, EmployeeVO employee) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @throws Exception
	 */
	public List<EmployeeVO> fetchEmployees(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public void addNewEmployee(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public EmployeeVO getNewEmployeeNo(String xmlFileName) throws Exception;
	
	/**
	 * @return
	 * @throws Exception
	 */
	public List<EntitlementsVO> getEntitlements(String xmlFileName) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param employee
	 * @throws Exception
	 */
	public void updateEmployeeLoginDetails(String xmlFileName, EmployeeVO employee) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param searchRequestVO
	 * @return
	 * @throws Exception
	 */
	public void releaseDepositLoan(String xmlFileName, SearchRequestVO searchRequestVO) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param searchRequestVO
	 * @return
	 * @throws Exception
	 */
	public ResponseVO isPrincipleAmountPaidBack(String xmlFileName, SearchRequestVO searchRequestVO) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param searchRequestVO
	 * @return
	 * @throws Exception
	 */
	public List<DepositLoanTransactionVO> checkDepositLoansReleaseStatus(String xmlFileName, SearchRequestVO searchRequestVO) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param reportInputParamsVO
	 * @return
	 * @throws Exception
	 */
	public List<ResponseVO> generateReport(String xmlFileName, ReportInputParamsVO reportInputParamsVO) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @return
	 * @throws Exception
	 */
	public List<ReportMetadata> getReportMetadataList(String xmlFileName) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param jewelLoanTransactionVO
	 * @throws Exception
	 */
	public int addLoan(String storedProcedureName, String xmlFileName, RequestVO requestVO) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param requestVO
	 * @throws Exception
	 */
	public String deleteLoan(String storedProcedureName, String xmlFileName, RequestVO requestVO) throws Exception;
	
	/**
	 * @param storedProcedureName
	 * @param xmlFileName
	 * @param requestVO
	 * @return
	 * @throws Exception
	 */
	public String deleteEmployee(String storedProcedureName, String xmlFileName, RequestVO requestVO) throws Exception;
	
	/**
	 * @param storedProcedureName
	 * @param xmlFileName
	 * @return
	 * @throws Exception
	 */
	public int addEmployee(String storedProcedureName, String xmlFileName) throws Exception;
	
	/**
	 * @param xmlFileName
	 * @param requestVO
	 * @return
	 * @throws Exception
	 */
	public List<CustomerVO> searchCustomer(Object xmlFileName, CustomerVO customerVO) throws Exception;
	
	@SuppressWarnings("unchecked")
	public List executeSelect(String xmlFileName) throws Exception;
	@SuppressWarnings("unchecked")
	public List executeSelect(Object xmlFileName,Object inputVO) throws Exception;
	
	public void	insertBranchEntitlements(String xmlFileName,AppComponentVO tempVO) throws Exception;
	
	public int addNewCustomerSP(String xmlFileName, CustomerVO requestVO) throws Exception ;
}