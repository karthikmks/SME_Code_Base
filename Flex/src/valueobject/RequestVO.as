package valueobject
{
	import mx.collections.ArrayCollection;
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.RequestVO")]
	public class RequestVO
	{
		public function RequestVO()
		{
		}
		
		public var transactionTypeId:Number;
		public var jewelLoanTypeId:Number;
		public var loanNo:Number;
		public var employeeId:Number;
		
		public var searchBy:String;
		public var customerId:String;
		public var customerName:String;

		public var ledgerLoanFlag:String;
		
		public var basicSearchVO:BasicSearchVO;
	}
}
