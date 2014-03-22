package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.PaymentsNReceivedVO")]
	public class PaymentsNReceivedVO
	{
		public function PaymentsNReceivedVO()
		{
		}
		
		public var branchId:String;
		public var serialNum:String;
		public var category:String;
		public var header:String;
		public var loanNum:String;
		public var scheme:String;
		public var days:String;
		public var roi:String;
		public var depositNum:String;
		public var nameOrParticulars:String;
		public var contactNum:String;
		public var grams:String;
		public var noOfPoc:String;
		public var amount:String;
		public var dayBookType:String;
	}
}