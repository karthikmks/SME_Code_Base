package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.BankAccountTypeVO")]
	public class BankAccountTypeVO
	{
		public function BankAccountTypeVO()
		{
		}
		public var bankAcctType:String;
		public var bankAcctTypeId:int;
	}
}