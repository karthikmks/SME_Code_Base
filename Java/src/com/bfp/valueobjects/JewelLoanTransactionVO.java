package com.bfp.valueobjects;

import java.util.List;

/**
 * @author vasana
 *
 */
public class JewelLoanTransactionVO {
	
	private int jewelLoanNo;
	private String jewel_loan_transaction_date;
	private int jewel_take_over_from_id;
	private int jewel_scheme_id;
	private int jewelLoanType;
	private String jewelTakeOverFromPlace;
	private String jewelScheme;
	private int averageRatePerGram;
	private float loan_amount;
	private String interest_rate;  
	
	private float document_charges;
	private float service_charges;
	private float serviceTax;
	
	private String total_gross_weight;
	private String total_reduced_weight;
	private String total_net_weight;
	private int total_count;
	private String remarks;
	private String created_by;
	private String created_timestamp;
	private String modified_by;
	private String modified_timestamp;
	private String active_flag;
	private CustomerVO customerDetails;
	private int customerId;
	private List<LoanAssestSplitUpVO> loanAssetSplitUp;
	private String ledgerLoan;
	private boolean isThisNewLoan;
	private int transactionTypeId;
	private List<PaymentTransactionVO> paymentTransactions;
	private byte[] customerPhoto;
	private byte[] jewelPhoto;
	private int rateOfInterestId;
	private int jewelLoanModeId;
	private int repaymentTypeId;
	private String branchId;
	private int jewelTakeOverFromPlaceId;
	private int loanTenure;
	
	private int instaLoanNo;
	private int instaLoanAmount;
	private int highLimitKey;
	private String customerPhotoPath;
	private String jewelPhotoPath;
	private int releaseTypeId;
	
	/**
	 * @return the jewelLoanNo
	 */
	public int getJewelLoanNo() {
		return jewelLoanNo;
	}
	/**
	 * @param jewelLoanNo the jewelLoanNo to set
	 */
	public void setJewelLoanNo(int jewelLoanNo) {
		this.jewelLoanNo = jewelLoanNo;
	}


	
	/**
	 * @return the jewelLoanType
	 */
	public int getJewelLoanType() {
		return jewelLoanType;
	}
	/**
	 * @param jewelLoanType the jewelLoanType to set
	 */
	public void setJewelLoanType(int jewelLoanType) {
		this.jewelLoanType = jewelLoanType;
	}
	/**
	 * @return the jewelTakeOverFrom
	 */
	public String getJewelTakeOverFromPlace() {
		return jewelTakeOverFromPlace;
	}
	/**
	 * @param jewelTakeOverFrom the jewelTakeOverFrom to set
	 */
	public void setJewelTakeOverFromPlace(String jewelTakeOverFrom) {
		this.jewelTakeOverFromPlace = jewelTakeOverFrom;
	}
	/**
	 * @return the jewelScheme
	 */
	public String getJewelScheme() {
		return jewelScheme;
	}
	/**
	 * @param jewelScheme the jewelScheme to set
	 */
	public void setJewelScheme(String jewelScheme) {
		this.jewelScheme = jewelScheme;
	}



	/**
	 * @return the averageRatePerGram
	 */
	public int getAverageRatePerGram() {
		return averageRatePerGram;
	}
	/**
	 * @param averageRatePerGram the averageRatePerGram to set
	 */
	public void setAverageRatePerGram(int averageRatePerGram) {
		this.averageRatePerGram = averageRatePerGram;
	}

	/**
	 * @return the ledgerLoan
	 */
	public String getLedgerLoan() {
		return ledgerLoan;
	}
	/**
	 * @param ledgerLoan the ledgerLoan to set
	 */
	public void setLedgerLoan(String ledgerLoan) {
		this.ledgerLoan = ledgerLoan;
	}


	public void setCustomerName(String name) {
		if(this.customerDetails == null) {
			this.customerDetails = new CustomerVO();
			this.customerDetails.setCustomerName(name);
		} else {
			this.customerDetails.setCustomerName(name);
		}
	}
	public void setCustomerAddress(String address) {
		if(this.customerDetails == null) {
			this.customerDetails = new CustomerVO();
			this.customerDetails.setAddress(address);
		} else {
			this.customerDetails.setAddress(address);
		}
	}
	public void setCustomerContactNo(String contactNo) {
		if(this.customerDetails == null) {
			this.customerDetails = new CustomerVO();
			this.customerDetails.setMobileNo(contactNo);
		} else {
			this.customerDetails.setMobileNo(contactNo);
		}
	}
	
