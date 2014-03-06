package com.bfp.valueobjects;

import java.util.List;

/**
 * @author tiruppathir
 *
 */
public class ResponseVO {

	/**
	 * 
	 */
	private String status;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the responseData
	 */
	public List getResponseData() {
		return responseData;
	}
	/**
	 * @param responseData the responseData to set
	 */
	public void setResponseData(List responseData) {
		this.responseData = responseData;
	}
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private List responseData;
	
}