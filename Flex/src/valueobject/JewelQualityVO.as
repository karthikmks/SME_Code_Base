package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.JewelQualityVO")]
	public dynamic class JewelQualityVO
	{
		public function JewelQualityVO()
		{
		}
		public var jewelQualityId:String;
		public var jewelQualityName:String;
	}
}