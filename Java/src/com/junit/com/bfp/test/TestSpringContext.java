package com.junit.com.bfp.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bfp.controller.BusinessController;
import com.bfp.valueobjects.ApplicationComponentsDataVO;
import com.bfp.valueobjects.CustomerVO;
import com.bfp.valueobjects.JewelLoanTransactionVO;
import com.bfp.valueobjects.LoanAssestSplitUpVO;
import com.bfp.valueobjects.RequestVO;

/**
 * @author tiruppathir
 *
 */
public class TestSpringContext {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");			
			System.out.println(context.getBean("oracleDataSource"));
			BasicDataSource dataSource = (BasicDataSource) context.getBean("oracleDataSource");
			Connection con = dataSource.getConnection();
			Statement s = con.createStatement(); // Create Statement
			String query = "select * from Employee"; // Create Query
			s.execute(query); // Execute Query
			ResultSet rs = s.getResultSet(); //return the data from Statement into ResultSet
			while(rs.next()) // Retrieve data from ResultSet
			{
				System.out.print("Employee Id : "+rs.getString(1)); //1st column of Table from database
				System.out.print(" Employee Name : "+rs.getString(2)); //2nd column of Table
				System.out.println(" , Age : "+rs.getString(3)); //3rd column of Table
			}
			s.close();
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}*/
	
	
	/*public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");			
			System.out.println(context.getBean("oracleDataSource"));
			BasicDataSource dataSource = (BasicDataSource) context.getBean("oracleDataSource");
			Connection con = dataSource.getConnection();
			Statement s = con.createStatement(); // Create Statement
			String query = "select interest_period_id, interest_period, created_by from deposit_loan_interest_period"; // Create Query
			s.execute(query); // Execute Query
			ResultSet rs = s.getResultSet(); //return the data from Statement into ResultSet
			while(rs.next()) // Retrieve data from ResultSet
			{
				System.out.print("Employee Id : "+rs.getString(1)); //1st column of Table from database
				System.out.print(" Employee Name : "+rs.getString(2)); //2nd column of Table
				System.out.println(" , Age : "+rs.getString(3)); //3rd column of Table
			}
			s.close();
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}*/
	
	
	/*public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			BusinessController businessController = (BusinessController)context.getBean("businessController");
			ApplicationComponentsDataVO component = businessController.retrieveApplicationComponentsData(); 
			System.out.println(component);			
			
			JewelSchemeVO scheme = new JewelSchemeVO();
			scheme.setJewel_scheme_name("TG4");
			scheme.setCreated_by("Tiru");
			businessController.addJewelScheme(scheme);
			
			JewelTakeOverFromVO takeOverFrom = new JewelTakeOverFromVO();
			takeOverFrom.setJewel_take_over_from("Take Over Name");
			takeOverFrom.setCreated_by("Tiru");
			businessController.addTakeOverFrom(takeOverFrom);
			
			DepositPlaceVO depositPlaceVO = new DepositPlaceVO();
			depositPlaceVO.setDeposit_place("SIB-CMBT");
			depositPlaceVO.setCreated_by("Tiru");
			businessController.addDepositPlace(depositPlaceVO);
			
			DepositLoanAccountHoldersVO depositLoanAccountHoldersVO = new DepositLoanAccountHoldersVO();
			depositLoanAccountHoldersVO.setAcct_holder_name("Tiruppathi Rajan Gunaseelan");
			depositLoanAccountHoldersVO.setIs_authorised("Y");
			depositLoanAccountHoldersVO.setCreated_by("Admin");
			businessController.addDepositAccountHolderName(depositLoanAccountHoldersVO);
			
			DepositLoanInterestPeriodVO depositLoanInterestPeriodVO = new DepositLoanInterestPeriodVO();
			depositLoanInterestPeriodVO.setInterestPeriod("2 Years");
			depositLoanInterestPeriodVO.setCreatedBy("Tiru");
			businessController.addDepositLoanInterestPeriod(depositLoanInterestPeriodVO);
			
			
			int jewelLoanNo = businessController.addNewJewelLoan();
			System.out.println("jewelLoanNo " + jewelLoanNo);
			
			JewelLoanTransactionVO jewelLoanTransactionVO = new JewelLoanTransactionVO();
			jewelLoanTransactionVO.setJewelLoanNo(jewelLoanNo);
			CustomerVO customer = new CustomerVO();
			customer.setCustomerName("Aarthi");
			customer.setCustomerAddress("Chennai");
			customer.setCustomerContactNo("9940246408");
			jewelLoanTransactionVO.setCustomerDetails(customer);
			jewelLoanTransactionVO.setTransactionTypeId(1);
			jewelLoanTransactionVO.setJewel_loan_type_id(1);
			jewelLoanTransactionVO.setJewel_take_over_from_id(1);
			jewelLoanTransactionVO.setJewel_scheme_id(1);
			jewelLoanTransactionVO.setRate_per_gram("2100");
			jewelLoanTransactionVO.setInterest_rate("1.8");
			jewelLoanTransactionVO.setLoan_amount("10000");
			jewelLoanTransactionVO.setDocument_charges("100");
			jewelLoanTransactionVO.setService_charges("300");
			jewelLoanTransactionVO.setTotal_gross_weight("25");
			jewelLoanTransactionVO.setTotal_net_weight("18");
			jewelLoanTransactionVO.setTotal_reduced_weight("7");
			jewelLoanTransactionVO.setTotal_count(5);
			jewelLoanTransactionVO.setCreated_by("Admin");
			
			List<LoanAssestSplitUpVO> loanAssetSplitUp = new ArrayList<LoanAssestSplitUpVO>();
			LoanAssestSplitUpVO loanAssetSplit = new LoanAssestSplitUpVO();			
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(1);
			loanAssetSplit.setJewel_type_id(1);
			loanAssetSplit.setGross_weight("10");
			loanAssetSplit.setReduced_weight("2");
			loanAssetSplit.setNet_weight("8");
			loanAssetSplit.setQuality_id(1);
			loanAssetSplit.setTotal_quantity(1);
			loanAssetSplitUp.add(loanAssetSplit);
			
			loanAssetSplit = new LoanAssestSplitUpVO();
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(1);
			loanAssetSplit.setJewel_type_id(2);
			loanAssetSplit.setGross_weight("15");
			loanAssetSplit.setReduced_weight("3");
			loanAssetSplit.setNet_weight("12");
			loanAssetSplit.setQuality_id(2);
			loanAssetSplit.setTotal_quantity(2);
			loanAssetSplitUp.add(loanAssetSplit);
			
			loanAssetSplit = new LoanAssestSplitUpVO();
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(2);
			loanAssetSplit.setJewel_type_id(1);
			loanAssetSplit.setGross_weight("7");
			loanAssetSplit.setReduced_weight("4");
			loanAssetSplit.setNet_weight("3");
			loanAssetSplit.setQuality_id(3);
			loanAssetSplit.setTotal_quantity(5);
			loanAssetSplitUp.add(loanAssetSplit);
			jewelLoanTransactionVO.setLoanAssetSplitUp(loanAssetSplitUp);
			businessController.addNewJewelLoanDetails(jewelLoanTransactionVO);
			
			PaymentTransactionVO paymentTransactionVO = new PaymentTransactionVO();
			paymentTransactionVO.setLoanNo(jewelLoanNo);
			paymentTransactionVO.setTransactionTypeId(1);
			paymentTransactionVO.setPaymentTypeId(1);
			paymentTransactionVO.setInterest_amount("1000");
			paymentTransactionVO.setActualInterestRate("2.1");
			paymentTransactionVO.setCustomerInterestRate("1.8");
			paymentTransactionVO.setNoOfDays(40);
			paymentTransactionVO.setReleaseTypeId(1);
			businessController.addNewLoanInterestPayment(paymentTransactionVO);
			
			
			int depositLoanNo = businessController.addNewDepositLoan();
			System.out.println("depositLoanNo " + depositLoanNo);
			DepositLoanTransactionVO depositLoanTransactionVO = new DepositLoanTransactionVO();
			depositLoanTransactionVO.setTransactionTypeId(2);
			depositLoanTransactionVO.isThisLedgerLoan(false);
			depositLoanTransactionVO.isThisNewLoan(false);
			depositLoanTransactionVO.setDeposit_loan_no(depositLoanNo);			
			depositLoanTransactionVO.setJewelLoanNo(jewelLoanNo);
			depositLoanTransactionVO.setLoanTenure("3 Years");
			depositLoanTransactionVO.setDeposit_place_id(1);
			depositLoanTransactionVO.setAcct_holder_name_id(1);
			depositLoanTransactionVO.setInterest_rate("1.8");
			depositLoanTransactionVO.setLoan_amount("30000");
			depositLoanTransactionVO.isThisJointLoan(false);
			depositLoanTransactionVO.setRate_per_gram("1500");
			depositLoanTransactionVO.setOther_fee("100");
			depositLoanTransactionVO.setPenaltyInterest("1000");
			depositLoanTransactionVO.setInterestPeriodId(1);
			
			loanAssetSplitUp = new ArrayList<LoanAssestSplitUpVO>();
			loanAssetSplit = new LoanAssestSplitUpVO();
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(1);
			loanAssetSplit.setJewel_type_id(1);
			loanAssetSplit.setGross_weight("10");
			loanAssetSplit.setReduced_weight("2");
			loanAssetSplit.setNet_weight("8");
			loanAssetSplit.setQuality_id(1);
			loanAssetSplit.setTotal_quantity(1);
			loanAssetSplitUp.add(loanAssetSplit);
			
			loanAssetSplit = new LoanAssestSplitUpVO();
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(1);
			loanAssetSplit.setJewel_type_id(2);
			loanAssetSplit.setGross_weight("15");
			loanAssetSplit.setReduced_weight("3");
			loanAssetSplit.setNet_weight("12");
			loanAssetSplit.setQuality_id(2);
			loanAssetSplit.setTotal_quantity(2);
			loanAssetSplitUp.add(loanAssetSplit);
			
			loanAssetSplit = new LoanAssestSplitUpVO();
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(2);
			loanAssetSplit.setJewel_type_id(1);
			loanAssetSplit.setGross_weight("7");
			loanAssetSplit.setReduced_weight("4");
			loanAssetSplit.setNet_weight("3");
			loanAssetSplit.setQuality_id(3);
			loanAssetSplit.setTotal_quantity(5);
			loanAssetSplitUp.add(loanAssetSplit);
			depositLoanTransactionVO.setLoanAssetSplitUp(loanAssetSplitUp);
			businessController.addNewDepositLoanDetails(depositLoanTransactionVO);
			
			SearchRequestVO searchRequestVO = new SearchRequestVO();
			searchRequestVO.setLoanNo(15);
			searchRequestVO.setTransactionTypeId(1);
			searchRequestVO.setLoanNo(21);
			searchRequestVO.setTransactionTypeId(2);
			SearchResponseVO response = businessController.performLoanNoSearch(searchRequestVO);
			
			int employeeId = businessController.addNewEmployee();
			System.out.println("employeeId " + employeeId) ;
			EmployeeVO employee = new EmployeeVO();
			employee.setEmployeeId(employeeId);
			employee.setEmployeeName("IT System Admin");
			employee.setGender("Male");
			employee.setEmployeeAddress("Madurai");
			employee.setQualification("B.C.A");
			employee.setBranchId("1");
			employee.setRoleId(3);
			employee.setContactNo("123");
			employee.setAlternateContactNo("456");
			employee.setLoginId("B1-002");
			employee.setPassword("password");
			employee.setCreatedBy("Admin");
			boolean status = businessController.updateEmployeeDetails(employee);
			System.out.println("status " + status);
			System.out.println("Done");
			
			BranchDetailsVO branchDetailsVO = new BranchDetailsVO(); 
			branchDetailsVO.setBranchId("B1");
			branchDetailsVO.setBranchName("MFPL-Royapetta");
			branchDetailsVO.setBranchAddress("Chennai");
			branchDetailsVO.setBranchContactNo("147852963");
			branchDetailsVO.setTotalNoOfEmployees(15);
			branchDetailsVO.setBranchManagerId(1);
			branchDetailsVO.setBranchAdminId(2);
			branchDetailsVO.setCreatedBy("Admin");
			businessController.configureBranch(branchDetailsVO);
			System.out.println("Done");
			//businessController.fetchEmployees();
			
			UserProfileVO userProfileVO = new UserProfileVO(); 
			userProfileVO.setUserId("B1-001");
			userProfileVO.setPassword("password");
			System.out.println(businessController.validateUser(userProfileVO));

			ReportInputParamsVO reportInputParamsVO = new ReportInputParamsVO();
			reportInputParamsVO.setLoanIndicator("Y");
			reportInputParamsVO.setFromDate("2013-11-01");
			reportInputParamsVO.setToDate("2013-11-23");
			reportInputParamsVO.setReportType("DEPOSIT_LOAN_PAYMENT");
			System.out.println(businessController.generateReport(reportInputParamsVO));
			
			CustomerVO customerVO = new CustomerVO();
			customerVO.setCustomerId(1);
			customerVO.setCustomerName("Tiru");
			
			System.out.println(businessController.searchCustomer(customerVO).size());
			
			RequestVO requestVO = new RequestVO();
			requestVO.setJewelLoanTypeId(1);
			int jewelLoanNo = businessController.addLoan(requestVO);
			
			JewelLoanTransactionVO jewelLoanTransactionVO = new JewelLoanTransactionVO();
			jewelLoanTransactionVO.setJewelLoanModeId(2);
			jewelLoanTransactionVO.setBranchId(1);
			jewelLoanTransactionVO.setJewel_take_over_from_id(1);
			jewelLoanTransactionVO.setJewelTakeOverFromPlace("Chennai");
			jewelLoanTransactionVO.setJewel_scheme_id(1);
			jewelLoanTransactionVO.setLoanTenure(12);
			jewelLoanTransactionVO.setRateOfInterestId(1);
			jewelLoanTransactionVO.setJewelLoanType(1);
			jewelLoanTransactionVO.setRepaymentTypeId(1);
			jewelLoanTransactionVO.setHighLimitKey(1);
			
			File file = new File("C:\\Users\\tiruppathir\\Desktop\\IMG_2523.jpg");
			InputStream in = new FileInputStream(file);
			//byte[] chunk = new byte[4096];
			byte[] chunk = new byte[335872];
			int i = in.read(chunk);
			jewelLoanTransactionVO.setCustomerPhoto(chunk);
			jewelLoanTransactionVO.setJewelPhoto(chunk);
			in.close();
			file = null;
			
			jewelLoanTransactionVO.setJewelLoanNo(jewelLoanNo);
			CustomerVO customer = new CustomerVO();
			customer.setCustomerId(1);
			jewelLoanTransactionVO.setCustomerDetails(customer);
			jewelLoanTransactionVO.setTransactionTypeId(1);			
			jewelLoanTransactionVO.setAverageRatePerGram(2100);
			jewelLoanTransactionVO.setLoan_amount("229950");
			jewelLoanTransactionVO.setDocument_charges("10");
			jewelLoanTransactionVO.setService_charges("745");			
			jewelLoanTransactionVO.setServiceTax("95");
			jewelLoanTransactionVO.setInstaLoanNo(1);
			jewelLoanTransactionVO.setInstaLoanAmount(32850);
			jewelLoanTransactionVO.setRemarks("Unit Testing");
			jewelLoanTransactionVO.setCreated_by("Admin");
			
			List<LoanAssestSplitUpVO> loanAssetSplitUp = new ArrayList<LoanAssestSplitUpVO>();
			LoanAssestSplitUpVO loanAssetSplit = new LoanAssestSplitUpVO();			
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(1);
			loanAssetSplit.setJewel_type_id(1);
			loanAssetSplit.setQuality_id(4);
			loanAssetSplit.setGross_weight("10");
			loanAssetSplit.setReduced_weight("2");
			loanAssetSplit.setNet_weight("8");			
			loanAssetSplit.setTotal_quantity(1);
			loanAssetSplit.setRatePerGram(1620);
			loanAssetSplitUp.add(loanAssetSplit);
			
			loanAssetSplit = new LoanAssestSplitUpVO();
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(1);
			loanAssetSplit.setJewel_type_id(2);
			loanAssetSplit.setGross_weight("15");
			loanAssetSplit.setReduced_weight("3");
			loanAssetSplit.setNet_weight("12");
			loanAssetSplit.setQuality_id(7);
			loanAssetSplit.setRatePerGram(1820);
			loanAssetSplit.setTotal_quantity(2);
			loanAssetSplitUp.add(loanAssetSplit);
			
			loanAssetSplit = new LoanAssestSplitUpVO();
			loanAssetSplit.setLoan_no(jewelLoanNo);
			loanAssetSplit.setJewel_category_id(2);
			loanAssetSplit.setJewel_type_id(1);
			loanAssetSplit.setGross_weight("7");
			loanAssetSplit.setReduced_weight("4");
			loanAssetSplit.setNet_weight("3");
			loanAssetSplit.setQuality_id(15);
			loanAssetSplit.setRatePerGram(2020);
			loanAssetSplit.setTotal_quantity(5);
			loanAssetSplitUp.add(loanAssetSplit);
			jewelLoanTransactionVO.setLoanAssetSplitUp(loanAssetSplitUp);
			businessController.addNewJewelLoanDetails(jewelLoanTransactionVO);
			
			CustomerVO customerVO = new CustomerVO();
			customerVO.setCustomerName("Tiru");
			customerVO.setCustomerAddress("Virudhunagar");
			customerVO.setCustomerContactNo("9940246408");
			customerVO.setBranchId(1);
			customerVO.setGenderId(1);
			customerVO.setDateOfBirth("07-July-1985");
			customerVO.setMaritalStatusId(1);
			customerVO.setEmailAddress("trajang@gmail.com");
			customerVO.setReferenceContactNo("963");
			customerVO.setCustomerBankAcctNo("012369857400");
			customerVO.setCustomerBankAcctName("State Bank of India");
			customerVO.setCustomerBankAcctBranchName("Madurai Road Branch");
			customerVO.setCustomerPhoto("N/A");
			customerVO.setCustomerIdProof("N/A");
			customerVO.setCustomerAddressProof("N/A");
			customerVO.setCreatedBy("Admin");
			businessController.addNewCustomer(customerVO);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}*/
	
}