package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class SearchRequestVO {

	private String transactionDate;
	private int transactionTypeId;
	private int loanNo;
	private int releaseTypeId;
	
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
	 * @return the transactionDate
	 */
	public String getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
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
	
	public String toString() {
		return "loanNo " + loanNo + " transactionTypeId " + transactionTypeId + " transactionDate " + transactionDate;
	}
	
}