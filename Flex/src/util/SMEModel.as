package util
{
	import components.ManageBranch;
	import components.ManageCustomer;
	import components.ManageEntitlementToBranch;
	
	import valueobject.AppConfigurationVO;
	import valueobject.ApplicationComponentsDataVO;
	import valueobject.BranchDetailsVO;
	import valueobject.UserProfileVO;
	
	public class SMEModel
	{
		public function SMEModel()
		{
		}
		private static var  _instance:SMEModel;

		public static function getinstance():SMEModel
		{
			if(_instance == null){
				_instance = new SMEModel();
			}
			return _instance;
		}
		
		[Bindable]
		public var isAdminUser:Boolean = true;
		[Bindable]
		public var appCompMetaData:ApplicationComponentsDataVO = new ApplicationComponentsDataVO();
		[Bindable]
		public var appConfigData:AppConfigurationVO;
		
		public var manageBranch:ManageBranch;
		public var branchDetails:BranchDetailsVO;
		public var manageCustomer:ManageCustomer;
		public var manageEntitlments:ManageEntitlementToBranch;
		
		private var _userProfileVO:UserProfileVO;
       
        public function get userProfileVO():UserProfileVO
        {
            return _userProfileVO;
        }
       
        public function set userProfileVO(value:UserProfileVO):void
        {
            _userProfileVO = value;
            if(_userProfileVO!=null){
                if(_userProfileVO.role == SMEConstants.USER_ROLE_ADMIN)
                    isAdminUser = true;
                else
                    isAdminUser = false;
            }
        }
	}
}