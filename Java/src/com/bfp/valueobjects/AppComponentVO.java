package com.bfp.valueobjects;

public class AppComponentVO {
	private String branchId;
	private String componentId;
	private String visibleFlag;
	private String possibleValues;
	private String activeFlag;
	
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public String getVisibleFlag() {
		return visibleFlag;
	}
	public void setVisibleFlag(String visibleFlag) {
		this.visibleFlag = visibleFlag;
	}
	public String getPossibleValues() {
		return possibleValues;
	}
	public void setPossibleValues(String possibleValues) {
		this.possibleValues = possibleValues;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
}