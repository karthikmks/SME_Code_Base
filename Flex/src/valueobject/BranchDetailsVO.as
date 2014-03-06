package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.BranchDetailsVO")]
	public dynamic class BranchDetailsVO
	{
		public function BranchDetailsVO()
		{
		}
		public var branchId:String;
		public var branchName:String;
		public var branchAddress:String;
		public var branchContactNo:String;
		public var totalNoOfEmployees:String;
		public var branchManagerId:int;
		public var branchManagerName:String;
		public var branchAdminId:int;
		public var branchAdminName:String;
		public var createdBy:String;
		public var modifiedBy:String;
		public var activeFlag:String;
		public var modifiedDate:String;
		public var createdDate:String;
		public var jewelLoanNoStartsFrom:String;
		public var depositLoanNoStartsFrom:String;
		public var administrationPassword:String;
		
	}
}