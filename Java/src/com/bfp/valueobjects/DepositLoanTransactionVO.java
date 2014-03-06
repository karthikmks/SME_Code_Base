package com.bfp.valueobjects;

import java.util.List;

public class DepositLoanTransactionVO {
	
	private int deposit_loan_no;
	private String deposit_loan_transaction_date;
	private String loanTenure;
	/**
	 * @return the loanTenure
	 */
	public String getLoanTenure() {
		return loanTenure;
	}
	/**
	 * @param loanTenure the loanTenure to set
	 */
	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}
	private int deposit_place_id;
	private int acct_holder_name_id;
	private String rate_per_gram;
	private String loan_amount;  
	private String interest_rate;
	private String other_fee;
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
	private List<LoanAssestSplitUpVO> loanAssetSplitUp;
	private String isThisJointLoan;
	private int transactionTypeId;
	private List<PaymentTransactionVO> paymentTransactions;
	private String depositPlace;
	private String acctHolderName;
	private String interestPeriod;
	private String authorized;
	private int loanNo;
	private String ledgerLoan;
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
	 * @return the interestPeriod
	 */
	public String getInterestPeriod() {
		return interestPeriod;
	}
	/**
	 * @param interestPeriod the interestPeriod to set
	 */
	public void setInterestPeriod(String interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
	/**
	 * @return the authorized
	 */
	public String getAuthorized() {
		return authorized;
	}
	/**
	 * @param authorized the authorized to set
	 */
	public void setAuthorized(String authorized) {
		this.authorized = authorized;
	}
	/**
	 * @return the loanNo
	 */
	public int getLoanNo() {
		return loanNo;
	}
	/**
	 * @param loanNo the loanNo to set
	 */
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
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
	private int jewelLoanNo;
	private String penaltyInterest;
	private int interestPeriodId;
	
	/**
	 * @return the interestPeriodId
	 */
	public int getInterestPeriodId() {
		return interestPeriodId;
	}
	/**
	 * @param interestPeriodId the interestPeriodId to set
	 */
	public void setInterestPeriodId(int interestPeriodId) {
		this.interestPeriodId = interestPeriodId;
	}
	/**
	 * @return the penaltyInterest
	 */
	public String getPenaltyInterest() {
		return penaltyInterest;
	}
	/**
	 * @param penaltyInterest the penaltyInterest to set
	 */
	public void setPenaltyInterest(String penaltyInterest) {
		this.penaltyInterest = penaltyInterest;
	}
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
	 * @return the isThisJointLoan
	 */
	public String getIsThisJointLoan() {
		return isThisJointLoan;
	}
	/**
	 * @param isThisJointLoan the isThisJointLoan to set
	 */
	public void setIsThisJointLoan(String isThisJointLoan) {
		this.isThisJointLoan = isThisJointLoan;
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
	public int getDeposit_loan_no() {
		return deposit_loan_no;
	}
	public void setDeposit_loan_no(int deposit_loan_no) {
		this.deposit_loan_no = deposit_loan_no;
	}
	public String getDeposit_loan_transaction_date() {
		return deposit_loan_transaction_date;
	}
	public void setDeposit_loan_transaction_date(
			String deposit_loan_transaction_date) {
		this.deposit_loan_transaction_date = deposit_loan_transaction_date;
	}
	public int getDeposit_place_id() {
		return deposit_place_id;
	}
	public void setDeposit_place_id(int deposit_place_id) {
		this.deposit_place_id = deposit_place_id;
	}
	public int getAcct_holder_name_id() {
		return acct_holder_name_id;
	}
	public void setAcct_holder_name_id(int acct_holder_name_id) {
		this.acct_holder_name_id = acct_holder_name_id;
	}
	public String getRate_per_gram() {
		return rate_per_gram;
	}
	public void setRate_per_gram(String rate_per_gram) {
		this.rate_per_gram = rate_per_gram;
	}
	public String getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(String loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(String interest_rate) {
		this.interest_rate = interest_rate;
	}
	public String getOther_fee() {
		return other_fee;
	}
	public void setOther_fee(String other_fee) {
		this.other_fee = other_fee;
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
	
	
	
}
