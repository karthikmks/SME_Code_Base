package valueobject
{
	import flash.utils.ByteArray;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.CustomerVO")]
	public class CustomerVO
	{
		public function CustomerVO()
		{
		}
		public var customerId:int;
		public var customerName:String;
		public var maritalStatusId:int;
		public var occupationId:int;
		
		public var fatherName:String;
		public var spouceName:String;
		public var educationId:int;
		public var companyName:String;
	
		public var dateOfBirth:String;
		public var genderId:int;
		public var nationalityId:int;
		public var yearlyIncome:Number;
		
		//public var residenceAddress:AddressVO;
		//public var officeAddress:AddressVO;
		
		public var mobileNo:String;
		public var officeNo:String;
		public var residenceLandLineNo:String;
		public var fatherOrMotherNo:String;
		public var spouceNo:String;
		public var friendNo:String;
		public var officeLandLineNo:String;
		public var emailAddress:String;
		
		public var bankAcctNo:String;
		public var bankAcctHolderName:String;
		public var bankName:String;
		public var bankAcctTypeId:int;
		
		public var idProofId:int;
		public var idProofOther:String;
		public var idProofPhoto:ByteArray;
		public var addressProofId:int;
		public var addressProofOther:String;
		public var addressProofPhoto:ByteArray;
		
		
		public var panCardNo:String;
		public var panCardPhoto:ByteArray;
		
		
		public var referenceCustomerId:int;
		public var linkedCustomerId:int;
		public var remarks:String;
		
		public var customerPhoto:ByteArray;
		
		public var createdBy:String;
		public var branchId:int;
		
		public var searchCustFromDate:String;
		public var searchCustToDate:String;
		
		public var modifyBy:String;
		public var sameAsResAddr:String;
		
		
		public var address:String;
		public var doorNo:String;
		public var street:String;
		public var road:String;
		public var area:String;
		public var village:String;
		public var town:String;
		public var taluka:String;
		public var district:String;
		public var pincode:int;
		public var distanceFromBranch:String;
		
		public var officeAddress:String;
		public var officeDoorNo:String;
		public var officeStreet:String;
		public var officeRoad:String;
		public var officeArea:String;
		public var officeVillage:String;
		public var officeTown:String;
		public var officeTaluka:String;
		public var officeDistrict:String;
		public var officePincode:int;
		public var officeDistanceFromBranch:String;
		
		public var spouceNameInit:String;
		public var fatherNameInit:String;
		public var customerNameInit:String;
		public var overwriteCustomerPhoto:String;
		public var allBranchIds:String;
	}
}