package valueobject
{
	import flash.utils.ByteArray;
	
	import mx.collections.ArrayCollection;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.JewelLoanTransactionVO")]
	public class JewelLoanTransactionVO
	{
		public function JewelLoanTransactionVO()
		{
		}
		
		
		public var jewelTakeOverFromPlace:String;
		public var jewelScheme:String;
		public var jewel_loan_transaction_date:String;
		public var total_gross_weight:String;
		public var interest_rate:String; 
		public var total_reduced_weight:String;
		public var total_net_weight:String;
		public var remarks:String;
		public var created_by:String;
		public var created_timestamp:String;
		public var modified_by:String;
		public var modified_timestamp:String;
		public var active_flag:String;
		public var ledgerLoan:String;
		public var customerPhotoPath:String;
		public var jewelPhotoPath:String;
		
		public var loan_amount:String;
		public var document_charges:String;
		public var service_charges:String;
		public var serviceTax:String;
		
		public var customerDetails:CustomerVO;
		public var loanAssetSplitUp:ArrayCollection; //LoanAssestSplitUpVO
		public var isThisNewLoan:Boolean;
		public var paymentTransactions:ArrayCollection; //PaymentTransactionVO
		public var customerPhoto:ByteArray;
		public var jewelPhoto:ByteArray;
		
		
		public var jewelLoanNo:int;
		public var jewel_take_over_from_id:int;
		public var jewel_scheme_id:int;
		public var jewelLoanType:int;
		public var averageRatePerGram:Number;
		public var total_count:int;
		
	
		public var customerId:int;
		public var transactionTypeId:int;
		public var rateOfInterestId:int;
		public var jewelLoanModeId:int;
		public var repaymentTypeId:int;
		public var branchId:int;
		public var jewelTakeOverFromPlaceId:int;
		public var loanTenure:int;
		
		public var instaLoanNo:int;
		public var instaLoanAmount:Number;
		public var highLimitKey:int;
		
		
		
		
	}
}