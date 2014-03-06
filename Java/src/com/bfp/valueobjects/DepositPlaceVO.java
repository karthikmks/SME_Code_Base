package com.bfp.valueobjects;

public class DepositPlaceVO {

	private String deposit_place;
	private String created_by;
	private String created_timestamp;
	private String modified_by;
	private String modified_timestamp;
	private String active_flag;
	private int depositPlaceId;
	private String authenticationPassword;

	/**
	 * @return the authenticationPassword
	 */
	public String getAuthenticationPassword() {
		return authenticationPassword;
	}
	/**
	 * @param authenticationPassword the authenticationPassword to set
	 */
	public void setAuthenticationPassword(String authenticationPassword) {
		this.authenticationPassword = authenticationPassword;
	}
	
	
	/**
	 * @return the depositPlaceId
	 */
	public int getDepositPlaceId() {
		return depositPlaceId;
	}
	/**
	 * @param depositPlaceId the depositPlaceId to set
	 */
	public void setDepositPlaceId(int depositPlaceId) {
		this.depositPlaceId = depositPlaceId;
	}
	public String getDeposit_place() {
		return deposit_place;
	}
	public void setDeposit_place(String deposit_place) {
		this.deposit_place = deposit_place;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(String created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getModified_timestamp() {
		return modified_timestamp;
	}
	public void setModified_timestamp(String modified_timestamp) {
		this.modified_timestamp = modified_timestamp;
	}
	public String getActive_flag() {
		return active_flag;
	}
	public void setActive_flag(String active_flag) {
		this.active_flag = active_flag;
	}
	
	public String toString() {
		return "Deposit Place : " + this.deposit_place 
		+ " Created by : " + this.created_by + " created time : " + this.created_timestamp + "  modified_by : "+this.modified_by
		+" modified_time_stamp : "+modified_timestamp+"  Active Flag : "+active_flag;
		
	}
	
}
