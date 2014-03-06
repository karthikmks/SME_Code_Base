package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.BasicSearchVO")]
	public class BasicSearchVO
	{ 
		public function BasicSearchVO()
		{
		}
		
		public  var loanDateFrom:String;
		public  var loanDateTo:String;
		public  var loanAmountFrom:String;
		public  var loanAmountTo:String;
		public  var loanTypeIds:String;
		public  var loanTenureMonths:String;
		public  var loanSchemeIds:String;
		public  var loanModeIds:String;
		public  var loanStatusIds:String;
		public  var releaseTypeIds:String;
		public  var repaymentTypeIds:String;
		public  var allBranchIds:String;
		public  var branchId:String;
		
	}
}