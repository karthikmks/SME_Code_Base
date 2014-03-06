package com.bfp.dataaccess.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bear.gcs.bpm.of.activities.db.spring.sprunner.spexecutor.DDDAStoredProcedure;
import com.bear.gcs.bpm.of.activities.db.spring.sqlrunner.sqlexecutor.SQLDAO;
import com.bear.gcs.bpm.of.utility.XMLParser;
import com.bfp.dataaccess.IDataLoader;
import com.bfp.valueobjects.AppComponentVO;
import com.bfp.valueobjects.BranchDetailsVO;
import com.bfp.valueobjects.CustomerVO;
import com.bfp.valueobjects.DepositLoanAccountHoldersVO;
import com.bfp.valueobjects.DepositLoanInterestPeriodVO;
import com.bfp.valueobjects.DepositLoanTransactionVO;
import com.bfp.valueobjects.DepositPlaceVO;
import com.bfp.valueobjects.EducationVO;
import com.bfp.valueobjects.EmployeeVO;
import com.bfp.valueobjects.EntitlementsVO;
import com.bfp.valueobjects.JewelCategoryVO;
import com.bfp.valueobjects.JewelLoanModeVO;
import com.bfp.valueobjects.JewelLoanTransactionVO;
import com.bfp.valueobjects.JewelLoanTypeVO;
import com.bfp.valueobjects.JewelQualityVO;
import com.bfp.valueobjects.JewelSchemeVO;
import com.bfp.valueobjects.JewelTakeOverFromVO;
import com.bfp.valueobjects.LoanAssestSplitUpVO;
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
/**
 * @author tiruppathir
 *
 */
public class DataLoader implements IDataLoader {

	/**
	 * 
	 */
	private static final Log log = LogFactory.getLog(DataLoader.class);

	/**
	 * 
	 */
	private SQLDAO sqlDao;

