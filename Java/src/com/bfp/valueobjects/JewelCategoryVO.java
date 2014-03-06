package com.bfp.valueobjects;

import java.util.Comparator;
import java.util.List;

/**
 * @author tiruppathir
 * @param <T>
 *
 */
public class JewelCategoryVO<T> implements Comparator<T>{

	/**
	 * 
	 */
	private String jewelCategoryName;
	/**
	 * 
	 */
	private String jewelCategoryId;
	/**
	 * 
	 */
	private List<JewelTypesVO> jewelCategoryTypes;
	/**
	 * @return the jewelCategoryName
	 */
	public String getJewelCategoryName() {
		return jewelCategoryName;
	}
	/**
	 * @param jewelCategoryName the jewelCategoryName to set
	 */
	public void setJewelCategoryName(String jewelCategoryName) {
		this.jewelCategoryName = jewelCategoryName;
	}
	/**
	 * @return the jewelCategoryId
	 */
	public String getJewelCategoryId() {
		return jewelCategoryId;
	}
	/**
	 * @param jewelCategoryId the jewelCategoryId to set
	 */
	public void setJewelCategoryId(String jewelCategoryId) {
		this.jewelCategoryId = jewelCategoryId;
	}
	/**
	 * @return the jewelCategoryTypes
	 */
	public List<JewelTypesVO> getJewelCategoryTypes() {
		return jewelCategoryTypes;
	}
	/**
	 * @param jewelCategoryTypes the jewelCategoryTypes to set
	 */
	public void setJewelCategoryTypes(List<JewelTypesVO> jewelCategoryTypes) {
		this.jewelCategoryTypes = jewelCategoryTypes;
	}
	
	public String toString() {
		if(this.jewelCategoryTypes == null) {
		return "Category Id : " + this.jewelCategoryId + " || Category Name : " + this.jewelCategoryName 
		+ " || Type Id : " + this.jewelTypeId + " || Type Name : " + this.jewelTypeName + "\n";
		} else {
			return "Category Id : " + this.jewelCategoryId + " || Category Name : " + this.jewelCategoryName 
			+ " || Total No of Types : " + this.jewelCategoryTypes.size() + "\n";
		}
	}
	
	/**
	 * 
	 */
	private String jewelTypeId;
	/**
	 * @param jewelTypeId the jewelTypeId to set
	 */
	public void setJewelTypeId(String jewelTypeId) {
		this.jewelTypeId = jewelTypeId;
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
	
	/**
	 * @return the jewelTypeId
	 */
	public String getJewelTypeId() {
		return jewelTypeId;
	}
	/**
	 * @return the jewelTypeName
	 */
	public String getJewelTypeName() {
		return jewelTypeName;
	}
	public boolean equals(Object obj) {
		boolean status = false;
		if(this != null && obj != null && obj instanceof JewelCategoryVO) {
			JewelCategoryVO temp = (JewelCategoryVO) obj;
			if(this.jewelCategoryId == temp.jewelCategoryId)
				status = true;
		}
		return status;
	}
	
	public int compare(T o1, T o2) {
		if(o1 != null && o2 != null && o1 instanceof JewelCategoryVO && o2 instanceof JewelCategoryVO) {
			if(Integer.parseInt(((JewelCategoryVO)o1).getJewelCategoryId()) > Integer.parseInt(((JewelCategoryVO)o2).getJewelCategoryId())) {
				return 1;
			}
		}
		return 0;
	}
	
}