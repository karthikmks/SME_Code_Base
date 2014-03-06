package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class DepositLoanInterestPeriodVO {

	private String interestPeriodId;
	private String interestPeriod;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private String modifiedDate;
	private String activeFlag;
	private String authenticationPassword;
	
	/**
	 * @return the authenticationPassword
	 */
	public String getAuthenticationPassword() {
		return authenticationPassword;
	}
	/**
	 * @param authenticationPassword the authenticationPassword to set
	 */
	public void setAuthenticationPassword(String authenticationPassword) {
		this.authenticationPassword = authenticationPassword;
	}
	/**
	 * @return the interestPeriodId
	 */
	public String getInterestPeriodId() {
		return interestPeriodId;
	}
	/**
	 * @param interestPeriodId the interestPeriodId to set
	 */
	public void setInterestPeriodId(String interestPeriodId) {
		this.interestPeriodId = interestPeriodId;
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
	 * @return the createDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreatedDate(String createDate) {
		this.createdDate = createDate;
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
	
	public String toString() {
		return "interestPeriodId : " + interestPeriodId + " interestPeriod " + interestPeriod + 
		" createdBy " + createdBy + " createdDate " + createdDate + " modifiedBy " + modifiedBy + 
		" modifiedDate " + modifiedDate + " activeFlag " + activeFlag;
	}
	
}