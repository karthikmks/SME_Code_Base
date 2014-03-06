package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class ReportInputParamsVO {

	private String loanIndicator;
	/**
	 * @return the loanIndicator
	 */
	public String getLoanIndicator() {
		return loanIndicator;
	}
	/**
	 * @param loanIndicator the loanIndicator to set
	 */
	public void setLoanIndicator(String loanIndicator) {
		this.loanIndicator = loanIndicator;
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
	 * @return the reportType
	 */
	public String getReportType() {
		return reportType;
	}
	/**
	 * @param reportType the reportType to set
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	private String fromDate;
	private String toDate;
	private String reportType;
}