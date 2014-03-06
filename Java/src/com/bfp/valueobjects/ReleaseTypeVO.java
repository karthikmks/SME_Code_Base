package com.bfp.valueobjects;


/**
 * @author tiruppathir
 *
 */
public class ReleaseTypeVO {

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
	 * @return the releaseType
	 */
	public String getReleaseType() {
		return releaseType;
	}
	/**
	 * @param releaseType the releaseType to set
	 */
	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
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
	private String releaseType;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private String modifiedDate;
	private String activeFlag;
	
}