package valueobject
{
	import mx.collections.ArrayCollection;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.JewelSchemeVO")]
	public dynamic class JewelSchemeVO
	{
		public function JewelSchemeVO()
		{
		}
		
		public var jewel_scheme_name:String;
		public var created_by:String;
		public var created_timestamp:String;
		public var modified_by:String;
		public var modified_timestamp:String;
		public var active_flag:String;
		public var authenticationPassword:String;
		public var flexibleSchemeFlag:String;
		
		
		public var jewelSchemeId:int;
		public var loanTenureInMonths:int;
		public var possibleFlexiMonth:int;
		public var jewelQualityId:int;
		public var ratePerGram:Number;
		public var interestBreakupId:int;
		public var fromDay:int;
		public var toDay:int;
		public var interestAmount:Number;
		public var orderValue:int;
		
		public var flexiMonths:ArrayCollection; // arr: String
		
		public var jewelSchemeQualityRate:ArrayCollection;  // arr:  JewelSchemeVO
		public var jewelSchemeInterest:ArrayCollection; // arr:  JewelSchemeVO
		
		public var rateOfInterest:String;
		
		
		
		
	}
}