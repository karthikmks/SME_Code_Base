package com.bfp.valueobjects;

public class PaymentTransactionVO {
	
	private int  id;
	private int transactionTypeId;
	private String payment_date;
	private int paymentTypeId;
	private String overDueCharges;
	/**
	 * @return the overDueCharges
	 */
	public String getOverDueCharges() {
		return overDueCharges;
	}
	/**
	 * @param overDueCharges the overDueCharges to set
	 */
	public void setOverDueCharges(String overDueCharges) {
		this.overDueCharges = overDueCharges;
	}
	/**
	 * @return the paymentTypeId
	 */
	public int getPaymentTypeId() {
		return paymentTypeId;
	}
	/**
	 * @param paymentTypeId the paymentTypeId to set
	 */
	public void setPaymentTypeId(int paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	private String principal_amount;
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
	private String interest_amount;
	private String actualInterestRate;
	private int noOfDays;
	private String status;
	private String created_by;
	private String created_timestamp;
	private String modified_by;
	private String modified_timestamp;
	private String active_flag;
	private int loanNo;
	private String paymentType;
	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the loanNo
	 */
	public int getLoanNo() {
		return loanNo;
	}
	/**
	 * @return the noOfDays
	 */
	public int getNoOfDays() {
		return noOfDays;
	}
	/**
	 * @param noOfDays the noOfDays to set
	 */
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	/**
	 * @param loanNo the loanNo to set
	 */
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	private int releaseTypeId;
	/**
	 * @return the actualInterestRate
	 */
	public String getActualInterestRate() {
		return actualInterestRate;
	}
	/**
	 * @param actualInterestRate the actualInterestRate to set
	 */
	public void setActualInterestRate(String actualInterestRate) {
		this.actualInterestRate = actualInterestRate;
	}
	/**
	 * @return the releaseTypeId
	 */
	public int getReleaseTypeId() {
		return releaseTypeId;
	}
	/**
	 * @param releaseTypeId the releaseTypeId to set
	 */
	public void setReleaseTypeId(int releaseTypeId) {
		this.releaseTypeId = releaseTypeId;
	}
	/**
	 * @return the customerInterestRate
	 */
	public String getCustomerInterestRate() {
		return customerInterestRate;
	}
	/**
	 * @param customerInterestRate the customerInterestRate to set
	 */
	public void setCustomerInterestRate(String customerInterestRate) {
		this.customerInterestRate = customerInterestRate;
	}
	private String customerInterestRate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public String getPrincipal_amount() {
		return principal_amount;
	}
	public void setPrincipal_amount(String principal_amount) {
		this.principal_amount = principal_amount;
	}
	public String getInterest_amount() {
		return interest_amount;
	}
	public void setInterest_amount(String interest_amount) {
		this.interest_amount = interest_amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
