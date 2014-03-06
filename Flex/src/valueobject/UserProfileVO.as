package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.UserProfileVO")]
	public class UserProfileVO
	{
		public function UserProfileVO()
		{
		}
		
		public var userId:String;
		public var password:String;
		public var role:String;
		public var employeeId:int;
		public var employeeName:String;
		public var address:String;
		public var contactNo:String;
		public var alternateContactNo:String;
		public var qualification:String;
		public var branchId:String;
		public var roleId:int;		
	}
}