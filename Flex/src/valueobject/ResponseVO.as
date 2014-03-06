package valueobject
{
	import mx.collections.ArrayCollection;
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.ResponseVO")]
	public class ResponseVO
	{
		public function ResponseVO()
		{
		}
		public var status:String;
		public var description:String;
		public var responseData:ArrayCollection;
	}
}
