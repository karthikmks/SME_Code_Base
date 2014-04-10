package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.ManageDocCompDtlVO")]
	public class ManageDocCompDtlVO
	{
		public function ManageDocCompDtlVO()
		{
		}
		
		public var manageDocCompDetialId:int;
		public var parentId:int;
		public var uiCompId:int;
		public var uiCompValue:String;
		
	}
}