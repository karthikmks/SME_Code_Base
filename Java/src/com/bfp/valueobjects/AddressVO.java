package com.bfp.valueobjects;

public class AddressVO {

	private String address;
	private String doorNo;
	private String street;
	private String road;
	private String area;
	private String village;
	private String town;
	private String taluka;
	private String district;
	private int pincode;
	private int distanceFromBranch;
	
	
	public String getAddress() {
		return ""+address+"\n"
		+doorNo+"\n"
		+street+"\n"
		+road+"\n"
		+area+"\n"
		+village+"\n"
		+town+"\n"
		+taluka+"\n"
		+district+"\n"
		+pincode;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getDistanceFromBranch() {
		return distanceFromBranch;
	}
	public void setDistanceFromBranch(int distanceFromBranch) {
		this.distanceFromBranch = distanceFromBranch;
	}

}
