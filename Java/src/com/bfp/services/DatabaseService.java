package com.bfp.services;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import net.sf.jxls.reader.ReaderBuilder;
import net.sf.jxls.reader.XLSReadStatus;
import net.sf.jxls.reader.XLSReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bear.gcs.bpm.of.activities.db.spring.valueobject.SQLObjects;
import com.bear.gcs.bpm.of.utility.XMLParser;
import com.bfp.dataaccess.IDataLoader;
import com.bfp.util.ApplicationConstants;
import com.bfp.util.ExcelToHtml;
import com.bfp.valueobjects.AppComponentVO;
import com.bfp.valueobjects.AppConfigurationVO;
import com.bfp.valueobjects.ApplicationComponentsDataVO;
import com.bfp.valueobjects.BankAccountTypeVO;
import com.bfp.valueobjects.BranchDetailsVO;
import com.bfp.valueobjects.CustomerVO;
import com.bfp.valueobjects.DayBookVO;
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
import com.bfp.valueobjects.JewelMasterVO;
import com.bfp.valueobjects.JewelQualityVO;
import com.bfp.valueobjects.JewelSchemeVO;
import com.bfp.valueobjects.JewelTakeOverFromVO;
import com.bfp.valueobjects.JewelTypesVO;
import com.bfp.valueobjects.LoanAssestSplitUpVO;
import com.bfp.valueobjects.MaritalStatusVO;
import com.bfp.valueobjects.NationalityVO;
import com.bfp.valueobjects.OccupationVO;
import com.bfp.valueobjects.PaymentTransactionVO;
import com.bfp.valueobjects.PaymentTypeVO;
import com.bfp.valueobjects.PaymentsNReceivedVO;
import com.bfp.valueobjects.ReleaseTypeVO;
import com.bfp.valueobjects.ReportInputParamsVO;
import com.bfp.valueobjects.ReportMetadata;
import com.bfp.valueobjects.RequestVO;
import com.bfp.valueobjects.ResponseVO;
import com.bfp.valueobjects.SearchRequestVO;
import com.bfp.valueobjects.SearchResponseVO;
import com.bfp.valueobjects.TempVO;
import com.bfp.valueobjects.UserProfileVO;

import flex.messaging.FlexContext;

/**
 * @author tiruppathir
 *
 */
public class DatabaseService {

	/**
	 * 
	 */
	private static final Log log = LogFactory.getLog(DatabaseService.class);

	/**
	 * 
	 */
	private static final String RETRIEVE_USER_DETAILS = "getUserDetails";

	/**
	 * 
	 */
	private static final String RETRIEVE_JEWEL_CATEGORY = "getJewelCategory";

	/**
	 * 
	 */
	private static final String RETRIEVE_JEWEL_QUALITIES = "getJewelQualities";

	/**
	 * 
	 */
	private static final String RETRIEVE_JEWEL_SCHEMES = "getJewelScheme";

	/**
	 * 
	 */
	private static final String RETRIEVE_JEWEL_SCHEMES_QUALITY = "getJewelSchemeQuality";

	/**
	 * 
	 */
	private static final String RETRIEVE_JEWEL_SCHEMES_INTERESTS = "getJewelSchemeInterest";

	/**
	 * 
	 */
	private static final String RETRIEVE_JEWEL_LOAN_TYPES = "getJewelLoanType";

	/**
	 * 
	 */
	private static final String RETRIEVE_JEWEL_LOAN_MODES = "getJewelLoanMode";

	/**
	 * 
	 */
	private static final String RETRIEVE_JEWEL_TAKE_OVER_FROM = "getJewelTakeOverFrom";

	/**
	 * 
	 */
	private static final String RETRIEVE_PAYMENT_TYPES = "getPaymentType";

	/**
	 * 
	 */
	private static final String RETRIEVE_DEPOSIT_PLACES = "getDepositplace";

	/**
	 * 
	 */
	private static final String RETRIEVE_DEPOSIT_LOAN_ACCT_HOLDERS = "getDepositLoanAccountHolders";

	/**
	 * 
	 */
	private static final String RETRIEVE_BRANCH_DETAILS = "getBranchDetails";

	/**
	 * 
	 */
	private static final String RETRIEVE_RELEASE_TYPES = "getReleaseTypes";

	/**
	 * 
	 */
	private static final String RETRIEVE_DEPOSIT_LOAN_INTEREST_PERIODS = "getDepositLoanInterestPeriods";

	/**
	 * 
	 */
	private static final String ADD_NEW_JEWEL_SCHEME = "addNewJewelScheme";

	/**
	 * 
	 */
	private static final String ADD_NEW_TAKE_OVER_FROM = "addNewTakeOverFrom";

	/**
	 * 
	 */
	private static final String ADD_NEW_DEPOSIT_PLACE = "addNewDepositPlace";

	/**
	 * 
	 */
	private static final String ADD_NEW_DEPOSIT_LOAN_ACCT_HOLDER = "addNewDepositLoanAcctHolder";

	/**
	 * 
	 */
	private static final String ADD_NEW_DEPOSIT_LOAN_INTEREST_PERIOD = "addNewDepositLoanInterestPeriod";

	/**
	 * 
	 */
	private static final String INSERT_NEW_JEWEL_LOAN_DETAILS = "insertNewJewelLoanDetails";

	/**
	 * 
	 */
	private static final String ADD_NEW_JEWEL_TAKE_OVER_FROM_PLACE_STORED_PROCEDURE = "add_jewel_take_over_place";

	/**
	 * 
	 */
	private static final String ADD_NEW_JEWEL_TAKE_OVER_FROM_PLACE = "addNewJewelTakeOverFromPlace";

	/**
	 * 
	 */
	private static final String ADD_NEW_CUSTOMER = "addNewCustomer";

	/**
	 * 
	 */
	private static final String ADD_NEW_CUSTOMER_STORED_PROCEDURE = "add_new_customer";

	/**
	 * 
	 */
	private static final String UPDATE_NEW_LOAN_ASSET_SPLIT_UP_DETAILS = "updateNewLoanAssetSplitUpDetails";

	/**
	 * 
	 */
	private static final String ADD_NEW_LOAN_INTEREST_PAYMENT_DETAILS = "addLoanInterestPaymentDetails";

	/**
	 * 
	 */
	private static final String GET_PAYMENT_TRANSACTION_DETAILS = "getPaymentTransactionDetails";

	/**
	 * 
	 */
	private static final String ADD_NEW_DEPOSIT_LOAN = "addNewDepositLoan";

	/**
	 * 
	 */
	private static final String GET_NEW_DEPOSIT_LOAN_NUMBER = "getNewDepositLoanNo";

	/**
	 * 
	 */
	private static final String UPDATE_NEW_DEPOSIT_LOAN_DETAILS = "updateNewDepositLoanDetails";

	/**
	 * 
	 */
	private static final String INSERT_NEW_DEPOSIT_LOAN_DETAILS = "insertNewDepositLoanDetails";

	/**
	 * 
	 */
	private static final String GET_JEWEL_LOAN_DETAILS = "getJewelLoanDetails";

	/**
	 * 
	 */
	private static final String GET_DEPOSIT_LOAN_DETAILS = "getDepositLoanDetails";

	/**
	 * 
	 */
	private static final String GET_JEWEL_LOAN_ASSET_BREAKUP = "getJewelLoanAssetBreakUp";

	/**
	 * 
	 */
	private static final String GET_DEPOSIT_LOAN_ASSET_BREAKUP = "getDepositLoanAssetBreakUp";

	/**
	 * 
	 */
	private static final String GET_PAYMENT_TRANSACTIONS = "getPaymentTransactions";

	/**
	 * 
	 */
	private static final String VALIDATE_USER_DETAILS = "validateUserDetails";

	/**
	 * 
	 */
	private static final String CONFIGURE_BRANCH = "configureBranch";

	/**
	 * 
	 */
	private static final String UPDATE_EMPLOYEE_DETAILS = "updateEmployeeDetails";

	/**
	 * 
	 */
	private static final String FETCH_EMPLOYEES = "fetchEmployees";

	/**
	 * 
	 */
	private static final String ADD_NEW_EMPLOYEE = "addNewEmployee";

	/**
	 * 
	 */
	private static final String GET_NEW_EMPLOYEE_NUMBER = "getNewEmployeeNo";

	/**
	 * 
	 */
	private static final String ADD_EMPLOYEE_LOGIN_DETAILS = "addEmployeeLoginDetails";

	/**
	 * 
	 */
	private static final String RETRIEVE_ENTITLEMENTS = "getEntitlements";

	/**
	 * 
	 */
	private static final String CHECK_IF_DEPOSIT_LOAN_AMOUNT_PAID_BACK = "checkIfDepositLoanAmountPaidBack";

	/**
	 * 
	 */
	private static final String STATUS_FAILURE = "FAILURE";

	/**
	 * 
	 */
	private static final String DEPOSIT_LOAN_RELEASE_FAILURE_DESCRIPTION = "Deposit loan cannot be released until the full principle payment is made";

	/**
	 * 
	 */
	private static final String STATUS_SUCCESS = "SUCCESS";

	/**
	 * 
	 */
	private static final String RELEASE_DEPOSIT_LOAN = "releaseDepositLoan";

	/**
	 * 
	 */
	private static final String SUCCESS_JEWEL_DESCRIPTION = "Successfully released the jewel loan";

	/**
	 * 
	 */
	private static final String SUCCESS_DEPOSIT_DESCRIPTION = "Successfully released the deposit loan";

	/**
	 * 
	 */
	private static final String JEWEL_LOAN_RELEASE_FAILURE_DESCRIPTION_PART1 = "Jewel loan cannot be release till deposit loan(s) ";

