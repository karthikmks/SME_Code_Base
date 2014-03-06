package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.AddressVO")]
	public class AddressVO
	{
		public function AddressVO()
		{
		}
		public var address:String;
		public var doorNo:String;
		public var street:String;
		public var road:String;
		public var area:String;
		public var village:String;
		public var town:String;
		public var taluka:String;
		public var district:String;
		public var pincode:int;
		public var distanceFromBranch:Number;
	}
}