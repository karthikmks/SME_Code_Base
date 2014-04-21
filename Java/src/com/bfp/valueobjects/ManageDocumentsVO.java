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
	private String branchId;
	private String keyField;
	private String auditStatus;
	private String branchDocComment;
	private String auditorDocComment;
	private String auditedBy;
	private String auditedTimestamp;
	private boolean isAuditorLogin;
	private String logedInUser;
	
	private List<Map<String, byte[]>> fileList;
	
	private List<ManageDocCompDtlVO> manageDocCompDetailList;
	
	
	public String getBranchDocComment() {
		return branchDocComment;
	}
	public void setBranchDocComment(String branchDocComment) {
		this.branchDocComment = branchDocComment;
	}
	public String getAuditorDocComment() {
		return auditorDocComment;
	}
	public void setAuditorDocComment(String auditorDocComment) {
		this.auditorDocComment = auditorDocComment;
	}
	
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
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getKeyField() {
		return keyField;
	}
	public void setKeyField(String keyField) {
		this.keyField = keyField;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditedBy() {
		return auditedBy;
	}
	public void setAuditedBy(String auditedBy) {
		this.auditedBy = auditedBy;
	}
	public String getAuditedTimestamp() {
		return auditedTimestamp;
	}
	public void setAuditedTimestamp(String auditedTimestamp) {
		this.auditedTimestamp = auditedTimestamp;
	}
	public boolean getIsAuditorLogin() {
		return isAuditorLogin;
	}
	public void setIsAuditorLogin(boolean isAuditorLogin) {
		this.isAuditorLogin = isAuditorLogin;
	}
	public String getLogedInUser() {
		return logedInUser;
	}
	public void setLogedInUser(String logedInUser) {
		this.logedInUser = logedInUser;
	}
	
	
	
}
