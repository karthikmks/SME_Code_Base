package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.JewelTakeOverFromVO")]
	public class JewelTakeOverFromVO
	{
		public function JewelTakeOverFromVO()
		{
		}
		public var jewel_take_over_from:String;
		public var created_by:String;
		public var created_timestamp:String;
		public var modified_by:String;
		public var modified_timestamp:String;
		public var active_flag:String;
		public var jewelTakeOverFromId:int;
		public var authenticationPassword:String;
		
	}
}