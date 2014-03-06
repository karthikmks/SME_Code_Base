package com.bfp.valueobjects;

public class LoanAssestSplitUpVO {

	private int id;
	private int loan_no;
	private int depositLoanNo;
	/**
	 * @return the depositLoanNo
	 */
	public int getDepositLoanNo() {
		return depositLoanNo;
	}
	/**
	 * @param depositLoanNo the depositLoanNo to set
	 */
	public void setDepositLoanNo(int depositLoanNo) {
		this.depositLoanNo = depositLoanNo;
	} 
	private int transactionTypeId;
	private int jewel_category_id;
	private int jewel_type_id;
	private String gross_weight;
	private String reduced_weight;
	private String net_weight;
	private int quality_id;  
	private int total_quantity;  
	private String status;
	private int deposit_place_id;
	private int acct_holder_id;  
	private String created_by;
	private String created_timestamp;
	private String modified_by;
	private String acctHolderName;
	private String depositPlace;
	private int ratePerGram;
	private int jewelLoanType;
	public int getJewelLoanType() {
		return jewelLoanType;
	}
	public void setJewelLoanType(int jewelLoanType) {
		this.jewelLoanType = jewelLoanType;
	}
	/**
	 * @return the ratePerGram
	 */
	public int getRatePerGram() {
		return ratePerGram;
	}
	/**
	 * @param ratePerGram the ratePerGram to set
	 */
	public void setRatePerGram(int ratePerGram) {
		this.ratePerGram = ratePerGram;
	}
	/**
	 * @return the transactionTypeId
	 */
	public int getTransactionTypeId() {
		return transactionTypeId;
	}
	/**
	 * @return the acctHolderName
	 */
	public String getAcctHolderName() {
		return acctHolderName;
	}
	/**
	 * @param acctHolderName the acctHolderName to set
	 */
	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}
	/**
	 * @return the depositPlace
	 */
	public String getDepositPlace() {
		return depositPlace;
	}
	/**
	 * @param depositPlace the depositPlace to set
	 */
	public void setDepositPlace(String depositPlace) {
		this.depositPlace = depositPlace;
	}
	/**
	 * @param transactionTypeId the transactionTypeId to set
	 */
	public void setTransactionTypeId(int transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}
	private String modified_timestamp;
	private String active_flag;
	private String jewelCategory;
	private String jewelType;
	private String quality;


	/**
	 * @return the jewelCategory
	 */
	public String getJewelCategory() {
		return jewelCategory;
	}
	/**
	 * @param jewelCategory the jewelCategory to set
	 */
	public void setJewelCategory(String jewelCategory) {
		this.jewelCategory = jewelCategory;
	}
	/**
	 * @return the jewelType
	 */
	public String getJewelType() {
		return jewelType;
	}
	/**
	 * @param jewelType the jewelType to set
	 */
	public void setJewelType(String jewelType) {
		this.jewelType = jewelType;
	}
	/**
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}
	/**
	 * @param quality the quality to set
	 */
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLoan_no() {
		return loan_no;
	}
	public void setLoan_no(int loan_no) {
		this.loan_no = loan_no;
	}
	public int getJewel_category_id() {
		return jewel_category_id;
	}
	public void setJewel_category_id(int jewel_category_id) {
		this.jewel_category_id = jewel_category_id;
	}
	public int getJewel_type_id() {
		return jewel_type_id;
	}
	public void setJewel_type_id(int jewel_type_id) {
		this.jewel_type_id = jewel_type_id;
	}
	public String getGross_weight() {
		return gross_weight;
	}
	public void setGross_weight(String gross_weight) {
		this.gross_weight = gross_weight;
	}
	public String getReduced_weight() {
		return reduced_weight;
	}
	public void setReduced_weight(String reduced_weight) {
		this.reduced_weight = reduced_weight;
	}
	public String getNet_weight() {
		return net_weight;
	}
	public void setNet_weight(String net_weight) {
		this.net_weight = net_weight;
	}
	public int getQuality_id() {
		return quality_id;
	}
	public void setQuality_id(int quality_id) {
		this.quality_id = quality_id;
	}
	public int getTotal_quantity() {
		return total_quantity;
	}
	public void setTotal_quantity(int total_quantity) {
		this.total_quantity = total_quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDeposit_place_id() {
		return deposit_place_id;
	}
	public void setDeposit_place_id(int deposit_place_id) {
		this.deposit_place_id = deposit_place_id;
	}
	public int getAcct_holder_id() {
		return acct_holder_id;
	}
	public void setAcct_holder_id(int acct_holder_id) {
		this.acct_holder_id = acct_holder_id;
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





}
