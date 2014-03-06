package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.OccupationVO")]
	public class OccupationVO
	{
		public function OccupationVO()
		{
		}
		public var occupation:String;
		public var occupationId:int;
	}
}