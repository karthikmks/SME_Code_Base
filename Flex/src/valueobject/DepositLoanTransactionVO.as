package valueobject
{
	import mx.collections.ArrayCollection;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.DepositLoanTransactionVO")]
	public class DepositLoanTransactionVO
	{
		public function DepositLoanTransactionVO()
		{
		}
		public var deposit_loan_no:int;
		public var deposit_place_id:int;
		public var acct_holder_name_id:int;
		public var total_count:int;
		public var jewelLoanNo:int;
		public var interestPeriodId:int;
		public var transactionTypeId:int;
		public var loanNo:int;
		
		public var deposit_loan_transaction_date:String;
		public var loanTenure:String;
		public var rate_per_gram:String;
		public var loan_amount:String;  
		public var interest_rate:String;
		public var other_fee:String;
		public var total_gross_weight:String;
		public var total_reduced_weight:String;
		public var total_net_weight:String;
		public var remarks:String;
		public var created_by:String;
		public var created_timestamp:String;
		public var modified_by:String;
		public var modified_timestamp:String;
		public var active_flag:String;
		public var penaltyInterest:String;

		public var loanAssetSplitUp:ArrayCollection; //LoanAssestSplitUpVO
		public var paymentTransactions:ArrayCollection; //PaymentTransactionVO
		
		public var isThisNewLoan:String;
		public var isThisJointLoan:String;
		public var isThisLedgerLoan:String;
		
		public var depositPlace:String;
		public var acctHolderName:String;
		public var interestPeriod:String;
		public var authorized:String;
	}
}