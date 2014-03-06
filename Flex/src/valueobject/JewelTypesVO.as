package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.JewelTypesVO")]
	public dynamic class JewelTypesVO
	{
		public function JewelTypesVO()
		{
		}
		public var jewelTypeId:String;
		
		public var jewelTypeName:String;
	}
}