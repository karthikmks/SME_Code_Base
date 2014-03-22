package valueobject
{
	import flash.utils.ByteArray;
	
	import mx.collections.ArrayCollection;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.DayBookVO")]
	public class DayBookVO
	{
		public function DayBookVO()
		{
		}
		
		public var paymentsList:ArrayCollection = new ArrayCollection();//PaymentsNReceivedVO:String;
		public var receivedList:ArrayCollection = new ArrayCollection();//PaymentsNReceivedVO:String;
		//public var denominations:DenominationsVO = new DenominationsVO():String;
		public var branchId:String;
		public var createdBy:String;
		
		public var noOf_1000:String; 
		public var noOf_500:String; 
		public var noOf_100:String; 
		public var noOf_50:String; 
		public var noOf_20:String; 
		public var noOf_10:String; 
		public var noOf_5:String; 
		public var noOf_1:String; 
		public var shortageAmt:String;
		public var totalAmt:String;
		
		public var lockerGoldGrams:String;
		public var lockerGoldNoOfPoc:String;
		public var lockerSilverGrams:String;
		public var lockerSilverNoOfPoc:String;
		
		public var salesGoldGrams:String;
		public var salesGoldNoOfPoc:String;
		public var salesSilverGrams:String;
		public var salesSilverNoOfPoc:String;
		
		public var auctionGoldGrams:String;
		public var auctionGoldNoOfPoc:String;
		public var auctionSilverGrams:String;
		public var auctionSilverNoOfPoc:String;
		
		public var dayBookWorkSheet:ByteArray;
	}
}