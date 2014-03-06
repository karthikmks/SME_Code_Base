package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.GenderVO")]
	public class GenderVO
	{
		public function GenderVO()
		{
		}
		public var gender:String;
		public var genderId:int;
	}
}