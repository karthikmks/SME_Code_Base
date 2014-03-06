package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.DepositLoanAccountHoldersVO")]
	public class DepositLoanAccountHoldersVO
	{
		public function DepositLoanAccountHoldersVO()
		{
		}

		public var acct_holder_name:String;
		public var is_authorised:String;
		public var created_by:String;
		public var created_timestamp:String;
		public var modified_by:String;
		public var modified_timestamp:String;
		public var active_flag:String;
		public var acctHolderId:int;
		public var authenticationPassword:String;
	
	}
}