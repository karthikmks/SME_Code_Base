package util
{
	import mx.collections.ArrayCollection;

	public class SMEConstants
	{
		public function SMEConstants()
		{
		}
		
		public static var APPLICATION_URL:String = "";
		public static const FACADE_STATRED:String = "FACADE_STATRED";
		public static const ON_SAVE_RESPONSE:String = "ON_SAVE_RESPONSE";
		public static const ON_LOAN_META_DATA:String = "ON_LOAN_META_DATA";
		public static const SELECTED_REQ_CUSTOMER_IMG:String = "SELECTED_REQ_CUSTOMER_IMG";
		public static const IMAGE_UPLOAD_TYPES:String = "*.gif;*.jpeg;*.jpg;*.png";
		public static const MSG_RESET_CONFIRM:String = "The entered data will be lost. \nAre you sure?";

		
		public static const ERRR_MSG_GROSS_WT:String = "Please Enter Valid Gross Weight";
		public static const ERRR_MSG_REDUCED_WT:String = "Please Enter Valid Reduced Weight";
		public static const ERRR_MSG_QUANTITY:String = "Please Enter Valid Quantity";
		public static const ERRR_MSG_AMOUNT:String = "Please Enter Valid Amount";
		public static const ERRR_MSG_DATE:String = "Please Select Valid Date";
		public static const ERRR_MSG_ALL_FILEDS:String = "Please Enter All Fileds";
		public static const ERRR_MSG_INVALID_NAME:String = "Please Enter Valid Name";
		public static const ERRR_MSG_INVALID_INITIAL:String = "Please Enter Valid Initial";
		public static const ERRR_MSG_INVALID_PINCODE:String = "Please Enter Valid Pincode";
		public static const ERRR_MSG_INVALID_PHONE_NO:String = "Please Enter Valid Phone Number";
		public static const ERRR_MSG_INVALID_PANCARD_NO:String = "Please Enter Valid Pancard Number";
		public static const ERRR_MSG_INVALID_EMAIL:String = "Please Enter Valid Email-Id";
		public static const ERRR_MSG_INVALID_CUST_ID:String = "Please Enter Valid Customer ID";
		public static const ERRR_MSG_INVALID_CUST_NAME_ID:String = "Please Enter Valid Customer ID or Name";
		
		public static const ERRR_MSG_UPLOAD_ID_PROOF:String = "Please Upload ID Proof";
		public static const ERRR_MSG_UPLOAD_ADDR_PROOF:String = "Please Upload Address Proof";
		public static const ERRR_MSG_UPLOAD_PANCARD:String = "Please Upload Pancard Proof";
		
		public static const ERRR_MSG_CUST_IMAGE:String = "Please Upload Customer Image";
		public static const ERRR_MSG_JEWEL_IMAGE:String = "Please Upload Jewel Image";
		public static const SERCH_WINDOW_OPEN:String = "OPEN";
		public static const SERCH_WINDOW_CLOSE:String = "CLOSE";
		public static const SEARCH_CUSTOMER:String = "SEARCH_CUSTOMER";
		public static const SEARCH_CUSTOMER_RESPONSE:String = "SEARCH_CUSTOMER_RESPONSE";
		public static const CUSTOMER_SELECTED:String = "CUSTOMER_SELECTED";
		public static const SAVE_NEW_JEWEL_LOAN:String = "SAVE_NEW_JEWEL_LOAN";
		public static const LOAD_NEW_LOAN_META_DATA:String = "LOAD_NEW_LOAN_META_DATA";
		public static const SAVE_NEW_CUSTOMER_INFO:String = "SAVE_NEW_CUSTOMER_INFO";
		public static const ON_SAVE_NEW_CUSTOMER_INFO:String = "ON_SAVE_NEW_CUSTOMER_INFO";
		public static const ON_UPDATE_FLOW_CUSTOMER_SEARCH:String = "ON_UPDATE_FLOW_CUSTOMER_SEARCH";
		public static const UPDATE_FLOW_CUSTOMER_SEARCH:String = "UPDATE_FLOW_CUSTOMER_SEARCH";
		public static const UPDATE_FLOW_CUSTOMER_SELECTED:String = "UPDATE_FLOW_CUSTOMER_SELECTED";
		
		public static const GET_NEW_LOAN_NUMBER:String = "GET_NEW_LOAN_NUMBER";
		public static const ON_GET_NEW_LOAN_NUMBER:String = "ON_GET_NEW_LOAN_NUMBER";
		public static const ON_APPLN_COMP_META_DATA:String = "ON_APPLN_COMP_META_DATA";
		public static const LOAD_APPLN_COMP_META_DATA:String = "LOAD_APPLN_COMP_META_DATA";
		public static const GET_NEXT_AVAILABLE_CUST_ID:String = "GET_NEXT_AVAILABLE_CUST_ID";
        public static const ON_GET_NEXT_AVAILABLE_CUST_ID:String = "ON_GET_NEXT_AVAILABLE_CUST_ID";
		public static const UPDATE_CUSTOMER_INFO:String = "UPDATE_CUSTOMER_INFO";
		public static const ON_UPDATE_CUSTOMER_INFO:String = "ON_UPDATE_CUSTOMER_INFO";
		public static const FLAG_Y:String = "Y";
		public static const FLAG_N:String = "N";
		public static const SAVE_BRANCH_ENTITLEMENTS:String = "SAVE_BRANCH_ENTITLEMENTS";
		public static const ON_SAVE_BRANCH_ENTITLEMENTS:String = "ON_SAVE_BRANCH_ENTITLEMENTS";
		
		public static const DOC_SERVICE_TAX_CHARGES_ID:String = "ALNCHG";
		public static const ADD_LOAN_TYPE_COMP_ID:String = "ALLNTP";
		
		public static const LINKED_OR_REFERRAL_CUSTOMER_SEARCH:String = "LINKED_OR_REFERRAL_CUSTOMER_SEARCH";
        public static const ON_LINKED_OR_REFERRAL_CUSTOMER_SEARCH:String = "ON_LINKED_OR_REFERRAL_CUSTOMER_SEARCH";
		public static const LABEL_NOT_AVAILABLE:String = "N/A";
		 
		public static const SEARCH_LOAN:String = "SEARCH_LOAN";
        public static const ON_SEARCH_LOAN:String = "ON_SEARCH_LOAN";
		public static const STATUS_OK:String = "STATUS_OK";
		public static const VALIDATE_USER_PROFILE:String = "VALIDATE_USER_PROFILE";
		public static const ON_VALIDATE_USER_PROFILE:String = "ON_VALIDATE_USER_PROFILE";
		
		public static const USER_ROLE_ADMIN:String = "Admin";
		public static const SEARCH_FLOW_CUSTOMER_SEARCH:String = "SEARCH_FLOW_CUSTOMER_SEARCH";
		public static const ON_SEARCH_FLOW_CUSTOMER_SEARCH:String = "ON_SEARCH_FLOW_CUSTOMER_SEARCH";
		
		public static const LOAN_STATUS_ARRAY:ArrayCollection = new ArrayCollection([          
            { loanStatusId:"1",loanStatus:"Active" },
            { loanStatusId:"2",loanStatus:"Release" }
        ]);
       
        public static const TENURE_MONTHS:ArrayCollection = new ArrayCollection([           
            { monthId:"1"},
            { monthId:"2"},
            { monthId:"3"},
            { monthId:"4"},
            { monthId:"5"},
            { monthId:"6"},
            { monthId:"7"},
            { monthId:"8"},
            { monthId:"9"},
            { monthId:"10"},
            { monthId:"11"},
            { monthId:"12"}
        ]);
		
		public static const TENURE_MONTHS_COLLECTION:ArrayCollection = new ArrayCollection([			
			{ label:"1",value:"1"},
			{ label:"2",value:"2"},
			{ label:"3",value:"3"},
			{ label:"4",value:"4"},
			{ label:"5",value:"5"},
			{ label:"6",value:"6"},
			{ label:"7",value:"7"},
			{ label:"8",value:"8"},
			{ label:"9",value:"9"},
			{ label:"10",value:"10"},
			{ label:"11",value:"11"},
			{ label:"12",value:"12"}
		]);
		[Bindable]
		public static var BRANCH_LIST:ArrayCollection = new ArrayCollection([			
			{ branchId:"0",branchName:"All",isSelected:"true"},
			{ branchId:"1",branchName:"Branch 1",isSelected:"false"},
			{ branchId:"2",branchName:"Branch 2",isSelected:"false"},
			{ branchId:"3",branchName:"Branch 3",isSelected:"false"},
			{ branchId:"4",branchName:"Branch 4",isSelected:"false"},
			{ branchId:"5",branchName:"Branch 5",isSelected:"false"},
			{ branchId:"6",branchName:"Branch 6",isSelected:"false"},
			{ branchId:"7",branchName:"Branch 7",isSelected:"false"}
		]);
		
		public static const DAYS_ROI_INTEREST:ArrayCollection = new ArrayCollection([			
			{ days:"0-30",roi:"1.5%",interest:"150" },
			{ days:"31-90",roi:"2.5%",interest:"200" },
			{ days:"91-180",roi:"3.5%",interest:"250" },
			{ days:"181-365",roi:"4.5%",interest:"300" }
		]);
		public static const CUSTOMER_SEARCH_ARRAY:ArrayCollection = new ArrayCollection([			
			{ label:"Customer ID",value:"customerId" },
			{ label:"Customer Name",value:"customerName" }
		]);

	}
}