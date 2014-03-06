package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.DepositLoanInterestPeriodVO")]
	public class DepositLoanInterestPeriodVO
	{
		public function DepositLoanInterestPeriodVO()
		{
		}
		
		public var interestPeriodId:String;
		public var interestPeriod:String;
		public var createdBy:String;
		public var createDate:String;
		public var modifiedBy:String;
		public var modifiedDate:String;
		public var activeFlag:String;
		public var authenticationPassword:String;
	}
}