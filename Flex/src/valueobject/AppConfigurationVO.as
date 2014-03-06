package valueobject
{
	import mx.collections.ArrayCollection;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.AppConfigurationVO")]
	public class AppConfigurationVO
	{
		public function AppConfigurationVO()
		{
		}
		
		public var branchId:String; 
		public var selectedBranchIds:String; 
		public var componentList:ArrayCollection = new ArrayCollection; //AppComponentVO 
	}
}