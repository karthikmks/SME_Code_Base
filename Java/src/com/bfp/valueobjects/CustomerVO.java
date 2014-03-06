package com.bfp.valueobjects;

/**
 * @author tiruppathir
 * 
 */
public class CustomerVO {

	private int customerId;
	private String customerNameInit;
	private String customerName;
	private int maritalStatusId;
	private int occupationId;

	private String fatherNameInit;
	private String fatherName;
	private String spouceNameInit;
	private String spouceName;
	private int educationId;
	private String companyName;

	private String dateOfBirth;
	private int genderId;
	private int nationalityId;
	private int yearlyIncome;

	private String mobileNo;
	private String officeNo;
	private String residenceLandLineNo;
	private String fatherOrMotherNo;
	private String spouceNo;
	private String friendNo;
	private String officeLandLineNo;
	private String emailAddress;

	private String bankAcctNo;
	private String bankAcctHolderName;
	private String bankName;
	private int bankAcctTypeId;

	private int idProofId;
	private String idProofOther;
	private byte[] idProofPhoto;
	private int addressProofId;
	private String addressProofOther;
	private byte[] addressProofPhoto;

	private String panCardNo;
	private byte[] panCardPhoto;

	private int referenceCustomerId;
	private int linkedCustomerId;
	private String remarks;

	private byte[] customerPhoto;

	private int branchId;

	private String searchCustFromDate;
	private String searchCustToDate;

	

	private String custPhotoPath;
	private String custIdProofPhotoPath;
	private String custAddrProofPhotoPath;
	private String custPancardPhotoPath;
	
	private String createdBy;
	private String modifyBy;
	
	private String sameAsResAddr;
	
	
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
	private String distanceFromBranch;
	