	/**
	 * 
	 */
	private DataSource dataSource;

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the sqlDao
	 */
	public SQLDAO getSqlDao() {
		return sqlDao;
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#setSqlDao(com.bear.gcs.bpm.of.activities.db.spring.sqlrunner.sqlexecutor.SQLDAO)
	 */
	public void setSqlDao(SQLDAO _sqlDao) {
		sqlDao = _sqlDao;
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#retrieveUserDetails(java.lang.String)
	 */
	public UserProfileVO retrieveUserDetails(String userId, String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.retrieveUserDetails ");
		List<UserProfileVO> inputDataList = new ArrayList<UserProfileVO>();
		UserProfileVO profile = new UserProfileVO();
		profile.setUserId(userId);
		inputDataList.add(profile);
		List<UserProfileVO> list = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
		if(list != null && !list.isEmpty()) {
			profile = list.get(0);
		}
		return profile;
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelCategory()
	 */
	public List<JewelCategoryVO> getJewelCategory(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelCategory ");
		List<JewelCategoryVO> inputDataList = new ArrayList<JewelCategoryVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelQualities(java.lang.String)
	 */
	public List<JewelQualityVO> getJewelQualities(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelQualities ");
		List<JewelQualityVO> inputDataList = new ArrayList<JewelQualityVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelSchemes(java.lang.String)
	 */
	public List<JewelSchemeVO> getJewelSchemes(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelSchemes ");
		List<JewelSchemeVO> inputDataList = new ArrayList<JewelSchemeVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelLoanTypes(java.lang.String)
	 */
	public List<JewelLoanTypeVO> getJewelLoanTypes(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelLoanTypes ");
		List<JewelLoanTypeVO> inputDataList = new ArrayList<JewelLoanTypeVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelTakeOverFrom(java.lang.String)
	 */
	public List<JewelTakeOverFromVO> getJewelTakeOverFrom(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelTakeOverFrom ");
		List<JewelTakeOverFromVO> inputDataList = new ArrayList<JewelTakeOverFromVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getPaymentTypes(java.lang.String)
	 */
	public List<PaymentTypeVO> getPaymentTypes(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getPaymentTypes ");
		List<PaymentTypeVO> inputDataList = new ArrayList<PaymentTypeVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getDepositPlaces(java.lang.String)
	 */
	public List<DepositPlaceVO> getDepositPlaces(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getDepositPlaces ");
		List<DepositPlaceVO> inputDataList = new ArrayList<DepositPlaceVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getDepositLoanAccountHolders(java.lang.String)
	 */
	public List<DepositLoanAccountHoldersVO> getDepositLoanAccountHolders(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getDepositLoanAccountHolders ");
		List<JewelSchemeVO> inputDataList = new ArrayList<JewelSchemeVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getBranchDetails(java.lang.String)
	 */
	public BranchDetailsVO getBranchDetails(String xmlFileName,BranchDetailsVO branchDetailVO) throws Exception {
		log.info("Method Entry : DataLoader.getBranchDetails ");
		List<BranchDetailsVO> inputDataList = new ArrayList<BranchDetailsVO>();
		inputDataList.add(branchDetailVO);
		BranchDetailsVO branchDetailsVO = null;
		inputDataList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource); 
		if(inputDataList != null && !inputDataList.isEmpty()) {
			branchDetailsVO = inputDataList.get(0);
		}
		return branchDetailsVO;
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getReleaseTypes(java.lang.String)
	 */
	public List<ReleaseTypeVO> getReleaseTypes(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getReleaseTypes ");
		List<ReleaseTypeVO> inputDataList = new ArrayList<ReleaseTypeVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getDepositLoanInterestPeriods(java.lang.String)
	 */
	public List<DepositLoanInterestPeriodVO> getDepositLoanInterestPeriods(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getDepositLoanInterestPeriods ");
		List<DepositLoanInterestPeriodVO> inputDataList = new ArrayList<DepositLoanInterestPeriodVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addNewJewelScheme(java.lang.String)
	 */
	public void addJewelScheme(String xmlFileName, JewelSchemeVO jewelScheme) throws Exception {
		log.info("Method Entry : DataLoader.addNewJewelScheme ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), jewelScheme, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addTakeOverFrom(java.lang.String, com.bfp.valueobjects.JewelTakeOverFromVO)
	 */
	public void addTakeOverFrom(String xmlFileName, JewelTakeOverFromVO jewelTakeOverFromVO) throws Exception {
		log.info("Method Entry : DataLoader.addTakeOverFrom ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), jewelTakeOverFromVO, dataSource);		
	}
	
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addDepositPlace(java.lang.String, com.bfp.valueobjects.DepositPlaceVO)
	 */
	public void addDepositPlace(String xmlFileName, DepositPlaceVO depositPlaceVO) throws Exception {
		log.info("Method Entry : DataLoader.addDepositPlace ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), depositPlaceVO, dataSource);
	}

	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addDepositAccountHolderName(java.lang.String, com.bfp.valueobjects.DepositLoanAccountHoldersVO)
	 */
	public void addDepositAccountHolderName(String xmlFileName, DepositLoanAccountHoldersVO depositLoanAccountHoldersVO) throws Exception {
		log.info("Method Entry : DataLoader.addDepositAccountHolderName ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), depositLoanAccountHoldersVO, dataSource);
	}	
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addDepositLoanInterestPeriod(java.lang.String, com.bfp.valueobjects.DepositLoanInterestPeriodVO)
	 */
	public void addDepositLoanInterestPeriod(String xmlFileName, DepositLoanInterestPeriodVO depositLoanInterestPeriodVO) throws Exception {
		log.info("Method Entry : DataLoader.addDepositLoanInterestPeriod ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), depositLoanInterestPeriodVO, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addNewJewelLoan(java.lang.String)
	 */
	public void addNewJewelLoan(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.addNewJewelLoan ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelLoanDetails(java.lang.String)
	 */
	public JewelLoanTransactionVO getNewJewelLoanNo(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelLoanDetails ");
		JewelLoanTransactionVO jewelLoanTransaction = null;
		List<JewelLoanTransactionVO> inputDataList = new ArrayList<JewelLoanTransactionVO>();
		inputDataList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
		if(inputDataList != null && !inputDataList.isEmpty())
			jewelLoanTransaction = inputDataList.get(0);
		return jewelLoanTransaction;
	}
	
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addNewJewelLoan(java.lang.String)
	 */
	public void addNewCustomer(String xmlFileName,CustomerVO inputVO) throws Exception {
		log.info("Method Entry : DataLoader.addNewJewelLoan ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), inputVO, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addNewJewelLoan(java.lang.String)
	 */
	public void updateCustomerDetail(String xmlFileName,CustomerVO inputVO) throws Exception {
		log.info("Method Entry : DataLoader.addNewJewelLoan ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), inputVO, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addNewCustomer(java.lang.String, java.lang.String, com.bfp.valueobjects.CustomerVO)
	 */
	public int addNewCustomer(String storedProcedureName, String xmlFileName, CustomerVO customer) throws Exception {
		log.info("Method Entry : DataLoader.addNewCustomer ");
		int customerId = 0;
		Map map = invokeStoredProcedure(storedProcedureName, xmlFileName, customer);
		log.info("Database response " + map);
		if(map != null) {
			customerId = (Integer) map.get("customer_id");
		}
		return customerId;
	}
	
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getNewCustomerId()
	 */
	public int getNewCustomerId(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getNewCustomerId ");
		int customerId = 0;
		List<CustomerVO> inputDataList = new ArrayList<CustomerVO>();
		inputDataList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
		if(inputDataList != null && !inputDataList.isEmpty())
			customerId = ((CustomerVO)inputDataList.get(0)).getCustomerId();
		return customerId;
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#updateNewJewelLoanDetails(java.lang.String, com.bfp.valueobjects.JewelLoanTransactionVO)
	 */
	public void updateNewJewelLoanDetails(String xmlFileName, JewelLoanTransactionVO jewelLoanTransactionVO) throws Exception {
		log.info("Method Entry : DataLoader.updateNewJewelLoanDetails ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), jewelLoanTransactionVO, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#updateLoanAssetSplitUpDetails(java.lang.String, com.bfp.valueobjects.JewelLoanTransactionVO)
	 */
	public void updateLoanAssetSplitUpDetails(String xmlFileName, LoanAssestSplitUpVO asset) throws Exception {
		log.info("Method Entry : DataLoader.updateLoanAssetSplitUpDetails ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), asset, dataSource);		
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addNewJewelLoanInterestPayment(java.lang.String, com.bfp.valueobjects.PaymentTransactionVO)
	 */
	public void addLoanInterestPayment(String xmlFileName, PaymentTransactionVO paymentTransactionVO) throws Exception {
		log.info("Method Entry : DataLoader.addLoanInterestPayment ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), paymentTransactionVO, dataSource);	
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getPaymentTransactionDetails(java.lang.String, com.bfp.valueobjects.PaymentTransactionVO)
	 */
	public List<PaymentTransactionVO> getPaymentTransactionDetails(String xmlFileName, PaymentTransactionVO paymentTransactionVO) throws Exception {
		log.info("Method Entry : DataLoader.getPaymentTransactionDetails ");
		List<PaymentTransactionVO> paymentTrnsactionList = new ArrayList<PaymentTransactionVO>();
		paymentTrnsactionList.add(paymentTransactionVO);
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), paymentTrnsactionList, null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addNewDepositLoan(java.lang.String)
	 */
	public void addNewDepositLoan(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.addNewJewelLoan ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getNewDepositLoanNo(java.lang.String)
	 */
	public DepositLoanTransactionVO getNewDepositLoanNo(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelLoanDetails ");
		DepositLoanTransactionVO depositLoanTransactionVO = null;
		List<DepositLoanTransactionVO> inputDataList = new ArrayList<DepositLoanTransactionVO>();
		inputDataList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
		if(inputDataList != null && !inputDataList.isEmpty())
			depositLoanTransactionVO = inputDataList.get(0);
		return depositLoanTransactionVO;
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#updateNewJewelLoanDetails(java.lang.String, com.bfp.valueobjects.DepositLoanTransactionVO)
	 */
	public void updateNewDepositLoanDetails(String xmlFileName, DepositLoanTransactionVO depositLoanTransactionVO) throws Exception {
		log.info("Method Entry : DataLoader.updateNewDepositLoanDetails ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), depositLoanTransactionVO, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelLoanDetails(java.lang.String, com.bfp.valueobjects.JewelLoanTransactionVO)
	 */
	public JewelLoanTransactionVO getJewelLoanDetails(String xmlFileName, JewelLoanTransactionVO jewelLoanTransactionVO) throws Exception {
		log.info("Method Entry : DataLoader.getJewelLoanDetails ");
		List<JewelLoanTransactionVO> jewelLoanTransactionVOList = new ArrayList<JewelLoanTransactionVO>();
		jewelLoanTransactionVOList.add(jewelLoanTransactionVO);
		jewelLoanTransactionVOList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), jewelLoanTransactionVOList, null, dataSource);
		if(jewelLoanTransactionVOList != null && !jewelLoanTransactionVOList.isEmpty()) {
			return jewelLoanTransactionVOList.get(0);
		} else {
			return null;
		}
	}
	
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getDepositLoanDetails(java.lang.String, com.bfp.valueobjects.DepositLoanTransactionVO)
	 */
	public DepositLoanTransactionVO getDepositLoanDetails(String xmlFileName, DepositLoanTransactionVO depositLoanTransactionVO) throws Exception {
		log.info("Method Entry : DataLoader.getDepositLoanDetails ");
		List<DepositLoanTransactionVO> depositLoanTransactionVOList = new ArrayList<DepositLoanTransactionVO>();
		depositLoanTransactionVOList.add(depositLoanTransactionVO);
		depositLoanTransactionVOList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), depositLoanTransactionVOList, null, dataSource);
		if(depositLoanTransactionVOList != null && !depositLoanTransactionVOList.isEmpty()) {
			return depositLoanTransactionVOList.get(0);
		} else {
			return null;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getLoanAssetBreakUp(java.lang.String, com.bfp.valueobjects.LoanAssestSplitUpVO)
	 */
	public List<LoanAssestSplitUpVO> getLoanAssetBreakUp(String xmlFileName, LoanAssestSplitUpVO loanAssestSplitUpVO) throws Exception {
		log.info("Method Entry : DataLoader.getJewelLoanDetails ");
		List<LoanAssestSplitUpVO> loanAssestSplitUpVOList = new ArrayList<LoanAssestSplitUpVO>();
		loanAssestSplitUpVOList.add(loanAssestSplitUpVO);
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), loanAssestSplitUpVOList, null, dataSource);
		
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getPaymentTransations(java.lang.String, com.bfp.valueobjects.PaymentTransactionVO)
	 */
	public List<PaymentTransactionVO> getPaymentTransations(String xmlFileName, PaymentTransactionVO paymentTransactionVO) throws Exception {
		log.info("Method Entry : DataLoader.getJewelLoanDetails ");
		List<PaymentTransactionVO> paymentTransactionVOList = new ArrayList<PaymentTransactionVO>();
		paymentTransactionVOList.add(paymentTransactionVO);
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), paymentTransactionVOList, null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#validateUser(com.bfp.valueobjects.UserProfileVO)
	 */
	public UserProfileVO validateUser(String xmlFileName, UserProfileVO userProfileVO) throws Exception {
		log.info("Method Entry : DataLoader.validateUser ");
		UserProfileVO userProfile = null;
		List<UserProfileVO> userProfileList = new ArrayList<UserProfileVO>();
		userProfileList.add(userProfileVO);		
		userProfileList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), userProfileList, null, dataSource);
		if(userProfileList != null && !userProfileList.isEmpty()) {
			userProfile = userProfileList.get(0);
		}
		return userProfile;
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#configureBranch(java.lang.String, com.bfp.valueobjects.BranchDetailsVO)
	 */
	public void configureBranch(String xmlFileName, BranchDetailsVO branchDetailsVO) throws Exception {
		log.info("Method Entry : DataLoader.configureBranch ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), branchDetailsVO, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addEmployee(java.lang.String, com.bfp.valueobjects.EmployeeVO)
	 */
	public void updateEmployeeDetails(String xmlFileName, EmployeeVO employee) throws Exception {
		log.info("Method Entry : DataLoader.updateEmployeeDetails ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), employee, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#fetchEmployees(java.lang.String)
	 */
	public List<EmployeeVO> fetchEmployees(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.fetchEmployees ");
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), employees, null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addNewJewelLoan(java.lang.String)
	 */
	public void addNewEmployee(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.addNewEmployee ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), null, dataSource);
	}
	
	public EmployeeVO getNewEmployeeNo(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getNewEmployeeNo ");
		EmployeeVO employeeVO = null;
		List<EmployeeVO> employeeVOList = new ArrayList<EmployeeVO>();
		employeeVOList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), employeeVOList, null, dataSource);
		if(employeeVOList != null && !employeeVOList.isEmpty())
			employeeVO = employeeVOList.get(0);
		return employeeVO;
	}
	
	public List<EntitlementsVO> getEntitlements(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getEntitlements ");
		List<EntitlementsVO> inputDataList = new ArrayList<EntitlementsVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#updateEmployeeLoginDetails(java.lang.String, com.bfp.valueobjects.EmployeeVO)
	 */
	public void updateEmployeeLoginDetails(String xmlFileName, EmployeeVO employee) throws Exception {
		log.info("Method Entry : DataLoader.updateEmployeeLoginDetails ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), employee, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#isPrincipleAmountPaidBack(java.lang.String, com.bfp.valueobjects.SearchRequestVO)
	 */
	public ResponseVO isPrincipleAmountPaidBack(String xmlFileName, SearchRequestVO searchRequestVO) throws Exception {
		ResponseVO responseVO = null;
		log.info("Method Entry : DataLoader.isPrincipleAmountPaidBack ");
		List<SearchRequestVO> searchRequestVOList = new ArrayList<SearchRequestVO>();
		searchRequestVOList.add(searchRequestVO);
		List<ResponseVO> responseVOList = sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), searchRequestVOList, null, dataSource);
		if(responseVOList != null && !responseVOList.isEmpty())
			responseVO = responseVOList.get(0);
		return responseVO;
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#releaseDepositLoan(java.lang.String, com.bfp.valueobjects.SearchRequestVO)
	 */
	public void releaseDepositLoan(String xmlFileName, SearchRequestVO searchRequestVO) throws Exception {
		log.info("Method Entry : DataLoader.releaseDepositLoan ");
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), searchRequestVO, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#checkDepositLoansReleaseStatus(java.lang.String, com.bfp.valueobjects.SearchRequestVO)
	 */
	public List<DepositLoanTransactionVO> checkDepositLoansReleaseStatus(String xmlFileName, SearchRequestVO searchRequestVO) throws Exception {
		log.info("Method Entry : DataLoader.checkDepositLoansReleaseStatus ");
		List<SearchRequestVO> searchRequestVOList = new ArrayList<SearchRequestVO>();
		searchRequestVOList.add(searchRequestVO);
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), searchRequestVOList, null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#generateReport(java.lang.String, com.bfp.valueobjects.ReportInputParamsVO)
	 */
	public List<ResponseVO> generateReport(String xmlFileName, ReportInputParamsVO reportInputParamsVO) throws Exception {
		log.info("Method Entry : DataLoader.generateReport ");
		List<ReportInputParamsVO> reportInputParamsVOList = new ArrayList<ReportInputParamsVO>();
		reportInputParamsVOList.add(reportInputParamsVO);
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), reportInputParamsVOList, null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getReportMetadataList(java.lang.String)
	 */
	public List<ReportMetadata> getReportMetadataList(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getReportMetadataList ");
		List<ReportMetadata> reportInputParamsVOList = new ArrayList<ReportMetadata>();		
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), reportInputParamsVOList, null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addLedgerLoan(java.lang.String, com.bfp.valueobjects.JewelLoanTransactionVO)
	 */
	public int addLoan(String storedProcedureName, String xmlFileName, RequestVO requestVO) throws Exception {
		log.info("Method Entry : DataLoader.addLoan ");
		int loanNo = 0;
		DDDAStoredProcedure storeProcedure = new DDDAStoredProcedure(dataSource);
		Map inputDet = new HashMap();
		inputDet.put(requestVO.getClass().getSimpleName(), requestVO);
		List list = storeProcedure.executeStoredProc(inputDet, storedProcedureName, XMLParser.parseXML(xmlFileName), null);
		if(list != null && !list.isEmpty()) {
			Map map = (Map) list.get(1);
			log.info("map : " + map);
			if(map.get("loanNo") != null)
				loanNo = (Integer) map.get("loanNo");
			log.info("loanNo : " + loanNo);
		}
		return loanNo; 
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#deleteLoan(java.lang.String, com.bfp.valueobjects.RequestVO)
	 */
	public String deleteLoan(String storedProcedureName, String xmlFileName, RequestVO requestVO) throws Exception {
		log.info("Method Entry : DataLoader.deleteLoan ");
		String status = null;
		DDDAStoredProcedure storeProcedure = new DDDAStoredProcedure(dataSource);
		Map inputDet = new HashMap();
		inputDet.put(requestVO.getClass().getSimpleName(), requestVO);
		List list = storeProcedure.executeStoredProc(inputDet, storedProcedureName, XMLParser.parseXML(xmlFileName), null);
		if(list != null && !list.isEmpty()) {
			Map map = (Map) list.get(1);
			status = (String) map.get("delete_status");
			log.info("map : " + map + " and deletion status : " + status );
		}
		return status;
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#deleteEmployee(java.lang.String, java.lang.String, com.bfp.valueobjects.RequestVO)
	 */
	public String deleteEmployee(String storedProcedureName, String xmlFileName, RequestVO requestVO) throws Exception {
		log.info("Method Entry : DataLoader.deleteEmployee ");
		String status = null;
		DDDAStoredProcedure storeProcedure = new DDDAStoredProcedure(dataSource);
		Map inputDet = new HashMap();
		inputDet.put(requestVO.getClass().getSimpleName(), requestVO);
		log.info("Employee Id " + requestVO.getEmployeeId());
		List list = storeProcedure.executeStoredProc(inputDet, storedProcedureName, XMLParser.parseXML(xmlFileName), null);
		if(list != null && !list.isEmpty()) {
			Map map = (Map) list.get(1);
			status = (String) map.get("delete_status");
			log.info("map : " + map + " and deletion status : " + status );
		}
		return status;
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addEmployee(java.lang.String, java.lang.String)
	 */
	public int addEmployee(String storedProcedureName, String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.addEmployee ");
		int employeeId = 0;
		DDDAStoredProcedure storeProcedure = new DDDAStoredProcedure(dataSource);
		Map inputDet = new HashMap();
		List list = storeProcedure.executeStoredProc(inputDet, storedProcedureName, XMLParser.parseXML(xmlFileName), null);
		if(list != null && !list.isEmpty()) {
			Map map = (Map) list.get(1);
			employeeId = (Integer) map.get("employeeId");
			log.info("map : " + map + " and employee_id : " + employeeId );
		}
		return employeeId;
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#searchCustomer(java.lang.String, com.bfp.valueobjects.RequestVO)
	 */
	public List<CustomerVO> searchCustomer(Object xmlFileName, CustomerVO customerVO) throws Exception {
		log.info("Method Entry : DataLoader.searchCustomer ");
		List<CustomerVO> reportInputParamsVOList = new ArrayList<CustomerVO>();
		if(customerVO != null)
			reportInputParamsVOList.add(customerVO);
		if(xmlFileName instanceof String) {			
			return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), reportInputParamsVOList, null, dataSource);
		}
		else if(xmlFileName instanceof Object) {
			return sqlDao.executeSelect(xmlFileName, reportInputParamsVOList, null, dataSource);
		}
		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelLoanModes(java.lang.String)
	 */
	public List<JewelLoanModeVO> getJewelLoanModes(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelLoanModes ");
		List<JewelLoanModeVO> inputDataList = new ArrayList<JewelLoanModeVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addJewelTakeOverFromPlace(java.lang.String, java.lang.String, com.bfp.valueobjects.JewelLoanTransactionVO)
	 */
	public int addJewelTakeOverFromPlace(String storedProcedureName, String xmlFileName, JewelLoanTransactionVO jewelLoanTransactionVO) throws Exception {
		log.info("Method Entry : DataLoader.addJewelTakeOverFromPlace ");
		int placeId = 0;
		Map map = invokeStoredProcedure(storedProcedureName, xmlFileName, jewelLoanTransactionVO);
		log.info("Database response " + map);
		if(map != null) {
			placeId = (Integer) map.get("place_id");
		}
		return placeId;
	}
	
	/**
	 * @param storedProcedureName
	 * @param xmlFileName
	 * @param object
	 * @return
	 */
	private Map invokeStoredProcedure(String storedProcedureName, String xmlFileName, Object object) {
		Map map = null;
		DDDAStoredProcedure storeProcedure = new DDDAStoredProcedure(dataSource);
		Map inputDet = new HashMap();
		inputDet.put(object.getClass().getSimpleName(), object);
		List list = storeProcedure.executeStoredProc(inputDet, storedProcedureName, XMLParser.parseXML(xmlFileName), null);
		if(list != null && !list.isEmpty()) {
			map = (Map) list.get(1);
		}
		return map;
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelTakeOverFrom(java.lang.String)
	 */
	public List executeSelect(String xmlFileName) throws Exception {
		log.info("Method Entry : DataLoader.getJewelTakeOverFrom ");
		List<EducationVO> inputDataList = new ArrayList<EducationVO>();
		return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), new ArrayList(), null, dataSource);
	}
	
	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#getJewelTakeOverFrom(java.lang.String)
	 */
	public List executeSelect(Object xmlFileName,Object inputVO) throws Exception {
		log.info("Method Entry : DataLoader.getJewelTakeOverFrom ");
		List<Object> inputDataList = new ArrayList<Object>();
		inputDataList.add(inputVO);
		if(xmlFileName instanceof String) {
			return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
		}
		else if(inputVO==null && xmlFileName instanceof Object) {
			return sqlDao.executeSelect(xmlFileName, null, null, dataSource);
		}
		else if(xmlFileName instanceof Object) {
			return sqlDao.executeSelect(xmlFileName, inputDataList, inputDataList, dataSource);
		}
		return null;
		//return sqlDao.executeSelect(XMLParser.parseXML(xmlFileName), inputDataList, null, dataSource);
	}

	public void insertTemp(String xmlFileName, TempVO tempVO,boolean isStoreProcFlow){
		if(isStoreProcFlow){
			
		}else{
			sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), tempVO, dataSource);
		}
	}
	

	/* (non-Javadoc)
	 * @see com.bfp.dataaccess.IDataLoader#addLedgerLoan(java.lang.String, com.bfp.valueobjects.JewelLoanTransactionVO)
	 */
	public int addNewCustomerSP(String xmlFileName, CustomerVO requestVO) throws Exception {
		log.info("Method Entry : DataLoader.addLoan ");
		int customerId = 0;
		DDDAStoredProcedure storeProcedure = new DDDAStoredProcedure(dataSource);
		String storedProcedureName = xmlFileName.substring( xmlFileName.lastIndexOf(File.separator)+1,xmlFileName.length());
		Map inputDet = new HashMap();
		inputDet.put(requestVO.getClass().getSimpleName(), requestVO);
		List list = storeProcedure.executeStoredProc(inputDet, storedProcedureName, XMLParser.parseXML(xmlFileName), null);
		if(list != null && !list.isEmpty()) {
			Map map = (Map) list.get(1);
			log.info("map : " + map);
			if(map.get("customerId") != null)
				customerId = (Integer) map.get("loanNo");
			log.info("customerId : " + customerId);
		}
		return customerId; 
	}

	public void insertBranchEntitlements(String xmlFileName, AppComponentVO appCompVO) throws Exception{
		log.info("Method Entry : DataLoader.insertBranchEntitlements- xmlFileName: "+xmlFileName);
		sqlDao.executeInsert(XMLParser.parseXML(xmlFileName), appCompVO, dataSource);
	}
}