package valueobject
{
	import mx.collections.ArrayCollection;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.ApplicationComponentsDataVO")]
	public class ApplicationComponentsDataVO
	{
		public function ApplicationComponentsDataVO()
		{
		}
		public var jewelCategories:ArrayCollection; //JewelCategoryVO
		public var jewelSchemes:ArrayCollection; //JewelSchemeVO
		
		public var jewelLoanTypes:ArrayCollection; //JewelLoanTypeVO
		
		public var jewelTakeOverFrom:ArrayCollection; //JewelTakeOverFromVO
		
		public var jewelQualities:ArrayCollection; //JewelQualityVO
		
		public var paymentTypes:ArrayCollection; //PaymentTypeVO
		
		public var depositPlaces:ArrayCollection; //DepositPlaceVO
		
		public var depositAccountHolders:ArrayCollection; //DepositLoanAccountHoldersVO
		
		public var releaseTypes:ArrayCollection; //ReleaseTypeVO
		
		public var depositLoanInterestPeriods:ArrayCollection; //DepositLoanInterestPeriodVO
	
		public var jewelTypes:JewelTypesVO; 
		public var branchDetails:BranchDetailsVO;
		
		public var entitlements:ArrayCollection; //EntitlementsVO
		public var reportMetadataList:Object; //Map<String, List<ReportMetadata>>
		
		public var jewelLoanModes:ArrayCollection; //JewelLoanModeVO
		
		public var bankAcctTypeList:ArrayCollection; //BankAccountTypeVO
        public var educationList:ArrayCollection; //EducationVO
        public var genderList:ArrayCollection; //GenderVO
        public var idNAddressList:ArrayCollection; //IdNAddressProofVO
        public var maritalStatusList:ArrayCollection; //MaritalStatusVO
        public var nationalityList:ArrayCollection; //NationalityVO
        public var occupationList:ArrayCollection; //OccupationVO
		
        public var branchConfigData:AppConfigurationVO; //AppConfigurationVO
        public var allBranchDetails:ArrayCollection; //BranchDetailsVO
		
		public var uICompDataMappingList:ArrayCollection;//UIComponentMapping
		
		public var tempFileDirectory:String;
	}
}