package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.NationalityVO")]
	public class NationalityVO
	{
		public function NationalityVO()
		{
		}
		public var nationality:String;
		public var nationalityId:int;
		
	}
}