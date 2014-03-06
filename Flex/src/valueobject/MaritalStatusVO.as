package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.MaritalStatusVO")]
	public class MaritalStatusVO
	{
		public function MaritalStatusVO()
		{
		}
		
		public var maritalStatus:String;
		public var maritalStatusId:int;
		
	}
}