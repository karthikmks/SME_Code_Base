package com.bfp.valueobjects;

public class DepositLoanAccountHoldersVO {
	
	private String acct_holder_name;
	private String is_authorised;
	private String created_by;
	private String created_timestamp;
	private String modified_by;
	private String modified_timestamp;
	private String active_flag;
	private int acctHolderId;
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
	public String getAcct_holder_name() {
		return acct_holder_name;
	}
	public void setAcct_holder_name(String acct_holder_name) {
		this.acct_holder_name = acct_holder_name;
	}
	/**
	 * @return the acctHolderId
	 */
	public int getAcctHolderId() {
		return acctHolderId;
	}
	/**
	 * @param acctHolderId the acctHolderId to set
	 */
	public void setAcctHolderId(int acctHolderId) {
		this.acctHolderId = acctHolderId;
	}
	public String getIs_authorised() {
		return is_authorised;
	}
	public void setIs_authorised(String is_authorised) {
		this.is_authorised = is_authorised;
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
		return "Account Holder name : " + this.acct_holder_name + " is Authorised  : " + this.is_authorised 
		+ " Created by : " + this.created_by + " created time : " + this.created_timestamp + "  modified_by : "+this.modified_by
		+" modified_time_stamp : "+modified_timestamp+"  Active Flag : "+active_flag;
		
	}
	

}
