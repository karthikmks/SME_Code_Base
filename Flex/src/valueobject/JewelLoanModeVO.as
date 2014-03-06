package valueobject
{
	
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.JewelLoanModeVO")]
	public dynamic class JewelLoanModeVO
	{
		public function JewelLoanModeVO()
		{
		}
		
		public var jewelLoanMode:String;
		public var createdBy:String;
		public var createdTimestamp:String;
		public var modifiedBy:String;
		public var modifiedTimestamp:String;
		public var activeFlag:String;
		public var jewelLoanModeId:int;
		
	}
}