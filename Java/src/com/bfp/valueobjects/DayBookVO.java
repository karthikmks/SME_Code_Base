package com.bfp.valueobjects;

import java.util.LinkedList;
import java.util.List;

public class DayBookVO {

	private List<PaymentsNReceivedVO> paymentsList = new LinkedList<PaymentsNReceivedVO>();
	private List<PaymentsNReceivedVO> receivedList = new LinkedList<PaymentsNReceivedVO>();
	
	//private DenominationsVO denominations = new DenominationsVO();
	private String branchId;
	private String createdBy;
	private String noOf_1000; 
	private String noOf_500; 
	private String noOf_100; 
	private String noOf_50; 
	private String noOf_20; 
	private String noOf_10; 
	private String noOf_5; 
	private String noOf_1; 
	private String shortageAmt;
	private String totalAmt;
	
	private String lockerGoldGrams;
	private String lockerGoldNoOfPoc;
	private String lockerSilverGrams;
	private String lockerSilverNoOfPoc;
	
	private String salesGoldGrams;
	private String salesGoldNoOfPoc;
	private String salesSilverGrams;
	private String salesSilverNoOfPoc;
	
	private String auctionGoldGrams;
	private String auctionGoldNoOfPoc;
	private String auctionSilverGrams;
	private String auctionSilverNoOfPoc;
	
	private byte[] dayBookWorkSheet;
	
