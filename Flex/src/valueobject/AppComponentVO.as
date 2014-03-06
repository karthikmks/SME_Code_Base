package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.AppComponentVO")]
	public class AppComponentVO
	{
		public function AppComponentVO()
		{
		}
		
		public var branchId:String; 
		public var componentId:String; 
		public var visibleFlag:String; 
		public var possibleValues:String; 
		public var activeFlag:String; 
	}
}