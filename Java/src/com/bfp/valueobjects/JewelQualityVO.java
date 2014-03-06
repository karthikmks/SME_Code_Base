package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class JewelQualityVO {

	/**
	 * 
	 */
	private String jewelQualityId;
	/**
	 * 
	 */
	private String jewelQualityName;
	/**
	 * @return the jewelQualityId
	 */
	public String getJewelQualityId() {
		return jewelQualityId;
	}
	/**
	 * @param jewelQualityId the jewelQualityId to set
	 */
	public void setJewelQualityId(String jewelQualityId) {
		this.jewelQualityId = jewelQualityId;
	}
	/**
	 * @return the jewelQualityName
	 */
	public String getJewelQualityName() {
		return jewelQualityName;
	}
	/**
	 * @param jewelQualityName the jewelQualityName to set
	 */
	public void setJewelQualityName(String jewelQualityName) {
		this.jewelQualityName = jewelQualityName;
	}
	
	public String toString() {
		return "Quality Id : " + this.jewelQualityId + " || Quality Name : " + this.jewelQualityName + "\n";
	}	
}