	/**
	 * 
	 */
	private static final String JEWEL_LOAN_RELEASE_FAILURE_DESCRIPTION_PART2 = " released";

	/**
	 * 
	 */
	private static final String JEWEL_LOAN_RELEASE_FAILURE_DESCRIPTION_PART3 = "Jewel loan cannot be released until the full principle payment is made";

	/**
	 * 
	 */
	private static final String CHECK_IF_JEWEL_LOAN_AMOUNT_PAID_BACK = "checkIfJewelLoanAmountPaidBack";

	/**
	 * 
	 */
	private static final String CHECK_DEPOSIT_LOANS_RELEASE_STATUS = "checkDepositLoansReleaseStatus";

	/**
	 * 
	 */
	private static final String RELEASE_JEWEL_LOAN = "releaseJewelLoan";

	/**
	 * 
	 */
	private static final String RELEASE_INDICATOR = "N";

	/**
	 * 
	 */
	private static final String JEWEL_LOAN = "JEWEL_LOAN";

	/**
	 * 
	 */
	private static final String DEPOSIT_LOAN = "DEPOSIT_LOAN";

	/**
	 * 
	 */
	private static final String GENERATE_JEWEL_LOAN_REPORT = "generateJewelLoanReport";

	/**
	 * 
	 */
	private static final String GENERATE_DEPOSIT_LOAN_REPORT = "generateDepositLoanReport";

	/**
	 * 
	 */
	private static final String JEWEL_LOAN_PAYMENT = "JEWEL_LOAN_PAYMENT";

	/**
	 * 
	 */
	private static final String DEPOSIT_LOAN_PAYMENT = "DEPOSIT_LOAN_PAYMENT";

	/**
	 * 
	 */
	private static final String GENERATE_JEWEL_LOAN_PAYMENT_REPORT = "generateJewelLoanPaymentReport";

	/**
	 * 
	 */
	private static final String GENERATE_DEPOSIT_LOAN_PAYMENT_REPORT = "generateDepositLoanPaymentReport";

	/**
	 * 
	 */
	private static final String GET_REPORT_METADATA_LIST = "getReportMetadataList";

	/**
	 * 
	 */
	private static final String ADD_LOAN = "addLoan";

	/**
	 * 
	 */
	private static final String ADD_LOAN_STORED_PROCEDURE = "add_jewel_loan";

	/**
	 * 
	 */
	private static final String DELETE_LOAN = "deleteLoan";

	/**
	 * 
	 */
	private static final String DELETE_LOAN_STORED_PROCEDURE = "delete_loan";

	/**
	 * 
	 */
	private static final String DELETE_EMPLOYEE_STORED_PROCEDURE = "delete_employee";

	/**
	 * 
	 */
	private static final String DELETE_EMPLOYEE = "deleteEmployee";

	/**
	 * 
	 */
	private static final String ADD_EMPLOYEE = "addEmployee";

	/**
	 * 
	 */
	private static final String ADD_EMPLOYEE_STORED_PROCEDURE = "add_employee";

	/**
	 * 
	 */
	private static final String SEARCH_CUSTOMER_BY_ID = "searchCustomerById";

	/**
	 * 
	 */
	private static final String SEARCH_CUSTOMER_BY_NAME = "searchCustomerByName";

	/**
	 * 
	 */
	private static final String CONSTANT_REPLACE_IDENTIFIER = "REPLACE_CUSTOMER_NAME_HERE";

	/**
	 * 
	 */
	private IDataLoader dataLoader;

	/**
	 * @return the dataLoader
	 */
	public IDataLoader getDataLoader() {
		return dataLoader;
	}

	/**
	 * @param dataLoader the dataLoader to set
	 */
	public void setDataLoader(IDataLoader dataLoader) {
		this.dataLoader = dataLoader;
	}


	/**
	 * @return
	 * @throws Exception
	 */
	public UserProfileVO retrieveUserDetails(String userId) throws Exception {
		log.info("Method Entry : DatabaseService.retrieveUserDetails " + userId);
		return dataLoader.retrieveUserDetails(userId, RETRIEVE_USER_DETAILS);
	}

	private Map<String, String> fileRepositoryLocationMap;

	public Map<String, String> getFileRepositoryLocationMap() {
		return fileRepositoryLocationMap;
	}

