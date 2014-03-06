package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.EducationVO")]
	public class EducationVO
	{
		public function EducationVO()
		{
		}
		public var education:String;
		public var educationId:int;
	}
}