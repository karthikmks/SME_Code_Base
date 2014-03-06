package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.SearchResponseVO")]
	public class SearchResponseVO
	{
		public function SearchResponseVO()
		{
		}
		public var searchRequestVO:SearchRequestVO;
		public var jewelLoanTransactionVO:JewelLoanTransactionVO; //JewelLoanTransactionVO
		public var depositLoanTransactionVO:DepositLoanTransactionVO; //DepositLoanTransactionVO
	}
}