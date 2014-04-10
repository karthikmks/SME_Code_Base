package com.bfp.valueobjects;

public class ManageDocCompDtlVO {
	
	private int manageDocCompDetialId;
	private int parentId;
	private int uiCompId;
	
	private String uiCompValue;
	public int getManageDocCompDetialId() {
		return manageDocCompDetialId;
	}
	public void setManageDocCompDetialId(int manageDocCompDetialId) {
		this.manageDocCompDetialId = manageDocCompDetialId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getUiCompId() {
		return uiCompId;
	}
	public void setUiCompId(int uiCompId) {
		this.uiCompId = uiCompId;
	}
	public String getUiCompValue() {
		return uiCompValue;
	}
	public void setUiCompValue(String uiCompValue) {
		this.uiCompValue = uiCompValue;
	}

}
