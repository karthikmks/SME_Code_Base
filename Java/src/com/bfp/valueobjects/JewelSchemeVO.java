package com.bfp.valueobjects;

import java.util.ArrayList;
import java.util.List;

public class JewelSchemeVO {

	private String jewel_scheme_name;
	private String created_by;
	private String created_timestamp;
	private String modified_by;
	private String modified_timestamp;
	private String active_flag;
	private int jewelSchemeId; 
	private String authenticationPassword;
	private int loanTenureInMonths;
	private int possibleFlexiMonth;
	private List<String> flexiMonths; 
	/**
	 * @return the flexiMonths
	 */
	public List<String> getFlexiMonths() {
		return flexiMonths;
	}
	/**
	 * @param flexiMonths the flexiMonths to set
	 */
	public void setFlexiMonths(List<String> flexiMonths) {
		this.flexiMonths = flexiMonths;
	}
	
	public void addFlexiMonths(String flexiMonth) {
		if(this.flexiMonths == null) 
			this.flexiMonths = new ArrayList<String>();
		this.flexiMonths.add(flexiMonth);
	}
	
	/**
	 * @return the possibleFlexiMonth
	 */
	public int getPossibleFlexiMonth() {
		return possibleFlexiMonth;
	}
	/**
	 * @param possibleFlexiMonth the possibleFlexiMonth to set
	 */
	public void setPossibleFlexiMonth(int possibleFlexiMonth) {
		this.possibleFlexiMonth = possibleFlexiMonth;
	}
	/**
	 * @return the loanTenureInMonths
	 */
	public int getLoanTenureInMonths() {
		return loanTenureInMonths;
	}
	/**
	 * @param loanTenureInMonths the loanTenureInMonths to set
	 */
	public void setLoanTenureInMonths(int loanTenureInMonths) {
		this.loanTenureInMonths = loanTenureInMonths;
		if(loanTenureInMonths != 0)
			this.addFlexiMonths("" + this.loanTenureInMonths);
	}
	/**
	 * @return the flexibleSchemeFlag
	 */
	public String getFlexibleSchemeFlag() {
		return flexibleSchemeFlag;
	}
	/**
	 * @param flexibleSchemeFlag the flexibleSchemeFlag to set
	 */
	public void setFlexibleSchemeFlag(String flexibleSchemeFlag) {
		this.flexibleSchemeFlag = flexibleSchemeFlag;
	}

	private String flexibleSchemeFlag;

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


	public String getJewel_scheme_name() {
		return jewel_scheme_name;
	}
	public void setJewel_scheme_name(String jewel_scheme_name) {
		this.jewel_scheme_name = jewel_scheme_name;
	}
	/**
	 * @return the jewelSchemeId
	 */
	public int getJewelSchemeId() {
		return jewelSchemeId;
	}
	/**
	 * @param jewelSchemeId the jewelSchemeId to set
	 */
	public void setJewelSchemeId(int jewelSchemeId) {
		this.jewelSchemeId = jewelSchemeId;
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
		return "Jewel Scheme name : " + this.jewel_scheme_name 
		+ " Created by : " + this.created_by + " created time : " + this.created_timestamp + "  modified_by : "+this.modified_by
		+" modified_time_stamp : "+modified_timestamp+"  Active Flag : "+active_flag;

	}

	private int jewelQualityId;
	/**
	 * @return the jewelQualityId
	 */
	public int getJewelQualityId() {
		return jewelQualityId;
	}
	/**
	 * @param jewelQualityId the jewelQualityId to set
	 */
	public void setJewelQualityId(int jewelQualityId) {
		this.jewelQualityId = jewelQualityId;
	}
	/**
	 * @return the ratePerGram
	 */
	public int getRatePerGram() {
		return ratePerGram;
	}
	/**
	 * @param ratePerGram the ratePerGram to set
	 */
	public void setRatePerGram(int ratePerGram) {
		this.ratePerGram = ratePerGram;
	}

	private int ratePerGram;
	
	private List<JewelSchemeVO> jewelSchemeQualityRate = null;
	/**
	 * @return the jewelSchemeQualityRate
	 */
	public List<JewelSchemeVO> getJewelSchemeQualityRate() {
		return jewelSchemeQualityRate;
	}
	/**
	 * @param jewelSchemeQualityRate the jewelSchemeQualityRate to set
	 */
	public void setJewelSchemeQualityRate(List<JewelSchemeVO> jewelSchemeQualityRate) {
		this.jewelSchemeQualityRate = jewelSchemeQualityRate;
	}
	
	public void addJewelSchemeQualityRate(JewelSchemeVO scheme) {
		if(this.jewelSchemeQualityRate == null)
			this.jewelSchemeQualityRate = new ArrayList<JewelSchemeVO>();
		this.jewelSchemeQualityRate.add(scheme);
	}
	
	private List<JewelSchemeVO> jewelSchemeInterest = null;
	
	/**
	 * @return the jewelSchemeInterest
	 */
	public List<JewelSchemeVO> getJewelSchemeInterest() {
		return jewelSchemeInterest;
	}
	/**
	 * @param jewelSchemeInterest the jewelSchemeInterest to set
	 */
	public void setJewelSchemeInterest(List<JewelSchemeVO> jewelSchemeInterest) {
		this.jewelSchemeInterest = jewelSchemeInterest;
	}
	
	public void addJewelSchemeInterest(JewelSchemeVO scheme) {
		if(this.jewelSchemeInterest == null)
			this.jewelSchemeInterest = new ArrayList<JewelSchemeVO>();
		this.jewelSchemeInterest.add(scheme);
	}

	private int interestBreakupId;
	/**
	 * @return the interestBreakupId
	 */
	public int getInterestBreakupId() {
		return interestBreakupId;
	}
	/**
	 * @param interestBreakupId the interestBreakupId to set
	 */
	public void setInterestBreakupId(int interestBreakupId) {
		this.interestBreakupId = interestBreakupId;
	}
	/**
	 * @return the fromDay
	 */
	public int getFromDay() {
		return fromDay;
	}
	/**
	 * @param fromDay the fromDay to set
	 */
	public void setFromDay(int fromDay) {
		this.fromDay = fromDay;
	}
	/**
	 * @return the toDay
	 */
	public int getToDay() {
		return toDay;
	}
	/**
	 * @param toDay the toDay to set
	 */
	public void setToDay(int toDay) {
		this.toDay = toDay;
	}
	/**
	 * @return the rateOfInterest
	 */
	public String getRateOfInterest() {
		return String.valueOf(rateOfInterest);
	}
	/**
	 * @param rateOfInterest the rateOfInterest to set
	 */
	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = Float.parseFloat(rateOfInterest);
	}

	private int fromDay;
	private int toDay;
	private float rateOfInterest;
	private int interestAmount;
	private int orderValue;
	/**
	 * @return the orderValue
	 */
	public int getOrderValue() {
		return orderValue;
	}
	/**
	 * @param orderValue the orderValue to set
	 */
	public void setOrderValue(int orderValue) {
		this.orderValue = orderValue;
	}
	/**
	 * @return the interestAmount
	 */
	public int getInterestAmount() {
		return interestAmount;
	}
	/**
	 * @param interestAmount the interestAmount to set
	 */
	public void setInterestAmount(int interestAmount) {
		this.interestAmount = interestAmount;
	}
}