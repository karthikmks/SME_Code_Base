package com.bfp.valueobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UIComponentMapping {

	private int uIComponentMappingId;
	private String label;
	private int parentId;
	private int orderNumber;
	private String uIComponentId;
	private String uIChildIds;
	private String active;
	
	private List<UIComponentMapping> childList = new ArrayList<UIComponentMapping>();
	private List<UIComponentDetail> uiComponentList = new ArrayList<UIComponentDetail>();
	private List<Map<String, Object>> fileList = new ArrayList<Map<String, Object>>();
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getuIComponentId() {
		return uIComponentId;
	}
	public void setuIComponentId(String uIComponentId) {
		this.uIComponentId = uIComponentId;
	}
	public String getuIChildIds() {
		return uIChildIds;
	}
	public void setuIChildIds(String uIChildIds) {
		this.uIChildIds = uIChildIds;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public List<UIComponentMapping> getChildList() {
		return childList;
	}
	public void setChildList(List<UIComponentMapping> childList) {
		this.childList = childList;
	}
	public List<UIComponentDetail> getUiComponentList() {
		return uiComponentList;
	}
	public void setUiComponentList(List<UIComponentDetail> uiComponentList) {
		this.uiComponentList = uiComponentList;
	}
	public int getuIComponentMappingId() {
		return uIComponentMappingId;
	}
	public void setuIComponentMappingId(int uIComponentMappingId) {
		this.uIComponentMappingId = uIComponentMappingId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public List<Map<String, Object>> getFileList() {
		return fileList;
	}
	public void setFileList(List<Map<String, Object>> fileList) {
		this.fileList = fileList;
	}
	
}
