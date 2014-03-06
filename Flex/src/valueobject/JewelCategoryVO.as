package valueobject
{
	import mx.collections.ArrayCollection;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.JewelCategoryVO")]
	public dynamic class JewelCategoryVO
	{
		public function JewelCategoryVO()
		{
		}
		
		public var jewelCategoryName:String;
		public var jewelTypeId:String;
		public var jewelTypeName:String;
		public var jewelCategoryId:String;
		public var jewelCategoryTypes:ArrayCollection; //JewelTypesVO
	}
}
