package com.bfp.valueobjects;


/**
 * @author vasana
 *
 */
public class JewelLoanTypeVO {
	
	private String jewel_loan_type;
	private String created_by;
	private String created_timestamp;
	private String modified_by;
	private String modified_timestamp;
	private String active_flag;
	private int jewelLoanTypeId;
	
	
	/**
	 * @return the jewelLoanTypeId
	 */
	public int getJewelLoanTypeId() {
		return jewelLoanTypeId;
	}
	/**
	 * @param jewelLoanTypeId the jewelLoanTypeId to set
	 */
	public void setJewelLoanTypeId(int jewelLoanTypeId) {
		this.jewelLoanTypeId = jewelLoanTypeId;
	}
	public String getJewel_loan_type() {
		return jewel_loan_type;
	}
	public void setJewel_loan_type(String jewel_loan_type) {
		this.jewel_loan_type = jewel_loan_type;
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
		return "Jewel Loan Type : " + this.jewel_loan_type 
		+ " Created by : " + this.created_by + " created time : " + this.created_timestamp + "  modified_by : "+this.modified_by
		+" modified_time_stamp : "+modified_timestamp+"  Active Flag : "+active_flag;
		
	}

}
