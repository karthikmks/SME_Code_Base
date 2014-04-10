package com.bfp.valueobjects;

import java.util.List;
import java.util.Map;

/**
 * @author tiruppathir
 *
 */
public class ApplicationComponentsDataVO {

	private List<JewelCategoryVO> jewelCategories;

	private List<BankAccountTypeVO> bankAcctTypeList;
	private List<EducationVO> educationList;
	private List<GenderVO> genderList;
	private List<IdNAddressProofVO> idNAddressList;
	private List<MaritalStatusVO> maritalStatusList;
	private List<NationalityVO> nationalityList;
	private List<OccupationVO> occupationList;
	
	private AppConfigurationVO branchConfigData;
	private List<BranchDetailsVO> allBranchDetails;
	
	private List<UIComponentMapping> uICompDataMappingList;
	private String tempFileDirectory;
	
	public List<BranchDetailsVO> getAllBranchDetails() {
		return allBranchDetails;
	}
	public void setAllBranchDetails(List<BranchDetailsVO> allBranchDetails) {
		this.allBranchDetails = allBranchDetails;
	}
	/**
	 * @return the jewelCategories
	 */
	public List<JewelCategoryVO> getJewelCategories() {
		return jewelCategories;
	}
	/**
	 * @param jewelCategories the jewelCategories to set
	 */
	public void setJewelCategories(List<JewelCategoryVO> jewelCategories) {
		this.jewelCategories = jewelCategories;
	}
	/**
	 * @return the jewelSchemes
	 */
	public List<JewelSchemeVO> getJewelSchemes() {
		return jewelSchemes;
	}
	/**
	 * @param jewelSchemes the jewelSchemes to set
	 */
	public void setJewelSchemes(List<JewelSchemeVO> jewelSchemes) {
		this.jewelSchemes = jewelSchemes;
	}
	/**
	 * @return the jewelLoanTypes
	 */
	public List<JewelLoanTypeVO> getJewelLoanTypes() {
		return jewelLoanTypes;
	}
	/**
	 * @param jewelLoanTypes the jewelLoanTypes to set
	 */
	public void setJewelLoanTypes(List<JewelLoanTypeVO> jewelLoanTypes) {
		this.jewelLoanTypes = jewelLoanTypes;
	}
	/**
	 * @return the jewelTakeOverFrom
	 */
	public List<JewelTakeOverFromVO> getJewelTakeOverFrom() {
		return jewelTakeOverFrom;
	}
	/**
	 * @param jewelTakeOverFrom the jewelTakeOverFrom to set
	 */
	public void setJewelTakeOverFrom(List<JewelTakeOverFromVO> jewelTakeOverFrom) {
		this.jewelTakeOverFrom = jewelTakeOverFrom;
	}
	/**
	 * @return the jewelQualities
	 */
	public List<JewelQualityVO> getJewelQualities() {
		return jewelQualities;
	}
	/**
	 * @param jewelQualities the jewelQualities to set
	 */
	public void setJewelQualities(List<JewelQualityVO> jewelQualities) {
		this.jewelQualities = jewelQualities;
	}
	/**
	 * @return the paymentTypes
	 */
	public List<PaymentTypeVO> getPaymentTypes() {
		return paymentTypes;
	}
	/**
	 * @param paymentTypes the paymentTypes to set
	 */
	public void setPaymentTypes(List<PaymentTypeVO> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	/**
	 * @return the depositPlaces
	 */
	public List<DepositPlaceVO> getDepositPlaces() {
		return depositPlaces;
	}
	/**
	 * @param depositPlaces the depositPlaces to set
	 */
	public void setDepositPlaces(List<DepositPlaceVO> depositPlaces) {
		this.depositPlaces = depositPlaces;
	}
	/**
	 * @return the depositAccountHolders
	 */
	public List<DepositLoanAccountHoldersVO> getDepositAccountHolders() {
		return depositAccountHolders;
	}
	/**
	 * @param depositAccountHolders the depositAccountHolders to set
	 */
	public void setDepositAccountHolders(
			List<DepositLoanAccountHoldersVO> depositAccountHolders) {
		this.depositAccountHolders = depositAccountHolders;
	}
	/**
	 * @return the branchDetails
	 */
	public BranchDetailsVO getBranchDetails() {
		return branchDetails;
	}
	/**
	 * @param branchDetails the branchDetails to set
	 */
	public void setBranchDetails(BranchDetailsVO branchDetails) {
		this.branchDetails = branchDetails;
	}
	/**
	 * @return the releaseTypes
	 */
	public List<ReleaseTypeVO> getReleaseTypes() {
		return releaseTypes;
	}
	/**
	 * @param releaseTypes the releaseTypes to set
	 */
	public void setReleaseTypes(List<ReleaseTypeVO> releaseTypes) {
		this.releaseTypes = releaseTypes;
	}
	/**
	 * @return the depositLoanInterestPeriods
	 */
	public List<DepositLoanInterestPeriodVO> getDepositLoanInterestPeriods() {
		return depositLoanInterestPeriods;
	}
	/**
	 * @param depositLoanInterestPeriods the depositLoanInterestPeriods to set
	 */
	public void setDepositLoanInterestPeriods(
			List<DepositLoanInterestPeriodVO> depositLoanInterestPeriods) {
		this.depositLoanInterestPeriods = depositLoanInterestPeriods;
	}
	private List<JewelSchemeVO> jewelSchemes;
	private List<JewelLoanTypeVO> jewelLoanTypes;
	private List<JewelTakeOverFromVO> jewelTakeOverFrom;
	private List<JewelQualityVO> jewelQualities;
	private List<PaymentTypeVO> paymentTypes;
	private List<DepositPlaceVO> depositPlaces;
	private List<DepositLoanAccountHoldersVO> depositAccountHolders;
	private BranchDetailsVO branchDetails;
	private List<ReleaseTypeVO> releaseTypes;
	private List<DepositLoanInterestPeriodVO> depositLoanInterestPeriods;
	private List<EntitlementsVO> entitlements;
	private Map<String, List<ReportMetadata>> reportMetadataList;
	
	/**
	 * @return the reportMetadataList
	 */
	public Map<String, List<ReportMetadata>> getReportMetadataList() {
		return reportMetadataList;
	}
	/**
	 * @param reportMetadataList the reportMetadataList to set
	 */
	public void setReportMetadataList(
			Map<String, List<ReportMetadata>> reportMetadataList) {
		this.reportMetadataList = reportMetadataList;
	}
	/**
	 * @return the entitlements
	 */
	public List<EntitlementsVO> getEntitlements() {
		return entitlements;
	}
	/**
	 * @param entitlements the entitlements to set
	 */
	public void setEntitlements(List<EntitlementsVO> entitlements) {
		this.entitlements = entitlements;
	}
	
	private List<JewelLoanModeVO> jewelLoanModes;
	/**
	 * @return the jewelLoanModes
	 */
	public List<JewelLoanModeVO> getJewelLoanModes() {
		return jewelLoanModes;
	}
	/**
	 * @param jewelLoanModes the jewelLoanModes to set
	 */
	public void setJewelLoanModes(List<JewelLoanModeVO> jewelLoanModes) {
		this.jewelLoanModes = jewelLoanModes;
	}
	public List<BankAccountTypeVO> getBankAcctTypeList() {
		return bankAcctTypeList;
	}
	public void setBankAcctTypeList(List<BankAccountTypeVO> bankAcctTypeList) {
		this.bankAcctTypeList = bankAcctTypeList;
	}
	public List<EducationVO> getEducationList() {
		return educationList;
	}
	public void setEducationList(List<EducationVO> educationList) {
		this.educationList = educationList;
	}
	public List<GenderVO> getGenderList() {
		return genderList;
	}
	public void setGenderList(List<GenderVO> genderList) {
		this.genderList = genderList;
	}
	public List<IdNAddressProofVO> getIdNAddressList() {
		return idNAddressList;
	}
	public void setIdNAddressList(List<IdNAddressProofVO> idNAddressList) {
		this.idNAddressList = idNAddressList;
	}
	public List<MaritalStatusVO> getMaritalStatusList() {
		return maritalStatusList;
	}
	public void setMaritalStatusList(List<MaritalStatusVO> maritalStatusList) {
		this.maritalStatusList = maritalStatusList;
	}
	public List<NationalityVO> getNationalityList() {
		return nationalityList;
	}
	public void setNationalityList(List<NationalityVO> nationalityList) {
		this.nationalityList = nationalityList;
	}
	public List<OccupationVO> getOccupationList() {
		return occupationList;
	}
	public void setOccupationList(List<OccupationVO> occupationList) {
		this.occupationList = occupationList;
	}
	public AppConfigurationVO getBranchConfigData() {
		return branchConfigData;
	}
	public void setBranchConfigData(AppConfigurationVO branchConfigData) {
		this.branchConfigData = branchConfigData;
	}
	public List<UIComponentMapping> getuICompDataMappingList() {
		return uICompDataMappingList;
	}
	public void setuICompDataMappingList(List<UIComponentMapping> uICompDataMappingList) {
		this.uICompDataMappingList = uICompDataMappingList;
	}
	public String getTempFileDirectory() {
		return tempFileDirectory;
	}
	public void setTempFileDirectory(String tempFileDirectory) {
		this.tempFileDirectory = tempFileDirectory;
	}
	
}
