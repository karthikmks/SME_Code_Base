package valueobject
{	
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.EmployeeVO")]
	public class EmployeeVO
	{
		public function EmployeeVO()
		{
		}
		public var employeeId:String;
		public var employeeName:String;
		public var gender:String;
		public var employeeAddress:String;
		public var qualification:String;
		public var branchId:String;
		public var contactNo:String;
		public var alternateContactNo:String;
		public var loginId:String;
		public var password:String;
		public var createdBy:String;
		public var modifiedBy:String;
		public var activeFlag:String;
		public var modifiedDate:String;
		public var createdDate:String;
		public var roleId:int;
		
	}
}