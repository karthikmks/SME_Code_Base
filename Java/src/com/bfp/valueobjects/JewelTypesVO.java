package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class JewelTypesVO {

	
	/**
	 * @param typeId
	 * @param typeName
	 */
	public JewelTypesVO(String typeId, String typeName) {
		this.jewelTypeId = typeId;
		this.jewelTypeName = typeName;
	}
	
	/**
	 * 
	 */
	private String jewelTypeId;
	/**
	 * @return the jewelTypeId
	 */
	public String getJewelTypeId() {
		return jewelTypeId;
	}
	/**
	 * @param jewelTypeId the jewelTypeId to set
	 */
	public void setJewelTypeId(String jewelTypeId) {
		this.jewelTypeId = jewelTypeId;
	}
	/**
	 * @return the jewelTypeName
	 */
	public String getJewelTypeName() {
		return jewelTypeName;
	}
	/**
	 * @param jewelTypeName the jewelTypeName to set
	 */
	public void setJewelTypeName(String jewelTypeName) {
		this.jewelTypeName = jewelTypeName;
	}
	/**
	 * 
	 */
	private String jewelTypeName;
	
}