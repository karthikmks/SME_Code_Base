package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.ReleaseTypeVO")]
	public dynamic class ReleaseTypeVO
	{
		public function ReleaseTypeVO()
		{
		}
		
		public var createDate:String;
		public var modifiedDate:String;
		public var releaseTypeId:int;
		public var releaseType:String;
		public var createdBy:String;
		public var modifiedBy:String;
		public var activeFlag:String;
		
		
	}
}