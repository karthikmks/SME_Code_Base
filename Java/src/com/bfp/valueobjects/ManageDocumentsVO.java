package com.bfp.valueobjects;

import java.util.List;
import java.util.Map;

public class ManageDocumentsVO {

	private int manageDocumentsId;
	private int typeId;
	private int categoryId;
	private int subCategoryId;
	private String createdBy;
	private String createdTimestamp;
	private String modifiedBy;
	private String modifiedTimestamp;
	private String activeFlag;
	
	private List<Map<String, byte[]>> fileList;
	
	private List<ManageDocCompDtlVO> manageDocCompDetailList;
	
	public int getManageDocumentsId() {
		return manageDocumentsId;
	}
	public void setManageDocumentsId(int manageDocumentsId) {
		this.manageDocumentsId = manageDocumentsId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedTimestamp() {
		return modifiedTimestamp;
	}
	public void setModifiedTimestamp(String modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public List<ManageDocCompDtlVO> getManageDocCompDetailList() {
		return manageDocCompDetailList;
	}
	public void setManageDocCompDetailList(
			List<ManageDocCompDtlVO> manageDocCompDetailList) {
		this.manageDocCompDetailList = manageDocCompDetailList;
	}
	public List<Map<String, byte[]>> getFileList() {
		return fileList;
	}
	public void setFileList(List<Map<String, byte[]>> fileList) {
		this.fileList = fileList;
	}
	
	
}