	private String officeAddress;
	private String officeDoorNo;
	private String officeStreet;
	private String officeRoad;
	private String officeArea;
	private String officeVillage;
	private String officeTown;
	private String officeTaluka;
	private String officeDistrict;
	private int officePincode;
	private String officeDistanceFromBranch;
	private String overwriteCustomerPhoto;
	private String allBranchIds;
	
	
	public String getOverwriteCustomerPhoto() {
		return overwriteCustomerPhoto;
	}
	public void setOverwriteCustomerPhoto(String overwriteCustomerPhoto) {
		this.overwriteCustomerPhoto = overwriteCustomerPhoto;
	}
	public String getAddress() {
		return doorNo+" "+street+"\n"
		+road+", "+area+"\n"
		+village+", "+town+"\n"
		+taluka+"\n"
		+district+"- "+pincode;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getOfficeAddress() {
		if("Y".equalsIgnoreCase(this.sameAsResAddr)){
			return getAddress();
		}else{
			return officeDoorNo+", "+officeStreet+"\n"
			+officeRoad+", "+officeArea+"\n"
			+officeVillage+", "+officeTown+"\n"
			+officeTaluka+"\n"
			+officeDistrict+"- "+officePincode;
		}
	}
	
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getMaritalStatusId() {
		return maritalStatusId;
	}
	public void setMaritalStatusId(int maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}
	public int getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(int occupationId) {
		this.occupationId = occupationId;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getSpouceName() {
		return spouceName;
	}
	public void setSpouceName(String spouceName) {
		this.spouceName = spouceName;
	}
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getGenderId() {
		return genderId;
	}
	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}
	public int getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(int nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getYearlyIncome() {
		return yearlyIncome;
	}
	public void setYearlyIncome(int yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getOfficeNo() {
		return officeNo;
	}
	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}
	public String getResidenceLandLineNo() {
		return residenceLandLineNo;
	}
	public void setResidenceLandLineNo(String residenceLandLineNo) {
		this.residenceLandLineNo = residenceLandLineNo;
	}
	public String getFatherOrMotherNo() {
		return fatherOrMotherNo;
	}
	public void setFatherOrMotherNo(String fatherOrMotherNo) {
		this.fatherOrMotherNo = fatherOrMotherNo;
	}
	public String getSpouceNo() {
		return spouceNo;
	}
	public void setSpouceNo(String spouceNo) {
		this.spouceNo = spouceNo;
	}
	public String getFriendNo() {
		return friendNo;
	}
	public void setFriendNo(String friendNo) {
		this.friendNo = friendNo;
	}
	public String getOfficeLandLineNo() {
		return officeLandLineNo;
	}
	public void setOfficeLandLineNo(String officeLandLineNo) {
		this.officeLandLineNo = officeLandLineNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getBankAcctNo() {
		return bankAcctNo;
	}
	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}
	public String getBankAcctHolderName() {
		return bankAcctHolderName;
	}
	public void setBankAcctHolderName(String bankAcctHolderName) {
		this.bankAcctHolderName = bankAcctHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankAcctTypeId() {
		return bankAcctTypeId;
	}
	public void setBankAcctTypeId(int bankAcctTypeId) {
		this.bankAcctTypeId = bankAcctTypeId;
	}
	public int getIdProofId() {
		return idProofId;
	}
	public void setIdProofId(int idProofId) {
		this.idProofId = idProofId;
	}
	public String getIdProofOther() {
		return idProofOther;
	}
	public void setIdProofOther(String idProofOther) {
		this.idProofOther = idProofOther;
	}
	public byte[] getIdProofPhoto() {
		return idProofPhoto;
	}
	public void setIdProofPhoto(byte[] idProofPhoto) {
		this.idProofPhoto = idProofPhoto;
	}
	public int getAddressProofId() {
		return addressProofId;
	}
	public void setAddressProofId(int addressProofId) {
		this.addressProofId = addressProofId;
	}
	public String getAddressProofOther() {
		return addressProofOther;
	}
	public void setAddressProofOther(String addressProofOther) {
		this.addressProofOther = addressProofOther;
	}
	public byte[] getAddressProofPhoto() {
		return addressProofPhoto;
	}
	public void setAddressProofPhoto(byte[] addressProofPhoto) {
		this.addressProofPhoto = addressProofPhoto;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public byte[] getPanCardPhoto() {
		return panCardPhoto;
	}
	public void setPanCardPhoto(byte[] panCardPhoto) {
		this.panCardPhoto = panCardPhoto;
	}
	public int getReferenceCustomerId() {
		return referenceCustomerId;
	}
	public void setReferenceCustomerId(int referenceCustomerId) {
		this.referenceCustomerId = referenceCustomerId;
	}
	public int getLinkedCustomerId() {
		return linkedCustomerId;
	}
	public void setLinkedCustomerId(int linkedCustomerId) {
		this.linkedCustomerId = linkedCustomerId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public byte[] getCustomerPhoto() {
		return customerPhoto;
	}
	public void setCustomerPhoto(byte[] customerPhoto) {
		this.customerPhoto = customerPhoto;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getSearchCustFromDate() {
		return searchCustFromDate;
	}
	public void setSearchCustFromDate(String searchCustFromDate) {
		this.searchCustFromDate = searchCustFromDate;
	}
	public String getSearchCustToDate() {
		return searchCustToDate;
	}
	public void setSearchCustToDate(String searchCustToDate) {
		this.searchCustToDate = searchCustToDate;
	}
	public String getCustPhotoPath() {
		return custPhotoPath;
	}
	public void setCustPhotoPath(String custPhotoPath) {
		this.custPhotoPath = custPhotoPath;
	}
	public String getCustIdProofPhotoPath() {
		return custIdProofPhotoPath;
	}
	public void setCustIdProofPhotoPath(String custIdProofPhotoPath) {
		this.custIdProofPhotoPath = custIdProofPhotoPath;
	}
	public String getCustAddrProofPhotoPath() {
		return custAddrProofPhotoPath;
	}
	public void setCustAddrProofPhotoPath(String custAddrProofPhotoPath) {
		this.custAddrProofPhotoPath = custAddrProofPhotoPath;
	}
	public String getCustPancardPhotoPath() {
		return custPancardPhotoPath;
	}
	public void setCustPancardPhotoPath(String custPancardPhotoPath) {
		this.custPancardPhotoPath = custPancardPhotoPath;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public String getSameAsResAddr() {
		return sameAsResAddr;
	}
	public void setSameAsResAddr(String sameAsResAddr) {
		this.sameAsResAddr = sameAsResAddr;
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
	public String getDistanceFromBranch() {
		return distanceFromBranch;
	}
	public void setDistanceFromBranch(String distanceFromBranch) {
		this.distanceFromBranch = distanceFromBranch;
	}
	public String getOfficeDoorNo() {
		return officeDoorNo;
	}
	public void setOfficeDoorNo(String officeDoorNo) {
		this.officeDoorNo = officeDoorNo;
	}
	public String getOfficeStreet() {
		return officeStreet;
	}
	public void setOfficeStreet(String officeStreet) {
		this.officeStreet = officeStreet;
	}
	public String getOfficeRoad() {
		return officeRoad;
	}
	public void setOfficeRoad(String officeRoad) {
		this.officeRoad = officeRoad;
	}
	public String getOfficeArea() {
		return officeArea;
	}
	public void setOfficeArea(String officeArea) {
		this.officeArea = officeArea;
	}
	public String getOfficeVillage() {
		return officeVillage;
	}
	public void setOfficeVillage(String officeVillage) {
		this.officeVillage = officeVillage;
	}
	public String getOfficeTown() {
		return officeTown;
	}
	public void setOfficeTown(String officeTown) {
		this.officeTown = officeTown;
	}
	public String getOfficeTaluka() {
		return officeTaluka;
	}
	public void setOfficeTaluka(String officeTaluka) {
		this.officeTaluka = officeTaluka;
	}
	public String getOfficeDistrict() {
		return officeDistrict;
	}
	public void setOfficeDistrict(String officeDistrict) {
		this.officeDistrict = officeDistrict;
	}
	public int getOfficePincode() {
		return officePincode;
	}
	public void setOfficePincode(int officePincode) {
		this.officePincode = officePincode;
	}
	public String getOfficeDistanceFromBranch() {
		return officeDistanceFromBranch;
	}
	public void setOfficeDistanceFromBranch(String officeDistanceFromBranch) {
		this.officeDistanceFromBranch = officeDistanceFromBranch;
	}
	public String getCustomerNameInit() {
		return customerNameInit;
	}
	public void setCustomerNameInit(String customerNameInit) {
		this.customerNameInit = customerNameInit;
	}
	public String getFatherNameInit() {
		return fatherNameInit;
	}
	public void setFatherNameInit(String fatherNameInit) {
		this.fatherNameInit = fatherNameInit;
	}
	public String getSpouceNameInit() {
		return spouceNameInit;
	}
	public void setSpouceNameInit(String spouceNameInit) {
		this.spouceNameInit = spouceNameInit;
	}
	public String getAllBranchIds() {
		return allBranchIds;
	}
	public void setAllBranchIds(String allBranchIds) {
		this.allBranchIds = allBranchIds;
	}
}