package com.bfp.valueobjects;

public class PaymentsNReceivedVO {

	private String branchId;
	private String createdBy;
	private String serialNum;
	private String category;
	private String header;
	private String loanNum;
	private String scheme;
	private String days;
	private String roi;
	private String depositNum;
	private String nameOrParticulars;
	private String contactNum;
	private String grams;
	private String noOfPoc;
	private String amount;
	private String dayBookType;
	
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getSerialNum() {
		if(serialNum!=null)
			return serialNum.trim();
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public String getCategory() {
		if(category!=null)
			return category.trim();
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getHeader() {
		if(header!=null)
			return header.trim();
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getLoanNum() {
		if(loanNum!=null)
			return loanNum.trim();
		return loanNum;
	}
	public void setLoanNum(String loanNum) {
		this.loanNum = loanNum;
	}
	public String getScheme() {
		if(scheme!=null)
			return scheme.trim();
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getDays() {
		if(days!=null)
			return days.trim();
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getRoi() {
		if(roi!=null)
			return roi.trim();
		return roi;
	}
	public void setRoi(String roi) {
		this.roi = roi;
	}
	public String getDepositNum() {
		if(depositNum!=null)
			return depositNum.trim();
		return depositNum;
	}
	public void setDepositNum(String depositNum) {
		this.depositNum = depositNum;
	}
	public String getNameOrParticulars() {
		if(nameOrParticulars!=null)
			return nameOrParticulars.trim();
		return nameOrParticulars;
	}
	public void setNameOrParticulars(String nameOrParticulars) {
		this.nameOrParticulars = nameOrParticulars;
	}
	public String getContactNum() {
		if(contactNum!=null)
			return contactNum.trim();
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public String getGrams() {
		if(grams!=null)
			return grams.trim();
		return grams;
	}
	public void setGrams(String grams) {
		this.grams = grams;
	}
	public String getNoOfPoc() {
		if(noOfPoc!=null)
			return noOfPoc.trim();
		return noOfPoc;
	}
	public void setNoOfPoc(String noOfPoc) {
		this.noOfPoc = noOfPoc;
	}
	public String getAmount() {
		if(amount!=null)
			return amount.trim();
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDayBookType() {
		if(dayBookType!=null)
			return dayBookType.trim();
		return dayBookType;
	}
	public void setDayBookType(String dayBookType) {
		this.dayBookType = dayBookType;
	}
	public String getCreatedBy() {
		if(createdBy!=null)
			return createdBy.trim();
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
