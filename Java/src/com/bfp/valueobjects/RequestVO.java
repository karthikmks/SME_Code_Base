package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class RequestVO {

	private int transactionTypeId;
	private int loanNo;
	private int employeeId;
	private String searchBy;
	private String customerId;
	private String customerName;
	private int jewelLoanTypeId;
	private String ledgerLoanFlag;
	
	
	private BasicSearchVO basicSearchVO;

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
	 * @return the ledgerLoanFlag
	 */
	public String getLedgerLoanFlag() {
		return ledgerLoanFlag;
	}

	/**
	 * @param ledgerLoanFlag the ledgerLoanFlag to set
	 */
	public void setLedgerLoanFlag(String ledgerLoanFlag) {
		this.ledgerLoanFlag = ledgerLoanFlag;
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
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	

	/**
	 * @return the searchBy
	 */
	public String getSearchBy() {
		return searchBy;
	}

	/**
	 * @param searchBy the searchBy to set
	 */
	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

	/**
	 * @return the jewelLoanTypeId
	 */
	public int getJewelLoanTypeId() {
		return jewelLoanTypeId;
	}

	/**
	 * @param jewelLoanTypeId the jewelLoanTypeId to set
	 */
	public void setJewelLoanTypeId(int jewelLoanTypeId) {
		this.jewelLoanTypeId = jewelLoanTypeId;
	}

	public BasicSearchVO getBasicSearchVO() {
		return basicSearchVO;
	}

	public void setBasicSearchVO(BasicSearchVO basicSearchVO) {
		this.basicSearchVO = basicSearchVO;
	}

}