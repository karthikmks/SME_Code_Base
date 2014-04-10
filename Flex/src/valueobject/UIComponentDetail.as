package valueobject
{
	
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.UIComponentDetail")]
	public class UIComponentDetail
	{
		public function UIComponentDetail()
		{
		}
		
		public var uIComponentDetailId:int;
		public var label:String;
		public var uIComponentType:String;
		public var docName:String;
		public var active:String;
		
	}
}