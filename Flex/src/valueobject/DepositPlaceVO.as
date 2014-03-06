package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.DepositPlaceVO")]
	public class DepositPlaceVO
	{
		public function DepositPlaceVO()
		{
		}
		public var deposit_place:String;
		public var created_by:String;
		public var created_timestamp:String;
		public var modified_by:String;
		public var modified_timestamp:String;
		public var active_flag:String;
		public var depositPlaceId:int;
		public var authenticationPassword:String;
		
	}
}