package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.PaymentTypeVO")]
	public dynamic class PaymentTypeVO
	{
		public function PaymentTypeVO()
		{
		}
		public var payment_type:String;
		public var created_by:String;
		public var created_timestamp:String;
		public var modified_by:String;
		public var modified_timestamp:String;
		public var active_flag:String;
		public var paymentTypeId:int;
		
	}
}