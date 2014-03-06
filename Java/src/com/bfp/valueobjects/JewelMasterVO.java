package com.bfp.valueobjects;

import java.util.List;

/**
 * @author tiruppathir
 *
 */
public class JewelMasterVO {

	/**
	 * 
	 */
	private List<JewelCategoryVO> jewelCategory = null;

	/**
	 * @return the jewelCategory
	 */
	public List<JewelCategoryVO> getJewelCategory() {
		return jewelCategory;
	}

	/**
	 * @param jewelCategory the jewelCategory to set
	 */
	public void setJewelCategory(List<JewelCategoryVO> jewelCategory) {
		this.jewelCategory = jewelCategory;
	}
	
	private List<JewelQualityVO> jewelQualities = null;

	/**
	 * @return the jewelQualities
	 */
	public List<JewelQualityVO> getJewelTypes() {
		return jewelQualities;
	}

	/**
	 * @param jewelQualities the jewelQualities to set
	 */
	public void setJewelTypes(List<JewelQualityVO> jewelTypes) {
		this.jewelQualities = jewelTypes;
	}
	
}