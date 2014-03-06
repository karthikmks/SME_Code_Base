package com.bfp.valueobjects;


/**
 * @author tiruppathir
 *
 */
public class BranchDetailsVO {

	private String jewelLoanNoStartsFrom;
	private String depositLoanNoStartsFrom;
	private String branchId;
	private String administrationPassword;
	/**
	 * @return the administrationPassword
	 */
	public String getAdministrationPassword() {
		return administrationPassword;
	}
	/**
	 * @param administrationPassword the administrationPassword to set
	 */
	public void setAdministrationPassword(String administrationPassword) {
		this.administrationPassword = administrationPassword;
	}
	/**
	 * @return the branchId
	 */
	public String getBranchId() {
		return branchId;
	}
	/**
	 * @return the jewelLoanNoStartsFrom
	 */
	public String getJewelLoanNoStartsFrom() {
		return jewelLoanNoStartsFrom;
	}
	/**
	 * @param jewelLoanNoStartsFrom the jewelLoanNoStartsFrom to set
	 */
	public void setJewelLoanNoStartsFrom(String jewelLoanNoStartsFrom) {
		this.jewelLoanNoStartsFrom = jewelLoanNoStartsFrom;
	}
	/**
	 * @return the depositLoanNoStartsFrom
	 */
	public String getDepositLoanNoStartsFrom() {
		return depositLoanNoStartsFrom;
	}
	/**
	 * @param depositLoanNoStartsFrom the depositLoanNoStartsFrom to set
	 */
	public void setDepositLoanNoStartsFrom(String depositLoanNoStartsFrom) {
		this.depositLoanNoStartsFrom = depositLoanNoStartsFrom;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	/**
	 * @return the branchAddress
	 */
	public String getBranchAddress() {
		return branchAddress;
	}
	/**
	 * @param branchAddress the branchAddress to set
	 */
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	/**
	 * @return the branchContactNo
	 */
	public String getBranchContactNo() {
		return branchContactNo;
	}
	/**
	 * @param branchContactNo the branchContactNo to set
	 */
	public void setBranchContactNo(String branchContactNo) {
		this.branchContactNo = branchContactNo;
	}
	/**
	 * @return the branchManagerName
	 */
	public String getBranchManagerName() {
		return branchManagerName;
	}
	/**
	 * @param branchManagerName the branchManagerName to set
	 */
	public void setBranchManagerName(String branchManagerName) {
		this.branchManagerName = branchManagerName;
	}
	/**
	 * @return the branchAdminName
	 */
	public String getBranchAdminName() {
		return branchAdminName;
	}
	/**
	 * @param branchAdminName the branchAdminName to set
	 */
	public void setBranchAdminName(String branchAdminName) {
		this.branchAdminName = branchAdminName;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}
	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	/**
	 * @return the activeFlag
	 */
	public String getActiveFlag() {
		return activeFlag;
	}
	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	private String branchName;
	private String branchAddress;
	private String branchContactNo;
	private int totalNoOfEmployees;
	/**
	 * @return the totalNoOfEmployees
	 */
	public int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}
	/**
	 * @param totalNoOfEmployees the totalNoOfEmployees to set
	 */
	public void setTotalNoOfEmployees(int totalNoOfEmployees) {
		this.totalNoOfEmployees = totalNoOfEmployees;
	}
	private int branchManagerId;
	/**
	 * @return the branchManagerId
	 */
	public int getBranchManagerId() {
		return branchManagerId;
	}
	/**
	 * @param branchManagerId the branchManagerId to set
	 */
	public void setBranchManagerId(int branchManagerId) {
		this.branchManagerId = branchManagerId;
	}
	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the modifiedDate
	 */
	public String getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	/**
	 * @return the branchAdminId
	 */
	public int getBranchAdminId() {
		return branchAdminId;
	}
	/**
	 * @param branchAdminId the branchAdminId to set
	 */
	public void setBranchAdminId(int branchAdminId) {
		this.branchAdminId = branchAdminId;
	}
	private String branchManagerName;
	private int branchAdminId;
	private String branchAdminName;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private String modifiedDate;
	private String activeFlag;
	
}