	public void setFileRepositoryLocationMap(
			Map<String, String> fileRepositoryLocationMap) {
		this.fileRepositoryLocationMap = fileRepositoryLocationMap;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public JewelMasterVO getJewelMaster() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelMaster ");
		JewelMasterVO jewelMaster = new JewelMasterVO();
		List<JewelCategoryVO> jewelCategory = dataLoader.getJewelCategory(RETRIEVE_JEWEL_CATEGORY);
		List<JewelQualityVO> jewelQualities = dataLoader.getJewelQualities(RETRIEVE_JEWEL_QUALITIES);
		Map<String, List<JewelTypesVO>> tempMap = new HashMap<String, List<JewelTypesVO>>();
		if(jewelCategory != null && jewelQualities != null) {
			for(JewelCategoryVO category : jewelCategory) {
				if(category != null) {
					List<JewelTypesVO> jewelTypes = null;
					if(!tempMap.containsKey(category.getJewelCategoryId())) {
						jewelTypes = new ArrayList<JewelTypesVO>();
						JewelTypesVO jewelType = new JewelTypesVO(category.getJewelTypeId(), category.getJewelTypeName());
						jewelTypes.add(jewelType);
						tempMap.put(category.getJewelCategoryId(), jewelTypes);
					} else {
						jewelTypes = tempMap.get(category.getJewelCategoryId());
						JewelTypesVO jewelType = new JewelTypesVO(category.getJewelTypeId(), category.getJewelTypeName());
						jewelTypes.add(jewelType);
					}
				}
			}
			List<JewelCategoryVO> jewelCatoryList = new ArrayList<JewelCategoryVO>();
			if(!tempMap.isEmpty()) {
				Set entrySet = tempMap.entrySet();
				Iterator iterator = entrySet.iterator();
				while(iterator.hasNext()) {
					Entry entry = (Entry) iterator.next();
					JewelCategoryVO temp = new JewelCategoryVO();
					temp.setJewelCategoryId((String)entry.getKey());
					JewelCategoryVO category = jewelCategory.get(jewelCategory.indexOf(temp));
					category.setJewelCategoryTypes((List<JewelTypesVO>)entry.getValue());
					jewelCatoryList.add(category);
				}
			}
		}
		jewelMaster.setJewelCategory(jewelCategory);
		jewelMaster.setJewelTypes(jewelQualities);
		return jewelMaster;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelQualityVO> getJewelQualities() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelQualities ");
		List<JewelQualityVO> jewelQualities = dataLoader.getJewelQualities(RETRIEVE_JEWEL_QUALITIES);
		return jewelQualities;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelSchemeVO> getJewelSchemes() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelSchemes ");
		List<JewelSchemeVO> jewelSchemes = dataLoader.getJewelSchemes(RETRIEVE_JEWEL_SCHEMES);
		List<JewelSchemeVO> jewelSchemeQuality = dataLoader.getJewelSchemes(RETRIEVE_JEWEL_SCHEMES_QUALITY);
		List<JewelSchemeVO> jewelSchemeInterests = dataLoader.getJewelSchemes(RETRIEVE_JEWEL_SCHEMES_INTERESTS); 
		if(jewelSchemes != null && !jewelSchemes.isEmpty()) {
			Map<String, JewelSchemeVO> temp = new HashMap<String, JewelSchemeVO>();
			for(JewelSchemeVO scheme : jewelSchemes) {
				if(scheme != null) {
					if(!temp.containsKey("" + scheme.getJewelSchemeId())) {
						if(scheme.getPossibleFlexiMonth() != 0)
							scheme.addFlexiMonths("" + scheme.getPossibleFlexiMonth());
						temp.put("" + scheme.getJewelSchemeId(), scheme);
					} else {
						temp.get("" + scheme.getJewelSchemeId()).addFlexiMonths("" + scheme.getPossibleFlexiMonth());
					}
				}
			}

			for(JewelSchemeVO scheme : jewelSchemeQuality) {
				if(scheme != null) {
					temp.get("" + scheme.getJewelSchemeId()).addJewelSchemeQualityRate(scheme);
				}
			}

			for(JewelSchemeVO scheme : jewelSchemeInterests) {
				if(scheme != null) {
					temp.get("" + scheme.getJewelSchemeId()).addJewelSchemeInterest(scheme);
				}
			}

			jewelSchemes = new ArrayList<JewelSchemeVO>();
			if(!temp.isEmpty()) {
				Set entrySet = temp.entrySet();
				Iterator iterator = entrySet.iterator();
				while(iterator.hasNext()) {
					Entry entry = (Entry) iterator.next();
					jewelSchemes.add((JewelSchemeVO)entry.getValue());
				}
			}
		}
		return jewelSchemes;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelLoanTypeVO> getJewelLoanTypes() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelLoanTypes ");
		List<JewelLoanTypeVO> jewelLoanTypes = dataLoader.getJewelLoanTypes(RETRIEVE_JEWEL_LOAN_TYPES);
		return jewelLoanTypes;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelLoanModeVO> getJewelLoanModes() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelLoanModes ");
		List<JewelLoanModeVO> jewelLoanTypes = dataLoader.getJewelLoanModes(RETRIEVE_JEWEL_LOAN_MODES);
		return jewelLoanTypes;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelTakeOverFromVO> getJewelTakeOverFrom() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		List<JewelTakeOverFromVO> jewelLoanTypes = dataLoader.getJewelTakeOverFrom(RETRIEVE_JEWEL_TAKE_OVER_FROM);
		return jewelLoanTypes;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<PaymentTypeVO> getPaymentTypes() throws Exception {
		log.info("Method Entry : DatabaseService.getPaymentTypes ");
		List<PaymentTypeVO> paymentTypes = dataLoader.getPaymentTypes(RETRIEVE_PAYMENT_TYPES);
		return paymentTypes;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositPlaceVO> getDepositPlaces() throws Exception {
		log.info("Method Entry : DatabaseService.getDepositPlaces ");
		List<DepositPlaceVO> depositPlaces = dataLoader.getDepositPlaces(RETRIEVE_DEPOSIT_PLACES);
		return depositPlaces;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositLoanAccountHoldersVO> getDepositLoanAccountHolders() throws Exception {
		log.info("Method Entry : DatabaseService.getDepositLoanAccountHolders ");
		List<DepositLoanAccountHoldersVO> depositAcctHolders = dataLoader.getDepositLoanAccountHolders(RETRIEVE_DEPOSIT_LOAN_ACCT_HOLDERS);
		return depositAcctHolders;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public BranchDetailsVO getBranchDetails(BranchDetailsVO branchDetailVO) throws Exception {
		log.info("Method Entry : DatabaseService.getBranchDetails ");
		BranchDetailsVO branchDetails = dataLoader.getBranchDetails(RETRIEVE_BRANCH_DETAILS,branchDetailVO);
		return branchDetails;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<ReleaseTypeVO> getReleaseTypes() throws Exception {
		log.info("Method Entry : DatabaseService.getReleaseTypes ");
		List<ReleaseTypeVO> releaseTypes = dataLoader.getReleaseTypes(RETRIEVE_RELEASE_TYPES);
		return releaseTypes;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositLoanInterestPeriodVO> getDepositLoanInterestPeriods() throws Exception {
		log.info("Method Entry : DatabaseService.getDepositLoanInterestPeriods ");
		List<DepositLoanInterestPeriodVO> depositLoanInterestPeriods = dataLoader.getDepositLoanInterestPeriods(RETRIEVE_DEPOSIT_LOAN_INTEREST_PERIODS);
		return depositLoanInterestPeriods;
	}

	public List<EntitlementsVO> getEntitlements() throws Exception {
		log.info("Method Entry : DatabaseService.getEntitlements ");
		return dataLoader.getEntitlements(RETRIEVE_ENTITLEMENTS);
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelCategoryVO> getJewelCategories() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelCategories ");
		JewelMasterVO jewelMaster = new JewelMasterVO();
		List<JewelCategoryVO> jewelCategory = dataLoader.getJewelCategory(RETRIEVE_JEWEL_CATEGORY);
		Map<String, List<JewelTypesVO>> tempMap = new LinkedHashMap<String, List<JewelTypesVO>>();
		List<JewelCategoryVO> jewelCatoryList = null;
		if(jewelCategory != null) {
			for(JewelCategoryVO category : jewelCategory) {
				if(category != null) {
					List<JewelTypesVO> jewelTypes = null;
					if(!tempMap.containsKey(category.getJewelCategoryId())) {
						jewelTypes = new ArrayList<JewelTypesVO>();
						JewelTypesVO jewelType = new JewelTypesVO(category.getJewelTypeId(), category.getJewelTypeName());
						jewelTypes.add(jewelType);
						tempMap.put(category.getJewelCategoryId(), jewelTypes);
					} else {
						jewelTypes = tempMap.get(category.getJewelCategoryId());
						JewelTypesVO jewelType = new JewelTypesVO(category.getJewelTypeId(), category.getJewelTypeName());
						jewelTypes.add(jewelType);
					}
				}
			}
			jewelCatoryList = new ArrayList<JewelCategoryVO>();
			if(!tempMap.isEmpty()) {
				Set entrySet = tempMap.entrySet();
				Iterator iterator = entrySet.iterator();
				while(iterator.hasNext()) {
					Entry entry = (Entry) iterator.next();
					JewelCategoryVO temp = new JewelCategoryVO();
					temp.setJewelCategoryId((String)entry.getKey());
					JewelCategoryVO category = jewelCategory.get(jewelCategory.indexOf(temp));
					category.setJewelCategoryTypes((List<JewelTypesVO>)entry.getValue());
					jewelCatoryList.add(category);
				}
			}
		}
		return jewelCatoryList;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public Map<String, List<ReportMetadata>> getReportMetadataList() throws Exception {
		log.info("Method Entry : DatabaseService.getReportMetadataList ");
		Map<String, List<ReportMetadata>> tempRef = null;
		List<ReportMetadata> reportMetadataList = null;
		reportMetadataList = dataLoader.getReportMetadataList(GET_REPORT_METADATA_LIST);
		if(reportMetadataList != null && !reportMetadataList.isEmpty()) {
			tempRef = new HashMap<String, List<ReportMetadata>>();
			for(ReportMetadata reportMetadata : reportMetadataList) {
				if(reportMetadata != null) {
					if(!tempRef.containsKey(reportMetadata.getReportName())) {
						List<ReportMetadata> data = new ArrayList<ReportMetadata>();
						data.add(reportMetadata);
						tempRef.put(reportMetadata.getReportName(), data);
					} else {
						tempRef.get(reportMetadata.getReportName()).add(reportMetadata);
					}
				}
			}
		}
		return tempRef;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public ApplicationComponentsDataVO retrieveApplicationComponentsData(BranchDetailsVO branchDetailVO) throws Exception {
		ApplicationComponentsDataVO applicationComponentsDataVO = new ApplicationComponentsDataVO();
		try{ 
			log.info("Method Entry : DatabaseService.retrieveApplicationComponentsData ");
			applicationComponentsDataVO.setJewelCategories(getJewelCategories());
			applicationComponentsDataVO.setJewelSchemes(getJewelSchemes());
			applicationComponentsDataVO.setJewelLoanTypes(getJewelLoanTypes());
			applicationComponentsDataVO.setJewelTakeOverFrom(getJewelTakeOverFrom());
			applicationComponentsDataVO.setJewelQualities(getJewelQualities());
			//	Note this is not payment types, it is re-payment types
			//	this needs to be changed during later part of implementation
			applicationComponentsDataVO.setPaymentTypes(getPaymentTypes());
			//applicationComponentsDataVO.setDepositPlaces(getDepositPlaces());
			//applicationComponentsDataVO.setDepositAccountHolders(getDepositLoanAccountHolders());

			applicationComponentsDataVO.setBranchDetails(getBranchDetails(branchDetailVO));

			applicationComponentsDataVO.setReleaseTypes(getReleaseTypes());
			//applicationComponentsDataVO.setDepositLoanInterestPeriods(getDepositLoanInterestPeriods());
			applicationComponentsDataVO.setEntitlements(getEntitlements());
			//applicationComponentsDataVO.setReportMetadataList(getReportMetadataList());
			applicationComponentsDataVO.setJewelLoanModes(getJewelLoanModes());
			applicationComponentsDataVO.setAllBranchDetails(getAllBranchDetails());

			log.info("Satrt- new customer drop down list value retrieval");
			applicationComponentsDataVO.setEducationList(getEducationList());
			applicationComponentsDataVO.setNationalityList(getNationalityList());
			applicationComponentsDataVO.setOccupationList(getOccupationList());
			applicationComponentsDataVO.setBankAcctTypeList(getBankAcctTypeList());		
			applicationComponentsDataVO.setIdNAddressList(getIdNAddrProofList());		
			applicationComponentsDataVO.setGenderList(getGenderList());		
			applicationComponentsDataVO.setMaritalStatusList(getMaritalStatusList());		
			log.info("End- new customer drop down list value retrieval");

			log.info("Satrt- get application config data");
			applicationComponentsDataVO.setBranchConfigData(getBranchConfigData(branchDetailVO));
			log.info("End- get application config data");

			log.info("Info : Done with retrieveApplicationComponentsData and returning back to the caller");
		}catch(Exception ex){
			log.error("Error during DatabaseService.retrieveApplicationComponentsData ", ex);
		}

		return applicationComponentsDataVO;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelSchemeVO> addJewelScheme(JewelSchemeVO jewelScheme) throws Exception {
		log.info("Method Entry : DatabaseService.addJewelScheme ");
		List<JewelSchemeVO> jewelSchemeList = null;
		try {
			dataLoader.addJewelScheme(ADD_NEW_JEWEL_SCHEME, jewelScheme);
			log.info("New Jewel Scheme added successfully ");
			jewelSchemeList = dataLoader.getJewelSchemes(RETRIEVE_JEWEL_SCHEMES);
			log.info("Retrieved the updated JewelScheme list");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.addNewJewelScheme ", ex);
		}
		return jewelSchemeList;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<JewelTakeOverFromVO> addTakeOverFrom(JewelTakeOverFromVO jewelTakeOverFromVO) throws Exception {
		log.info("Method Entry : DatabaseService.addTakeOverFrom ");
		List<JewelTakeOverFromVO> jewelTakeOverFromList = null;
		try {
			dataLoader.addTakeOverFrom(ADD_NEW_TAKE_OVER_FROM, jewelTakeOverFromVO);
			log.info("Take Over from added successfully ");
			jewelTakeOverFromList = dataLoader.getJewelTakeOverFrom(RETRIEVE_JEWEL_TAKE_OVER_FROM);
			log.info("Retrieved the updated JewelTakeOverFrom list");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.addTakeOverFrom ", ex);
		}
		return jewelTakeOverFromList;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositPlaceVO> addDepositPlace(DepositPlaceVO depositPlaceVO) throws Exception {
		log.info("Method Entry : DatabaseService.addDepositPlace ");
		List<DepositPlaceVO> depositPlaceVOList = null;
		try {
			dataLoader.addDepositPlace(ADD_NEW_DEPOSIT_PLACE, depositPlaceVO);
			log.info("New Deposit Place added successfully ");
			depositPlaceVOList = dataLoader.getDepositPlaces(RETRIEVE_DEPOSIT_PLACES);
			log.info("Retrieved the deposit places list");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.addDepositPlace ", ex);
		}
		return depositPlaceVOList;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositLoanAccountHoldersVO> addDepositAccountHolderName(DepositLoanAccountHoldersVO depositLoanAccountHoldersVO) throws Exception {
		log.info("Method Entry : DatabaseService.depositLoanAccountHoldersVO ");
		List<DepositLoanAccountHoldersVO> depositLoanAccountHoldersVOList = null;
		try {
			dataLoader.addDepositAccountHolderName(ADD_NEW_DEPOSIT_LOAN_ACCT_HOLDER, depositLoanAccountHoldersVO);
			log.info("Deposit Loan Account Holder added successfully ");
			depositLoanAccountHoldersVOList = dataLoader.getDepositLoanAccountHolders(RETRIEVE_DEPOSIT_LOAN_ACCT_HOLDERS);
			log.info("Retrieved the updated Deposit Loan Account Holder list");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.addDepositAccountHolderName ", ex);
		}
		return depositLoanAccountHoldersVOList;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<DepositLoanInterestPeriodVO> addDepositLoanInterestPeriod(DepositLoanInterestPeriodVO depositLoanInterestPeriodVO) throws Exception {
		log.info("Method Entry : DatabaseService.addDepositLoanInterestPeriod ");
		List<DepositLoanInterestPeriodVO> depositLoanInterestPeriodVOList = null;
		try {
			dataLoader.addDepositLoanInterestPeriod(ADD_NEW_DEPOSIT_LOAN_INTEREST_PERIOD, depositLoanInterestPeriodVO);
			log.info("Deposit Loan Interest Period added successfully ");
			depositLoanInterestPeriodVOList = dataLoader.getDepositLoanInterestPeriods(RETRIEVE_DEPOSIT_LOAN_INTEREST_PERIODS);
			log.info("Retrieved the updated DepositLoanInterestPeriodVO list");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.DepositLoanInterestPeriodVO ", ex);
		}
		return depositLoanInterestPeriodVOList;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	/*	public int addNewJewelLoan() throws Exception {
		log.info("Method Entry : DatabaseService.addNewJewelLoan ");
		int jewelLoanNo = 0;
		try {
			dataLoader.addNewJewelLoan(ADD_NEW_JEWEL_LOAN);
			log.info("loan entry inserted successfully");
		} catch(Exception ex) {
			log.error("Error during addNewJewelLoan ", ex);
		}
		JewelLoanTransactionVO jewelLoan  = dataLoader.getNewJewelLoanNo(GET_NEW_JEWEL_LOAN_NUMBER);
		log.info("loan entry retrieved successfully");
		if(jewelLoan != null) {
			jewelLoanNo = jewelLoan.getJewelLoanNo();
		}
		log.info("Returning Jewel Loan No " + jewelLoanNo);
		return jewelLoanNo;
	}*/

	/**
	 * @return
	 * @throws Exception
	 */
	public int addNewDepositLoan() throws Exception {
		log.info("Method Entry : DatabaseService.addNewDepositLoan ");
		int depositLoanNo = 0;
		try {
			dataLoader.addNewDepositLoan(ADD_NEW_DEPOSIT_LOAN);
			log.info("addNewDepositLoan done");
		} catch(Exception ex) {
			log.error("Error during addNewDepositLoan ", ex);
		}
		DepositLoanTransactionVO depositLoan  = dataLoader.getNewDepositLoanNo(GET_NEW_DEPOSIT_LOAN_NUMBER);
		log.info("getNewDepositLoanNo done");
		if(depositLoan != null) {
			depositLoanNo = depositLoan.getDeposit_loan_no();
		}
		log.info("Returning Deposit Loan No " + depositLoanNo);
		return depositLoanNo;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public boolean addNewDepositLoanDetails(DepositLoanTransactionVO depositLoanTransaction) throws Exception {
		log.info("Method Entry : DatabaseService.addNewDepositLoanDetails ");
		boolean status = false;
		try {
			if(depositLoanTransaction != null) {
				//	Update Deposit Loan details 
				log.info("Ledger Loan indicator " + depositLoanTransaction.getLedgerLoan());
				if(depositLoanTransaction.getLedgerLoan().equalsIgnoreCase(RELEASE_INDICATOR))
					dataLoader.updateNewDepositLoanDetails(UPDATE_NEW_DEPOSIT_LOAN_DETAILS, depositLoanTransaction);
				else 
					dataLoader.updateNewDepositLoanDetails(INSERT_NEW_DEPOSIT_LOAN_DETAILS, depositLoanTransaction);
				log.info("updateNewDepositLoanDetails done");
				//	Update Deposit Loan Asset Split-up details
				if(depositLoanTransaction.getLoanAssetSplitUp() != null && !depositLoanTransaction.getLoanAssetSplitUp().isEmpty()) {
					for(LoanAssestSplitUpVO asset : depositLoanTransaction.getLoanAssetSplitUp()) {
						if(asset != null) {
							asset.setTransactionTypeId(depositLoanTransaction.getTransactionTypeId());
							asset.setLoan_no(depositLoanTransaction.getLoanNo());
							asset.setDepositLoanNo(depositLoanTransaction.getDeposit_loan_no());
							dataLoader.updateLoanAssetSplitUpDetails(UPDATE_NEW_LOAN_ASSET_SPLIT_UP_DETAILS, asset);
							log.info("Asset details added successfully");
						}
					}
				}
				status = true;
				log.info("Update Jewel Loan details " + status);
			}
		} catch(Exception ex) {
			log.error("Error during DatabaseService.addNewDepositLoanDetails ", ex);
		}
		return status;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public SearchResponseVO performLoanNoSearch(SearchRequestVO searchRequestVO) throws Exception {
		log.info("Method Entry : DatabaseService.performLoanNoSearch ");
		SearchResponseVO searchResponseVO = null;
		try {
			if(searchRequestVO != null) {
				searchResponseVO = new SearchResponseVO();
				JewelLoanTransactionVO jewelLoanTransactionVO = null;
				DepositLoanTransactionVO depositLoanTransactionVO = null;
				LoanAssestSplitUpVO loanAssestSplitUpVO = new LoanAssestSplitUpVO();
				loanAssestSplitUpVO.setLoan_no(searchRequestVO.getLoanNo());
				PaymentTransactionVO paymentTransactionVO = new PaymentTransactionVO();
				paymentTransactionVO.setLoanNo(searchRequestVO.getLoanNo());
				List<LoanAssestSplitUpVO> splitUp = null;
				if(searchRequestVO.getTransactionTypeId() == 1) {
					jewelLoanTransactionVO = new JewelLoanTransactionVO();
					jewelLoanTransactionVO.setJewelLoanNo(searchRequestVO.getLoanNo());
					jewelLoanTransactionVO = dataLoader.getJewelLoanDetails(GET_JEWEL_LOAN_DETAILS, jewelLoanTransactionVO);
					log.info("getJewelLoanDetails done");
					loanAssestSplitUpVO.setTransactionTypeId(searchRequestVO.getTransactionTypeId());
					paymentTransactionVO.setTransactionTypeId(searchRequestVO.getTransactionTypeId());			
					splitUp = dataLoader.getLoanAssetBreakUp(GET_JEWEL_LOAN_ASSET_BREAKUP, loanAssestSplitUpVO);
				} else {
					depositLoanTransactionVO = new DepositLoanTransactionVO();
					depositLoanTransactionVO.setDeposit_loan_no(searchRequestVO.getLoanNo());
					depositLoanTransactionVO = dataLoader.getDepositLoanDetails(GET_DEPOSIT_LOAN_DETAILS, depositLoanTransactionVO);
					if(depositLoanTransactionVO != null)
						depositLoanTransactionVO.setDeposit_loan_no(searchRequestVO.getLoanNo());
					log.info("getDepositLoanDetails done");
					loanAssestSplitUpVO.setTransactionTypeId(searchRequestVO.getTransactionTypeId());
					paymentTransactionVO.setTransactionTypeId(searchRequestVO.getTransactionTypeId());
					splitUp = dataLoader.getLoanAssetBreakUp(GET_DEPOSIT_LOAN_ASSET_BREAKUP, loanAssestSplitUpVO);
				}
				log.info("getLoanAssetBreakUp done");
				if(jewelLoanTransactionVO != null && splitUp != null && !splitUp.isEmpty())
					jewelLoanTransactionVO.setLoanAssetSplitUp(splitUp);
				if(depositLoanTransactionVO != null && splitUp != null && !splitUp.isEmpty()) {
					depositLoanTransactionVO.setLoanAssetSplitUp(splitUp);
					depositLoanTransactionVO.setJewelLoanNo(splitUp.get(0).getLoan_no());
				}
				List<PaymentTransactionVO> transactionVOList = dataLoader.getPaymentTransations(GET_PAYMENT_TRANSACTIONS, paymentTransactionVO);
				log.info("getPaymentTransations done");
				if(jewelLoanTransactionVO != null && transactionVOList != null && !transactionVOList.isEmpty())
					jewelLoanTransactionVO.setPaymentTransactions(transactionVOList);
				if(depositLoanTransactionVO != null && transactionVOList != null && !transactionVOList.isEmpty())
					depositLoanTransactionVO.setPaymentTransactions(transactionVOList);
				searchResponseVO.setJewelLoanTransactionVO(jewelLoanTransactionVO);
				searchResponseVO.setDepositLoanTransactionVO(depositLoanTransactionVO);
			}
		} catch(Exception ex) {
			log.error("Error during DatabaseService.performLoanNoSearch ", ex);
		}
		return searchResponseVO;
	}

	/**
	 * @param customerVO
	 * @return
	 * @throws Exception
	 */
	public int addNewCustomer(CustomerVO customerVO) throws Exception {
		log.info("Method Entry : DatabaseService.addNewCustomer ");
		int customerId = 0;
		try {
			handleCustomerPhotoProof(customerVO);
			dataLoader.addNewCustomer(ADD_NEW_CUSTOMER, customerVO);
			customerId = customerVO.getCustomerId();

			return customerId;

		} catch(Exception ex) {
			log.error("Error during DatabaseService.addNewCustomer ", ex);
			System.out.println(ex);
			return customerId;
		}
	}

	private void handleCustomerPhotoProof(CustomerVO customerVO) throws Exception{
		log.info("Method Entry : DatabaseService.handleCustomerPhotoProof");

		log.info("Saving Customer Photo");
		String photoRef = fileRepositoryLocationMap.get(ApplicationConstants.CUSTOMER_DIRECTORY_KEY) + customerVO.getCustomerId() + ApplicationConstants.SUFFIX_CUSTOMER_DOCS;
		String fileName = customerVO.getCustomerId() + ApplicationConstants.CUSTOMER_PHOTO;
		if(saveToFile(photoRef, fileName, customerVO.getCustomerPhoto())){
			customerVO.setCustPhotoPath(photoRef+"\\"+fileName);
		}

		log.info("Saving Customer Id Proof Photo");
		fileName = customerVO.getCustomerId() + ApplicationConstants.CUSTOMER_ID_PHOTO;
		if(saveToFile(photoRef, fileName, customerVO.getIdProofPhoto())){
			customerVO.setCustIdProofPhotoPath(photoRef+"\\"+fileName);
		}

		log.info("Saving Customer Addr Proof Photo");
		fileName = customerVO.getCustomerId() + ApplicationConstants.CUSTOMER_ADDR_PHOTO;
		if(saveToFile(photoRef, fileName, customerVO.getAddressProofPhoto())){
			customerVO.setCustAddrProofPhotoPath(photoRef+"\\"+fileName);
		}

		log.info("Saving Customer Pancard Photo");
		fileName = customerVO.getCustomerId() + ApplicationConstants.CUSTOMER_PANCARD_PHOTO;
		if(saveToFile(photoRef, fileName, customerVO.getPanCardPhoto())){
			customerVO.setCustPancardPhotoPath(photoRef+"\\"+fileName);
		}
	}

	/**
	 * @param customerVO
	 * @return
	 * @throws Exception
	 */
	public boolean updateCustomerDetail(CustomerVO customerVO) throws Exception {
		log.info("Method Entry : DatabaseService.updateCustomerDetail ");
		try {
			handleCustomerPhotoProof(customerVO);
			dataLoader.updateCustomerDetail(ApplicationConstants.UPDATE_CUSTOMER_DETAIL, customerVO);
			log.info("Customer Details Updated Successfully Id: "+customerVO.getCustomerId());

			return true;

		} catch(Exception ex) {
			log.error("Error during DatabaseService.updateCustomerDetail ", ex);

		}
		return false;
	}

	/**
	 * @param jewelLoanTransactionVO
	 * @return
	 * @throws Exception
	 */
	public boolean addNewJewelLoanDetails(JewelLoanTransactionVO jewelLoanTransactionVO) throws Exception {
		log.info("Method Entry : DatabaseService.addNewJewelLoanDetails ");
		try {
			if(jewelLoanTransactionVO != null) {				

				//converting date format
				String farmatedDate = formatDate(jewelLoanTransactionVO.getJewel_loan_transaction_date());
				log.info("farmatedDate : "+farmatedDate);
				jewelLoanTransactionVO.setJewel_loan_transaction_date(farmatedDate);

				//	Update Jewel Loan details 
				log.info("Saving Customer Photo");

				String filePath = fileRepositoryLocationMap.get(ApplicationConstants.JEWEL_LOAN_DIRECTORY_KEY) + 
						ApplicationConstants.PREFIX_LOAN_TYPE + jewelLoanTransactionVO.getJewelLoanType() + "\\" +
						jewelLoanTransactionVO.getJewelLoanNo() + ApplicationConstants.SUFFIX_LOAN_DOCS;		
				
				String fileName = jewelLoanTransactionVO.getCustomerDetails().getCustomerId() + ApplicationConstants.CUSTOMER_PHOTO;
				if(saveToFile(filePath,fileName,jewelLoanTransactionVO.getCustomerPhoto()))
					jewelLoanTransactionVO.setCustomerPhotoPath(filePath+"\\"+fileName);

				log.info("Saving Jewel Photo");
				fileName = jewelLoanTransactionVO.getJewelLoanNo() + ApplicationConstants.JEWEL_PHOTO;
				if(saveToFile(filePath,fileName, jewelLoanTransactionVO.getJewelPhoto()))
					jewelLoanTransactionVO.setJewelPhotoPath(filePath+"\\"+fileName);

				/*log.info("Making Take over place entry");
				if(jewelLoanTransactionVO.getJewelTakeOverFromPlace() != null) {
					int placeId = dataLoader.addJewelTakeOverFromPlace(ADD_NEW_JEWEL_TAKE_OVER_FROM_PLACE_STORED_PROCEDURE, ADD_NEW_JEWEL_TAKE_OVER_FROM_PLACE, jewelLoanTransactionVO);
					jewelLoanTransactionVO.setJewelTakeOverFromPlaceId(placeId);
				}*/

				dataLoader.updateNewJewelLoanDetails(INSERT_NEW_JEWEL_LOAN_DETAILS, jewelLoanTransactionVO);
				log.info("New Jewel loan details updated successfully");				
				//	Update Jewel Loan Asset Split-up details				
				if(jewelLoanTransactionVO.getLoanAssetSplitUp() != null && !jewelLoanTransactionVO.getLoanAssetSplitUp().isEmpty()) {
					for(LoanAssestSplitUpVO asset : jewelLoanTransactionVO.getLoanAssetSplitUp()) {
						if(asset != null) {
							asset.setTransactionTypeId(jewelLoanTransactionVO.getTransactionTypeId());
							asset.setLoan_no(jewelLoanTransactionVO.getJewelLoanNo());
							asset.setJewelLoanType(jewelLoanTransactionVO.getJewelLoanType());
							dataLoader.updateLoanAssetSplitUpDetails(UPDATE_NEW_LOAN_ASSET_SPLIT_UP_DETAILS, asset);
							log.info("Asset details added successfully");
						}
					}
				}
				log.info("Update Jewel Loan details: " + true);
				return true;
			}
		} catch(Exception ex) {
			log.error("Error during DatabaseService.addNewJewelLoanDetails ", ex);
			return false;
		}
		return false;
	}

	public static boolean saveToFile(String filePath,String fileName, byte[] byteArray) throws Exception {
		boolean fileWriteStatus = false;
		try {
			ByteArrayInputStream bArray = new ByteArrayInputStream(byteArray);
			BufferedImage img = ImageIO.read(bArray);
			File outputfilePath = new File(filePath);
			if(!outputfilePath.exists()){
				outputfilePath.mkdir();
			}
			File outputfile = new File(filePath+"\\"+fileName);
			ImageIO.write(img, "jpg", outputfile);
			fileWriteStatus = true;
		} catch (Exception e) {
			log.error("Error while writing image to the directory ", e);
			throw e;
		}
		log.info("Image write status " + fileWriteStatus);
		return fileWriteStatus;
	}


	/**
	 * @param paymentTransactionVO
	 * @return
	 * @throws Exception
	 */
	public List<PaymentTransactionVO> addLoanInterestPayment(PaymentTransactionVO paymentTransactionVO) throws Exception {
		log.info("Method Entry : DatabaseService.addLoanInterestPayment ");
		List<PaymentTransactionVO> paymentTrnsactionList = null;
		try {
			if(paymentTransactionVO.getPaymentTypeId() == 2) {
				paymentTransactionVO.setPrincipal_amount(paymentTransactionVO.getInterest_amount());
				paymentTransactionVO.setInterest_amount(null);
			}
			dataLoader.addLoanInterestPayment(ADD_NEW_LOAN_INTEREST_PAYMENT_DETAILS, paymentTransactionVO);
			log.info("addLoanInterestPayment done ");
			paymentTrnsactionList = new ArrayList<PaymentTransactionVO>(); 
			paymentTrnsactionList = dataLoader.getPaymentTransactionDetails(GET_PAYMENT_TRANSACTION_DETAILS, paymentTransactionVO);
			log.info("addLoanInterestPayment done ");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.addLoanInterestPayment ", ex);
		}
		return paymentTrnsactionList;
	}

	/**
	 * @param userProfileVO
	 * @return
	 * @throws Exception
	 */
	public UserProfileVO validateUser(UserProfileVO userProfileVO) throws Exception {
		log.info("Method Entry : DatabaseService.validateUser ");
		UserProfileVO userProfile = null;
		try {
			userProfile = dataLoader.validateUser(VALIDATE_USER_DETAILS, userProfileVO);
			log.info("Retrieved user profile ");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.validateUser ", ex);
		}
		return userProfile;
	}

	/**
	 * @param branchDetailsVO
	 * @return
	 * @throws Exception
	 */
	public boolean configureBranch(BranchDetailsVO branchDetailsVO) throws Exception {
		log.info("Method Entry : DatabaseService.configureBranch ");
		boolean status = false;
		try {
			dataLoader.configureBranch(CONFIGURE_BRANCH, branchDetailsVO);
			status = true;
			log.info("Configured Branch Details");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.configureBranch ", ex);
		}
		return status;
	}

	/**
	 * @param employee
	 * @return
	 * @throws Exception
	 */
	public boolean updateEmployeeDetails(EmployeeVO employee) throws Exception {
		log.info("Method Entry : DatabaseService.updateEmployeeDetails ");
		boolean status = false;
		try {
			dataLoader.updateEmployeeDetails(UPDATE_EMPLOYEE_DETAILS, employee);
			dataLoader.updateEmployeeLoginDetails(ADD_EMPLOYEE_LOGIN_DETAILS, employee);
			status = true;
			log.info("Employee details persisted successfully");
		} catch(Exception ex) {
			log.error("Error during DatabaseService.updateEmployeeDetails ", ex);
		}
		return status;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeVO> fetchEmployees() throws Exception {
		log.info("Method Entry : DatabaseService.fetchEmployees ");
		List<EmployeeVO> employees = null;
		try {
			employees = dataLoader.fetchEmployees(FETCH_EMPLOYEES);
			log.info("Retrieved Employees details successfully " + employees);
		} catch(Exception ex) {
			log.error("Error during DatabaseService.fetchEmployees ", ex);
		}
		return employees;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public int addNewEmployee() throws Exception {
		log.info("Method Entry : DatabaseService.addNewEmployee ");
		int employeeId = 0;
		try {
			dataLoader.addNewEmployee(ADD_NEW_EMPLOYEE);
			log.info("New Employee record inserted successfully");
		} catch(Exception ex) {
			log.error("Error during addNewEmployee ", ex);
		}
		EmployeeVO employee  = dataLoader.getNewEmployeeNo(GET_NEW_EMPLOYEE_NUMBER);
		log.info("New Employee record retrieved successfully");
		if(employee != null) {
			employeeId = employee.getEmployeeId();
		}
		log.info("Returning New Employee Id " + employeeId);
		return employeeId;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public ResponseVO releaseLoan(SearchRequestVO searchRequestVO) throws Exception {
		log.info("Method Entry : DatabaseService.releaseLoan ");
		log.info("Loan#: "+searchRequestVO.getLoanNo());
		ResponseVO responseVO = null;
		try {
			if(searchRequestVO.getTransactionTypeId() == 1) {
				log.info("Release Jewel Loan");
				List<DepositLoanTransactionVO> depositLoans = dataLoader.checkDepositLoansReleaseStatus(CHECK_DEPOSIT_LOANS_RELEASE_STATUS, searchRequestVO);
				String activeJewDepositLoans = "";
				if(depositLoans != null && !depositLoans.isEmpty()) {					
					for(DepositLoanTransactionVO depositLoan : depositLoans) {
						if(depositLoan != null) {
							if(!RELEASE_INDICATOR.equalsIgnoreCase(depositLoan.getActive_flag()))
								activeJewDepositLoans += depositLoan.getDeposit_loan_no() + ","; 
						}
					}
					if(activeJewDepositLoans.length() > 0) {
						activeJewDepositLoans = activeJewDepositLoans.substring(0, activeJewDepositLoans.length() -1);
						log.info("Deposit loan(s) is(are) not yet released with " + activeJewDepositLoans);					
						responseVO = new ResponseVO();
						responseVO.setStatus(STATUS_FAILURE);
						responseVO.setDescription(JEWEL_LOAN_RELEASE_FAILURE_DESCRIPTION_PART1 + activeJewDepositLoans + JEWEL_LOAN_RELEASE_FAILURE_DESCRIPTION_PART2);
					}
				} 
				if(activeJewDepositLoans.length() == 0) {
					log.info("Deposit loans associated with the jewel loan is released, hence checking status on full payment");
					responseVO = dataLoader.isPrincipleAmountPaidBack(CHECK_IF_JEWEL_LOAN_AMOUNT_PAID_BACK, searchRequestVO);
					if(responseVO == null) {
						responseVO = new ResponseVO();
						responseVO.setStatus(STATUS_FAILURE);
						responseVO.setDescription(JEWEL_LOAN_RELEASE_FAILURE_DESCRIPTION_PART3);
					} else {
						log.info("Full Jewel loan payment is made and updating the staus to release");
						dataLoader.releaseDepositLoan(RELEASE_JEWEL_LOAN, searchRequestVO);
						log.info("done with jewel loan release");
						responseVO.setDescription(SUCCESS_JEWEL_DESCRIPTION);
					}
				}
			} else {
				log.info("Release Deposit Loan");
				responseVO = dataLoader.isPrincipleAmountPaidBack(CHECK_IF_DEPOSIT_LOAN_AMOUNT_PAID_BACK, searchRequestVO);
				if(responseVO == null) {
					log.info("Deposit loan cannot be released until the full principle payment is made");
					responseVO = new ResponseVO();
					responseVO.setStatus(STATUS_FAILURE);
					responseVO.setDescription(DEPOSIT_LOAN_RELEASE_FAILURE_DESCRIPTION);
				} else if(STATUS_SUCCESS.equalsIgnoreCase(responseVO.getStatus())){
					log.info("Full Deposit loan payment is made and updating the staus to release");
					dataLoader.releaseDepositLoan(RELEASE_DEPOSIT_LOAN, searchRequestVO);
					log.info("done with deposit loan release");
					responseVO.setDescription(SUCCESS_DEPOSIT_DESCRIPTION);
				}
			}
		} catch(Exception ex) {
			log.error("Error during DatabaseService.releaseLoan", ex);
		}
		return responseVO;
	}

	/**
	 * @param reportInputParamsVO
	 * @return
	 * @throws Exception
	 */
	public List generateReport(ReportInputParamsVO reportInputParamsVO) throws Exception {
		log.info("Method Entry : DatabaseService.generateReport ");
		List reportData = null; 
		try {
			if(JEWEL_LOAN.equalsIgnoreCase(reportInputParamsVO.getReportType())) {
				reportData = dataLoader.generateReport(GENERATE_JEWEL_LOAN_REPORT, reportInputParamsVO);
			} else if(DEPOSIT_LOAN.equalsIgnoreCase(reportInputParamsVO.getReportType())){
				reportData = dataLoader.generateReport(GENERATE_DEPOSIT_LOAN_REPORT, reportInputParamsVO);
			} else if(JEWEL_LOAN_PAYMENT.equalsIgnoreCase(reportInputParamsVO.getReportType())) {
				reportData = dataLoader.generateReport(GENERATE_JEWEL_LOAN_PAYMENT_REPORT, reportInputParamsVO);
			} else if(DEPOSIT_LOAN_PAYMENT.equalsIgnoreCase(reportInputParamsVO.getReportType())){
				reportData = dataLoader.generateReport(GENERATE_DEPOSIT_LOAN_PAYMENT_REPORT, reportInputParamsVO);
			}
		} catch(Exception ex) {
			log.error("Error during DatabaseService.generateReport ", ex);
		}
		return reportData;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public int addLoan(RequestVO requestVO) throws Exception {
		log.info("Method Entry : DatabaseService.addLoan ");
		int jewelLoanNo = 0;
		if(requestVO != null) {
			jewelLoanNo = dataLoader.addLoan(ADD_LOAN_STORED_PROCEDURE, ADD_LOAN, requestVO);
		}
		return jewelLoanNo;
	}

	/**
	 * @param requestVO
	 * @return
	 * @throws Exception
	 */
	public String deleteLoan(RequestVO requestVO) throws Exception {
		log.info("Method Entry : DatabaseService.deleteLoan ");
		if(requestVO != null) {
			return dataLoader.deleteLoan(DELETE_LOAN_STORED_PROCEDURE, DELETE_LOAN, requestVO);
		} else {
			return null;
		}
	}

	public String deleteEmployee(RequestVO requestVO) throws Exception {
		log.info("Method Entry : DatabaseService.deleteEmployee ");
		if(requestVO != null) {
			return dataLoader.deleteEmployee(DELETE_EMPLOYEE_STORED_PROCEDURE, DELETE_EMPLOYEE, requestVO);
		} else {
			return null;
		}
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public int addEmployee() throws Exception {
		log.info("Method Entry : DatabaseService.addEmployee ");
		int employeeId = 0;
		employeeId = dataLoader.addEmployee(ADD_EMPLOYEE_STORED_PROCEDURE, ADD_EMPLOYEE);
		return employeeId;
	}

	/**
	 * @param requestVO
	 * @return
	 * @throws Exception
	 */
	public List<CustomerVO> searchCustomer(CustomerVO customerVO) throws Exception { 
		log.info("Method Entry : DatabaseService.searchCustomer ");
		List<CustomerVO> customerList = null;

		if(customerVO != null) {

			String dateStr = customerVO.getSearchCustFromDate();
			if(dateStr!=null && !"".equalsIgnoreCase(dateStr.trim())){
				dateStr = formatDate(dateStr);
			}
			customerVO.setSearchCustFromDate(dateStr);

			dateStr = customerVO.getSearchCustToDate();
			if(dateStr!=null && !"".equalsIgnoreCase(dateStr.trim())){
				dateStr = formatDate(dateStr);
			}
			customerVO.setSearchCustToDate(dateStr);

			//Setting branch id as search condition
			if(customerVO.getAllBranchIds()==null || "".equalsIgnoreCase(customerVO.getAllBranchIds().trim())){
				customerVO.setAllBranchIds(String.valueOf(customerVO.getBranchId()));
			}

			if(customerVO.getCustomerId() != 0) {
				log.info("Search by customer id flow");
				log.info("Customer Id : " + customerVO.getCustomerId() + " Branch Ids " + customerVO.getAllBranchIds());
				/*customerList = dataLoader.searchCustomer(SEARCH_CUSTOMER_BY_ID, customerVO);
				getCustomerDocuments(customerList);*/
				List obj = (List)XMLParser.parseXML(SEARCH_CUSTOMER_BY_ID);
				if(obj != null && !obj.isEmpty()) {
					SQLObjects ref = (SQLObjects) obj.get(0);
					String sqlQuery = ref.getSqlQuery();
					String condition = customerVO.getSearchCustFromDate();
					String condition2 = customerVO.getSearchCustToDate();
					if(condition!=null && !"".equalsIgnoreCase(condition) && 
							!"From".equals(condition) && condition2!=null &&  
							condition2!=null &&	!"To".equals(condition2) &&
							!"".equalsIgnoreCase(condition2)){
						sqlQuery += " AND created_timestamp BETWEEN '"+condition+"' AND '"+condition2+"'";
					}
					ref.setSqlQuery(sqlQuery);
					customerList = dataLoader.searchCustomer(obj, customerVO);
					getCustomerDocuments(customerList);
				}

			} else if(customerVO.getCompanyName()!=null && "".equalsIgnoreCase(customerVO.getCustomerName().trim())) {
				log.info("Search by customer name flow");
				List obj2 = (List)XMLParser.parseXML(SEARCH_CUSTOMER_BY_NAME);
				if(obj2 != null && !obj2.isEmpty()) {
					SQLObjects ref = (SQLObjects) obj2.get(0);
					String sqlQuery = ref.getSqlQuery().replace(CONSTANT_REPLACE_IDENTIFIER, customerVO.getCustomerName());

					String condition = customerVO.getSearchCustFromDate();
					String condition2 = customerVO.getSearchCustToDate();
					if(condition!=null && !"".equalsIgnoreCase(condition) && 
							!"From".equals(condition) && condition2!=null &&  
							condition2!=null &&	!"To".equals(condition2) &&
							!"".equalsIgnoreCase(condition2)){
						sqlQuery += " AND created_timestamp BETWEEN '"+condition+"' AND '"+condition2+"'";
					}

					ref.setSqlQuery(sqlQuery);
					customerList = dataLoader.searchCustomer(obj2, customerVO);
					getCustomerDocuments(customerList);
				}
			}else{
				log.info("Search by customer branch flow");
				List obj = (List)XMLParser.parseXML(ApplicationConstants.SEARCH_CUSTOMER_BY_BRANCH);
				if(obj != null && !obj.isEmpty()) {
					SQLObjects ref = (SQLObjects) obj.get(0);
					String sqlQuery = ref.getSqlQuery();
					log.info("Initial Query " + sqlQuery);
					sqlQuery += " WHERE branch_id IN ("+customerVO.getAllBranchIds()+")";					
					String condition = customerVO.getSearchCustFromDate();
					String condition2 = customerVO.getSearchCustToDate();
					if(condition!=null && !"".equalsIgnoreCase(condition) && 
							!"From".equals(condition) && condition2!=null &&  
							condition2!=null &&	!"To".equals(condition2) &&
							!"".equalsIgnoreCase(condition2)){
						sqlQuery += " AND date(created_timestamp) BETWEEN '"+condition+"' AND '"+condition2+"'";
					}
					log.info("Actual Query " + sqlQuery);
					ref.setSqlQuery(sqlQuery);
					customerList = dataLoader.searchCustomer(obj, null);
					log.info("Passed Null reference ");
					getCustomerDocuments(customerList);
				}
			}
		}
		return customerList;
	}


	public void getCustomerDocuments(List<CustomerVO> customerList){
		log.info("Method Entry : DatabaseService.getCustomerDocuments "+customerList);
		if(customerList!=null && customerList.size()>0){
			log.info("customerList: "+customerList.size());
			for(CustomerVO customerVO:customerList){
				log.info("START: Loading Images for customerId: "+customerVO.getCustomerId());
				byte[] image = getRawBytesFromFile(customerVO.getCustPhotoPath());
				customerVO.setCustomerPhoto(image);
				image =	getRawBytesFromFile(customerVO.getCustIdProofPhotoPath());
				customerVO.setIdProofPhoto(image);
				image =	getRawBytesFromFile(customerVO.getCustAddrProofPhotoPath());
				customerVO.setAddressProofPhoto(image);
				image =	getRawBytesFromFile(customerVO.getCustPancardPhotoPath());
				customerVO.setPanCardPhoto(image);
				log.info("END: Loading Images for customerId: "+customerVO.getCustomerId());
			}
		}
	}

	public byte[] getRawBytesFromFile(String path) {
		byte[] image = null;
		try {
			File file = new File(path);
			image = new byte[(int)file.length()];
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(image);
		} catch (FileNotFoundException e) {
			log.error("File Not Found for :"+path+"\n",e);
		} catch (IOException e) {
			log.error("IOException for :"+path+"\n",e);
		}
		return image;
	}

	public ResponseVO searchLoans(RequestVO requestVO) throws Exception {
		log.info("Method Entry : DatabaseService.searchLoans : BranchId= "+requestVO.getBasicSearchVO().getBranchId());
		ResponseVO responseVo = new ResponseVO();
		responseVo.setStatus(STATUS_FAILURE);
		try {
			List<JewelLoanTransactionVO> retrunList = new ArrayList<JewelLoanTransactionVO>();
			String dateStr = requestVO.getBasicSearchVO().getLoanDateFrom();
			try{
				if(dateStr!=null && !"".equalsIgnoreCase(dateStr)){
					dateStr = formatDate(dateStr);
				}
				requestVO.getBasicSearchVO().setLoanDateFrom(dateStr);
	
				dateStr = requestVO.getBasicSearchVO().getLoanDateTo();
				if(dateStr!=null && !"".equalsIgnoreCase(dateStr)){
					dateStr = formatDate(dateStr);
				}
				requestVO.getBasicSearchVO().setLoanDateTo(dateStr);
			}catch(Exception ex){
				log.error("Error in formatDate: ", ex);
				log.error("\nSetting FROM and TO date value as NULL");
				requestVO.getBasicSearchVO().setLoanDateFrom("");
				requestVO.getBasicSearchVO().setLoanDateTo("");
			}

			List obj = (List)XMLParser.parseXML(ApplicationConstants.CUSTOM_LOAN_SEARCH);

			if(obj != null && !obj.isEmpty()) {
				SQLObjects ref = (SQLObjects) obj.get(0);

				String whereClause = " WHERE active_flag='Y'";
				//WHERE branch_id IN (?) AND active_flag='Y'
				//TODO: whereClause += " jewel_loan_no = ";
				whereClause += " AND branch_id IN ("+requestVO.getBasicSearchVO().getAllBranchIds()+")";

				String condition = requestVO.getBasicSearchVO().getLoanModeIds();
				if(condition!=null && !"".equalsIgnoreCase(condition)){
					whereClause += " AND jewel_loan_mode_id IN ("+condition+")";
				}

				condition = requestVO.getBasicSearchVO().getLoanTypeIds();
				if(condition!=null && !"".equalsIgnoreCase(condition)){
					whereClause += " AND jewel_loan_type_id IN ("+condition+")";
				}

				condition = requestVO.getBasicSearchVO().getRepaymentTypeIds();
				if(condition!=null && !"".equalsIgnoreCase(condition)){
					whereClause += " AND repayment_type_id IN ("+condition+")";
				}

				condition = requestVO.getBasicSearchVO().getLoanDateFrom();
				String condition2 = requestVO.getBasicSearchVO().getLoanDateTo();
				if(condition!=null && !"".equalsIgnoreCase(condition) && 
						!"From".equals(condition) && condition2!=null &&  
						condition2!=null &&	!"To".equals(condition2) &&
						!"".equalsIgnoreCase(condition2)){
					whereClause += " AND date(jewel_loan_transaction_date) BETWEEN '"+condition+"' AND '"+condition2+"'";
				}

				condition = requestVO.getBasicSearchVO().getLoanAmountFrom();
				condition2 = requestVO.getBasicSearchVO().getLoanAmountTo();
				if(condition!=null && !"".equalsIgnoreCase(condition) && condition2!=null && !"".equalsIgnoreCase(condition2)){
					whereClause += " AND loan_amount BETWEEN '"+condition+"' AND '"+condition2+"'";
				}

				condition = requestVO.getBasicSearchVO().getLoanSchemeIds();
				if(condition!=null && !"".equalsIgnoreCase(condition)){
					whereClause += " AND jewel_scheme_id IN ("+condition+")";
				}

				condition = requestVO.getBasicSearchVO().getLoanTenureMonths();
				if(condition!=null && !"".equalsIgnoreCase(condition)){
					whereClause += " AND loan_tenure IN ("+condition+")";
				}

				ref.setSqlQuery(ref.getSqlQuery() + whereClause); 
				retrunList = dataLoader.executeSelect(obj, null);
				log.error("Start fetching customer details and loan assest breakup details");
				for(JewelLoanTransactionVO jewelVO : retrunList){
					//Fetching Customer Detail 
					try {
						CustomerVO custVO = new CustomerVO();
						custVO.setCustomerId(jewelVO.getCustomerId());
						custVO.setAllBranchIds(requestVO.getBasicSearchVO().getAllBranchIds());
						List<CustomerVO> custList = searchCustomer(custVO);

						if(custList!=null && custList.size()>0){
							jewelVO.setCustomerDetails(custList.get(0));
						}

						byte[] image = getRawBytesFromFile(jewelVO.getJewelPhotoPath());
						jewelVO.setJewelPhoto(image);

					} catch (Exception ex) {
						log.error("Error During Customer Fetch for Loan#: "
								+jewelVO.getJewelLoanNo()
								+" LoanType#: "+jewelVO.getTransactionTypeId());
						log.error("Error During Customer Fetch Exception: ", ex);
					}
					//Fetching Loan Splitup Details Detail 
					try {
						LoanAssestSplitUpVO loanAssestVO = new LoanAssestSplitUpVO();
						loanAssestVO.setLoan_no(jewelVO.getJewelLoanNo());
						loanAssestVO.setJewelLoanType(jewelVO.getJewelLoanType());
						List<LoanAssestSplitUpVO> splitUpList = dataLoader.getLoanAssetBreakUp(GET_JEWEL_LOAN_ASSET_BREAKUP, loanAssestVO);
						jewelVO.setLoanAssetSplitUp(splitUpList);
					} catch (Exception ex) {
						log.error("Error During Loan Splitup Details Fetch for Loan#: "
								+jewelVO.getJewelLoanNo()
								+" LoanType#: "+jewelVO.getTransactionTypeId());
						log.error("Error During Loan Splitup Details Fetch Exception: ", ex);
					}

				}

				responseVo.setResponseData(retrunList);
				responseVo.setStatus(ApplicationConstants.STATUS_OK); 
			}

		} catch(Exception ex) {
			log.error("Error during DatabaseService.searchLoans ", ex);
		}
		return responseVo;
	}

	@SuppressWarnings("deprecation")
	private String formatDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formatedDate = sdf.format(new Date(date));
		return formatedDate;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public List<EducationVO> getEducationList() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		List<EducationVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_EDUCATION_LIST);
		return retrunList;
	}
	/**
	 * @return
	 * @throws Exception
	 */
	public List<NationalityVO> getNationalityList() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		List<NationalityVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_NATIONALITY_LIST);
		return retrunList;
	}
	/**
	 * @return
	 * @throws Exception
	 */
	public List<OccupationVO> getOccupationList() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		List<OccupationVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_OCCUPATION_LIST);
		return retrunList;
	}
	/**
	 * @return
	 * @throws Exception
	 */
	public List<BankAccountTypeVO> getBankAcctTypeList() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		List<BankAccountTypeVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_BANK_ACCT_TYPE_LIST);
		return retrunList;
	}
	/**
	 * @return
	 * @throws Exception
	 */
	public List<IdNAddressProofVO> getIdNAddrProofList() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		List<IdNAddressProofVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_ID_ADDR_PROOF_LIST);
		return retrunList;
	}
	/**
	 * @return
	 * @throws Exception
	 */
	public List<GenderVO> getGenderList() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		List<GenderVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_GENDER_LIST);
		return retrunList;
	}
	/**
	 * @return
	 * @throws Exception
	 */
	public List<MaritalStatusVO> getMaritalStatusList() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		List<MaritalStatusVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_MARITAL_STATUS_LIST);
		return retrunList;
	}

	public int getNextAvailableCustId() throws Exception {
		log.info("Method Entry : DatabaseService.getJewelTakeOverFrom ");
		int nextAvailCustId = 0;
		List<ResponseVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_NEXT_AVAILABLE_CUST_ID);
		if(retrunList!=null && retrunList.size()>0){
			ResponseVO resVO = retrunList.get(0);
			if(resVO!=null && resVO.getStatus()!=null){
				nextAvailCustId = Integer.parseInt(resVO.getStatus());
			}
			nextAvailCustId = nextAvailCustId + 1;
		}
		return nextAvailCustId;
	}

	public List<TempVO> testTemp(TempVO tempVO) throws Exception {
		log.info("Method Entry : testTemp ");
		//dataLoader.insertTemp(ApplicationConstants.TEST_TEMP,tempVO);
		return null;
	}

	public boolean saveBranchEntitlements(AppConfigurationVO appConfigVO) throws Exception {
		log.info("Method entry : DatabaseService.saveBranchEntitlments");
		try{
			log.info("Branch Ids: "+appConfigVO.getSelectedBranchIds());

			String[] branchIdArr = appConfigVO.getSelectedBranchIds().split(",");
			for(String branchId : branchIdArr){
				for(AppComponentVO appCompVO : appConfigVO.getComponentList()){
					appCompVO.setBranchId(branchId);
					dataLoader.executeInsert(ApplicationConstants.INSERT_BRANCH_ENTITLES,appCompVO);
				}

			}
			return true;
		}catch (Exception e) {
			log.error("Exception in DatabaseService.saveBranchEntitlments\n",e);
			return false;
		}

	}

	public AppConfigurationVO getBranchConfigData(BranchDetailsVO branchDetailVO){
		log.info("Method entry : DatabaseService.getBranchConfigData");
		try {
			AppConfigurationVO appConfigData = new AppConfigurationVO();
			appConfigData.setBranchId(branchDetailVO.getBranchId());
			List<AppComponentVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_BRANCH_CONFIG_DETAILS,branchDetailVO);
			appConfigData.setComponentList(retrunList);
			return appConfigData; 
		} catch (Exception e) {
			log.error("Exception in DatabaseService.getBranchConfigData\n",e);
			return null;
		}
	}

	public List<BranchDetailsVO> getAllBranchDetails(){
		log.info("Method entry : DatabaseService.getAllBranchDetails");
		try {
			List<BranchDetailsVO> retrunList = dataLoader.executeSelect(ApplicationConstants.GET_ALL_BRANCH_DETAILS);
			return retrunList; 
		} catch (Exception e) {
			log.error("Exception in DatabaseService.getAllBranchDetails\n",e);
			return null;
		}
	}
	
	@SuppressWarnings("deprecation")
	public String getHTMLFromExcel(byte[] excelFile){
		log.info("Method entry : DatabaseService.getHTMLFromExcel");
		try {
			long elapsedTime = System.currentTimeMillis();
			log.info("Writing into file==>> START");
			InputStream inputXLS = new ByteArrayInputStream(excelFile);
			String[] sheetsNames = fileRepositoryLocationMap.get(ApplicationConstants.DAY_BOOK_SHEET_NAMES).split(",");
			String htmlFile = fileRepositoryLocationMap.get(ApplicationConstants.DAY_BOOK_SHEET_HTML_FILE);
			String content = new ExcelToHtml(inputXLS,sheetsNames).getHTML();
			HttpServletRequest hhtpReq = FlexContext.getHttpRequest();
			String htmlFilePath = hhtpReq.getRealPath(htmlFile);
			
			log.info("File location==> "+htmlFilePath);
			File fileOrdir = new File(htmlFilePath);
			FileWriter tempFileWriter = new FileWriter(fileOrdir);
			tempFileWriter.write("");
			tempFileWriter.write(content);
			tempFileWriter.close();
			log.info("Writing into file==>> COMPLETED");
			
			elapsedTime = (System.currentTimeMillis() - elapsedTime);
			log.info("Elapsed time to convert excel into html is: "+elapsedTime+" Milli Sec");
			log.info("Method Exit : DatabaseService.getHTMLFromExcel");	
			
			return htmlFile;
		
		} catch (Exception e) {
			log.error("Exception in DatabaseService.getHTMLFromExcel");
			log.error("Exception Message",e);
		}
		log.info("Method Exit : DatabaseService.getHTMLFromExcel");
		return null;
		 
	}
	
	@SuppressWarnings("unchecked")
	public boolean updateDayBook(DayBookVO dayBook) throws Exception {
		log.info("Method entry : DatabaseService.updateDayBook");
		
		try {
			
			InputStream inputXML = Thread.currentThread().getContextClassLoader().getResourceAsStream(ApplicationConstants.DAY_BOOK_MAPPING_XML);
	        XLSReader mainReader = ReaderBuilder.buildFromXML( inputXML );
	        InputStream inputXLS = new ByteArrayInputStream(dayBook.getDayBookWorkSheet());
	       
			@SuppressWarnings("rawtypes")
			Map beans = new HashMap();
	        beans.put("dayBook", dayBook);        
	        log.info("Reading xls ==> Start");
	        mainReader.read(inputXLS, beans);
	        log.info("Reading xls ==> End");

	        log.info("insert day book and denominations");
	        dataLoader.executeInsert(ApplicationConstants.ADD_DAY_BOOK, dayBook);
	        
	        log.info("insert payments");
	        for(PaymentsNReceivedVO payments : dayBook.getPaymentsList()){
	        	try{
	        		Integer.parseInt(payments.getSerialNum());
		        	payments.setDayBookType(ApplicationConstants.DAY_BOOK_TYPE_PAYMENTS);
		        	payments.setBranchId(dayBook.getBranchId());
		        	payments.setCreatedBy(dayBook.getCreatedBy());
		        	dataLoader.executeInsert(ApplicationConstants.ADD_DAY_BOOK_PAY_N_RCD, payments);
	        	}catch(Exception e){
	        		log.error("Not able to process this record"+payments.getSerialNum());
	        	}
	        }
	        
	        log.info("insert received");
	        for(PaymentsNReceivedVO received : dayBook.getReceivedList()){
	        	try{
	        		Integer.parseInt(received.getSerialNum());
		        	received.setBranchId(dayBook.getBranchId());
		        	received.setCreatedBy(dayBook.getCreatedBy());
		        	received.setDayBookType(ApplicationConstants.DAY_BOOK_TYPE_RECEIVED);
		        	dataLoader.executeInsert(ApplicationConstants.ADD_DAY_BOOK_PAY_N_RCD, received);
	        	}catch(Exception e){
	        		log.error("Not able to process this record"+received.getSerialNum());
	        	}
	        }
	        
	        return true;
		} catch (Exception e) {
			log.error("Exception in DatabaseService.updateDayBook");
			log.error("Exception Message: ",e);
		}
		
		return false;
	}

}