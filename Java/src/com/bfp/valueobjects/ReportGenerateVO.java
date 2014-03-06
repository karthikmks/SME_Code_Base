package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class ReportGenerateVO {

	private String loanType;
	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}
	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	/**
	 * @return the fromDate
	 */
	public String getFromDate() {
		return fromDate;
	}
	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	/**
	 * @return the toDate
	 */
	public String getToDate() {
		return toDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	/**
	 * @return the selectType
	 */
	public String getSelectType() {
		return selectType;
	}
	/**
	 * @param selectType the selectType to set
	 */
	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}
	private String fromDate;
	private String toDate;
	private String selectType;
}