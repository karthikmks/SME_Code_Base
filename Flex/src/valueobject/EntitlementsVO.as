package valueobject
{	
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.EntitlementsVO")]
	public class EntitlementsVO
	{
		public function EntitlementsVO()
		{
		}
		public var roleId:int;
		public var role:String;
		public var description:String;
		public var createdTimestamp:String;
		public var modifiedBy:String;
		public var modifiedTimestamp:String;
		public var activeFlag:String;
		public var createdBy:String;
		
	}
}