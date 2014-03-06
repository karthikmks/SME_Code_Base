package com.bfp.valueobjects;

import java.util.List;

public class AppConfigurationVO {
	
	private String branchId;
	private String selectedBranchIds;
	private List<AppComponentVO> componentList;
	
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getSelectedBranchIds() {
		return selectedBranchIds;
	}
	public void setSelectedBranchIds(String selectedBranchIds) {
		this.selectedBranchIds = selectedBranchIds;
	}
	public List<AppComponentVO> getComponentList() {
		return componentList;
	}
	public void setComponentList(List<AppComponentVO> componentList) {
		this.componentList = componentList;
	}
}
