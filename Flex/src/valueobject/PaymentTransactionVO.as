package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.PaymentTransactionVO")]
	public class PaymentTransactionVO
	{
		public function PaymentTransactionVO()
		{
		}
		public var id:int;
		public var transactionTypeId:int;
		public var paymentTypeId:int;
		public var noOfDays:int;
		public var loanNo:int;
		public var releaseTypeId:int;
		
		public var payment_date:String;
		public var overDueCharges:String;
		public var interest_amount:String;
		public var principal_amount:String;
		public var actualInterestRate:String;
		public var status:String;
		public var created_by:String;
		public var created_timestamp:String;
		public var modified_by:String;
		public var modified_timestamp:String;
		public var active_flag:String;
		public var customerInterestRate:String;
		public var paymentType:String;
	}
}