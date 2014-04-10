package valueobject
{
	import mx.collections.ArrayCollection;
	
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.UIComponentMapping")]
	public class UIComponentMapping
	{
		public function UIComponentMapping()
		{
		}
		
		public var uIComponentMappingId:int;
		public var label:String;
		public var parentId:int;
		public var orderNumber:int;
		public var uIComponentId:String;
		public var uIChildIds:String;
		public var active:String;
		
		public var childList:ArrayCollection;
		public var uiComponentList:ArrayCollection;
		
		
	}
}