	/**
	 * @return the paymentTransactions
	 */
	public List<PaymentTransactionVO> getPaymentTransactions() {
		return paymentTransactions;
	}
	/**
	 * @param paymentTransactions the paymentTransactions to set
	 */
	public void setPaymentTransactions(
			List<PaymentTransactionVO> paymentTransactions) {
		this.paymentTransactions = paymentTransactions;
	}
	/**
	 * @return the transactionTypeId
	 */
	public int getTransactionTypeId() {
		return transactionTypeId;
	}
	/**
	 * @param transactionTypeId the transactionTypeId to set
	 */
	public void setTransactionTypeId(int transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}
	/**
	 * @return the isThisNewLoan
	 */
	public boolean isThisNewLoan() {
		return isThisNewLoan;
	}
	/**
	 * @param isThisNewLoan the isThisNewLoan to set
	 */
	public void isThisNewLoan(boolean isThisNewLoan) {
		this.isThisNewLoan = isThisNewLoan;
	}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		if(customerId == 0 && customerDetails != null) {
			return customerDetails.getCustomerId();
		}
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the loanAssetSplitUp
	 */
	public List<LoanAssestSplitUpVO> getLoanAssetSplitUp() {
		return loanAssetSplitUp;
	}
	/**
	 * @param loanAssetSplitUp the loanAssetSplitUp to set
	 */
	public void setLoanAssetSplitUp(List<LoanAssestSplitUpVO> loanAssetSplitUp) {
		this.loanAssetSplitUp = loanAssetSplitUp;
	}
	/**
	 * @return the customerDetails
	 */
	public CustomerVO getCustomerDetails() {
		return customerDetails;
	}
	/**
	 * @param customerDetails the customerDetails to set
	 */
	public void setCustomerDetails(CustomerVO customerDetails) {
		this.customerDetails = customerDetails;
	}
	public String getJewel_loan_transaction_date() {
		return jewel_loan_transaction_date;
	}
	public void setJewel_loan_transaction_date(String jewel_loan_transaction_date) {
		this.jewel_loan_transaction_date = jewel_loan_transaction_date;
	}
	public int getJewel_take_over_from_id() {
		return jewel_take_over_from_id;
	}
	public void setJewel_take_over_from_id(int jewel_take_over_from_id) {
		this.jewel_take_over_from_id = jewel_take_over_from_id;
	}
	public int getJewel_scheme_id() {
		return jewel_scheme_id;
	}
	public void setJewel_scheme_id(int jewel_scheme_id) {
		this.jewel_scheme_id = jewel_scheme_id;
	}
	public String getLoan_amount() {
		return String.valueOf(loan_amount);
	}
	public void setLoan_amount(String loan_amount) {
		this.loan_amount = Float.parseFloat(loan_amount);
	}
	public String getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(String interest_rate) {
		this.interest_rate = interest_rate;
	}
	public String getDocument_charges() {
		return String.valueOf(document_charges);
	}
	public void setDocument_charges(String document_charges) {
		this.document_charges = Float.parseFloat(document_charges);
	}
	public String getService_charges() {
		return String.valueOf(service_charges);
	}
	public void setService_charges(String service_charges) {
		this.service_charges = Float.parseFloat(service_charges);
	}
	public String getTotal_gross_weight() {
		return total_gross_weight;
	}
	public void setTotal_gross_weight(String total_gross_weight) {
		this.total_gross_weight = total_gross_weight;
	}
	public String getTotal_reduced_weight() {
		return total_reduced_weight;
	}
	public void setTotal_reduced_weight(String total_reduced_weight) {
		this.total_reduced_weight = total_reduced_weight;
	}
	public String getTotal_net_weight() {
		return total_net_weight;
	}
	public void setTotal_net_weight(String total_net_weight) {
		this.total_net_weight = total_net_weight;
	}
	public int getTotal_count() {
		return total_count;
	}
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(String created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getModified_timestamp() {
		return modified_timestamp;
	}
	public void setModified_timestamp(String modified_timestamp) {
		this.modified_timestamp = modified_timestamp;
	}
	public String getActive_flag() {
		return active_flag;
	}
	public void setActive_flag(String active_flag) {
		this.active_flag = active_flag;
	}

	 /**
	 * @return the customerPhoto
	 */
	public byte[] getCustomerPhoto() {
		return customerPhoto;
	}
	/**
	 * @param customerPhoto the customerPhoto to set
	 */
	public void setCustomerPhoto(byte[] customerPhoto) {
		this.customerPhoto = customerPhoto;
	}
	/**
	 * @return the jewelPhoto
	 */
	public byte[] getJewelPhoto() {
		return jewelPhoto;
	}
	/**
	 * @param jewelPhoto the jewelPhoto to set
	 */
	public void setJewelPhoto(byte[] jewelPhoto) {
		this.jewelPhoto = jewelPhoto;
	}

	

	
	/**
	 * @return the rateOfInterestId
	 */
	public int getRateOfInterestId() {
		return rateOfInterestId;
	}
	/**
	 * @param rateOfInterestId the rateOfInterestId to set
	 */
	public void setRateOfInterestId(int rateOfInterestId) {
		this.rateOfInterestId = rateOfInterestId;
	}
	

	/**
	 * @return the branchId
	 */
	public String getBranchId() {
		return branchId;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	/**
	 * @return the jewelLoanModeId
	 */
	public int getJewelLoanModeId() {
		return jewelLoanModeId;
	}
	/**
	 * @param jewelLoanModeId the jewelLoanModeId to set
	 */
	public void setJewelLoanModeId(int jewelLoanModeId) {
		this.jewelLoanModeId = jewelLoanModeId;
	}
	/**
	 * @return the jewelTakeOverFromPlaceId
	 */
	public int getJewelTakeOverFromPlaceId() {
		return jewelTakeOverFromPlaceId;
	}
	/**
	 * @param jewelTakeOverFromPlaceId the jewelTakeOverFromPlaceId to set
	 */
	public void setJewelTakeOverFromPlaceId(int jewelTakeOverFromPlaceId) {
		this.jewelTakeOverFromPlaceId = jewelTakeOverFromPlaceId;
	}
	/**
	 * @return the loanTenure
	 */
	public int getLoanTenure() {
		return loanTenure;
	}
	/**
	 * @param loanTenure the loanTenure to set
	 */
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	/**
	 * @return the serviceTax
	 */
	public String getServiceTax() {
		return String.valueOf(serviceTax);
	}
	/**
	 * @param serviceTax the serviceTax to set
	 */
	public void setServiceTax(String serviceTax) {
		this.serviceTax = Float.parseFloat(serviceTax);
	}
	/**
	 * @return the instaLoanNo
	 */
	public int getInstaLoanNo() {
		return instaLoanNo;
	}
	/**
	 * @param instaLoanNo the instaLoanNo to set
	 */
	public void setInstaLoanNo(int instaLoanNo) {
		this.instaLoanNo = instaLoanNo;
	}
	/**
	 * @return the instaLoanAmount
	 */
	public int getInstaLoanAmount() {
		return instaLoanAmount;
	}
	/**
	 * @param instaLoanAmount the instaLoanAmount to set
	 */
	public void setInstaLoanAmount(int instaLoanAmount) {
		this.instaLoanAmount = instaLoanAmount;
	}
	/**
	 * @return the highLimitKey
	 */
	public int getHighLimitKey() {
		return highLimitKey;
	}
	/**
	 * @param highLimitKey the highLimitKey to set
	 */
	public void setHighLimitKey(int highLimitKey) {
		this.highLimitKey = highLimitKey;
	}


	/**
	 * @return the repaymentTypeId
	 */
	public int getRepaymentTypeId() {
		return repaymentTypeId;
	}
	/**
	 * @param repaymentTypeId the repaymentTypeId to set
	 */
	public void setRepaymentTypeId(int repaymentTypeId) {
		this.repaymentTypeId = repaymentTypeId;
	}


	/**
	 * @return the customerPhotoPath
	 */
	public String getCustomerPhotoPath() {
		return customerPhotoPath;
	}
	/**
	 * @param customerPhotoPath the customerPhotoPath to set
	 */
	public void setCustomerPhotoPath(String customerPhotoPath) {
		this.customerPhotoPath = customerPhotoPath;
	}
	/**
	 * @return the jewelPhotoPath
	 */
	public String getJewelPhotoPath() {
		return jewelPhotoPath;
	}
	/**
	 * @param jewelPhotoPath the jewelPhotoPath to set
	 */
	public void setJewelPhotoPath(String jewelPhotoPath) {
		this.jewelPhotoPath = jewelPhotoPath;
	}



	
	public String toString() {
		if(this.loanAssetSplitUp != null) {
			return "Loan No : " + this.jewelLoanNo + " take over from :" + this.jewel_take_over_from_id + " loan type id : " + this.jewelLoanType
			+ " rate per gram : " + this.averageRatePerGram + " scheme " + this.jewel_scheme_id + " interest rate " + this.interest_rate +
			" customer name " + this.customerDetails.getCustomerName() + " phone " + this.customerDetails.getMobileNo() + 
			" address " + this.customerDetails.getAddress() + " loan amount " + this.loan_amount + " document charges " + 
			this.document_charges + " service charges " + this.service_charges + " no of asset split up " + this.loanAssetSplitUp.size();
		} else {
			return "Loan No : " + this.jewelLoanNo + " take over from :" + this.jewel_take_over_from_id + " loan type id : " + this.jewelLoanType
			+ " rate per gram : " + this.averageRatePerGram + " scheme " + this.jewel_scheme_id + " interest rate " + this.interest_rate +
			" customer name " + this.customerDetails.getCustomerName() + " phone " + this.customerDetails.getMobileNo() + 
			" address " +  this.customerDetails.getAddress() + " loan amount " + this.loan_amount + " document charges " + 
			this.document_charges + " service charges " + this.service_charges;
		}
	}
	public int getReleaseTypeId() {
		return releaseTypeId;
	}
	public void setReleaseTypeId(int releaseTypeId) {
		this.releaseTypeId = releaseTypeId;
	}

}