	public List<PaymentsNReceivedVO> getPaymentsList() {
		return paymentsList;
	}
	public void setPaymentsList(List<PaymentsNReceivedVO> paymentsList) {
		this.paymentsList = paymentsList;
	}
	public List<PaymentsNReceivedVO> getReceivedList() {
		return receivedList;
	}
	public void setReceivedList(List<PaymentsNReceivedVO> receivedList) {
		this.receivedList = receivedList;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public byte[] getDayBookWorkSheet() {
		return dayBookWorkSheet;
	}
	public void setDayBookWorkSheet(byte[] dayBookWorkSheet) {
		this.dayBookWorkSheet = dayBookWorkSheet;
	}
	public String getNoOf_1000() {
		if(noOf_1000!=null)
			return noOf_1000.trim();
		return noOf_1000;
	}
	public void setNoOf_1000(String noOf_1000) {
		this.noOf_1000 = noOf_1000;
	}
	public String getNoOf_500() {
		if(noOf_500!=null)
			return noOf_500.trim();
		return noOf_500;
	}
	public void setNoOf_500(String noOf_500) {
		this.noOf_500 = noOf_500;
	}
	public String getNoOf_100() {
		if(noOf_100!=null)
			return noOf_100.trim();
		return noOf_100;
	}
	public void setNoOf_100(String noOf_100) {
		this.noOf_100 = noOf_100;
	}
	public String getNoOf_50() {
		if(noOf_50!=null)
			return noOf_50.trim();
		return noOf_50;
	}
	public void setNoOf_50(String noOf_50) {
		this.noOf_50 = noOf_50;
	}
	public String getNoOf_20() {
		if(noOf_20!=null)
			return noOf_20.trim();
		return noOf_20;
	}
	public void setNoOf_20(String noOf_20) {
		this.noOf_20 = noOf_20;
	}
	public String getNoOf_10() {
		if(noOf_10!=null)
			return noOf_10.trim();
		return noOf_10;
	}
	public void setNoOf_10(String noOf_10) {
		this.noOf_10 = noOf_10;
	}
	public String getNoOf_5() {
		if(noOf_5!=null)
			return noOf_5.trim();
		return noOf_5;
	}
	public void setNoOf_5(String noOf_5) {
		this.noOf_5 = noOf_5;
	}
	public String getNoOf_1() {
		if(noOf_1!=null)
			return noOf_1.trim();
		return noOf_1;
	}
	public void setNoOf_1(String noOf_1) {
		this.noOf_1 = noOf_1;
	}
	public String getShortageAmt() {
		if(shortageAmt!=null)
			return shortageAmt.trim();
		return shortageAmt;
	}
	public void setShortageAmt(String shortageAmt) {
		this.shortageAmt = shortageAmt;
	}
	public String getTotalAmt() {
		if(totalAmt!=null)
			return totalAmt.trim();
		return totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getLockerGoldGrams() {
		if(lockerGoldGrams!=null)
			return lockerGoldGrams.trim();
		return lockerGoldGrams;
	}
	public void setLockerGoldGrams(String lockerGoldGrams) {
		this.lockerGoldGrams = lockerGoldGrams;
	}
	public String getLockerGoldNoOfPoc() {
		if(lockerGoldNoOfPoc!=null)
			return lockerGoldNoOfPoc.trim();
		return lockerGoldNoOfPoc;
	}
	public void setLockerGoldNoOfPoc(String lockerGoldNoOfPoc) {
		this.lockerGoldNoOfPoc = lockerGoldNoOfPoc;
	}
	public String getLockerSilverGrams() {
		if(lockerSilverGrams!=null)
			return lockerSilverGrams.trim();
		return lockerSilverGrams;
	}
	public void setLockerSilverGrams(String lockerSilverGrams) {
		this.lockerSilverGrams = lockerSilverGrams;
	}
	public String getLockerSilverNoOfPoc() {
		if(lockerSilverNoOfPoc!=null)
			return lockerSilverNoOfPoc.trim();
		return lockerSilverNoOfPoc;
	}
	public void setLockerSilverNoOfPoc(String lockerSilverNoOfPoc) {
		this.lockerSilverNoOfPoc = lockerSilverNoOfPoc;
	}
	public String getSalesGoldGrams() {
		if(salesGoldGrams!=null)
			return salesGoldGrams.trim();
		return salesGoldGrams;
	}
	public void setSalesGoldGrams(String salesGoldGrams) {
		this.salesGoldGrams = salesGoldGrams;
	}
	public String getSalesGoldNoOfPoc() {
		if(salesGoldNoOfPoc!=null)
			return salesGoldNoOfPoc.trim();
		return salesGoldNoOfPoc;
	}
	public void setSalesGoldNoOfPoc(String salesGoldNoOfPoc) {
		this.salesGoldNoOfPoc = salesGoldNoOfPoc;
	}
	public String getSalesSilverGrams() {
		if(salesSilverGrams!=null)
			return salesSilverGrams.trim();
		return salesSilverGrams;
	}
	public void setSalesSilverGrams(String salesSilverGrams) {
		this.salesSilverGrams = salesSilverGrams;
	}
	public String getSalesSilverNoOfPoc() {
		if(salesSilverNoOfPoc!=null)
			return salesSilverNoOfPoc.trim();
		return salesSilverNoOfPoc;
	}
	public void setSalesSilverNoOfPoc(String salesSilverNoOfPoc) {
		this.salesSilverNoOfPoc = salesSilverNoOfPoc;
	}
	public String getAuctionGoldGrams() {
		if(auctionGoldGrams!=null)
			return auctionGoldGrams.trim();
		return auctionGoldGrams;
	}
	public void setAuctionGoldGrams(String auctionGoldGrams) {
		this.auctionGoldGrams = auctionGoldGrams;
	}
	public String getAuctionGoldNoOfPoc() {
		if(auctionGoldNoOfPoc!=null)
			return auctionGoldNoOfPoc.trim();
		return auctionGoldNoOfPoc;
	}
	public void setAuctionGoldNoOfPoc(String auctionGoldNoOfPoc) {
		this.auctionGoldNoOfPoc = auctionGoldNoOfPoc;
	}
	public String getAuctionSilverGrams() {
		if(auctionSilverGrams!=null)
			return auctionSilverGrams.trim();
		return auctionSilverGrams;
	}
	public void setAuctionSilverGrams(String auctionSilverGrams) {
		this.auctionSilverGrams = auctionSilverGrams;
	}
	public String getAuctionSilverNoOfPoc() {
		if(auctionSilverNoOfPoc!=null)
			return auctionSilverNoOfPoc.trim();
		return auctionSilverNoOfPoc;
	}
	public void setAuctionSilverNoOfPoc(String auctionSilverNoOfPoc) {
		this.auctionSilverNoOfPoc = auctionSilverNoOfPoc;
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
