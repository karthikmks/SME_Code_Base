package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.SearchRequestVO")]
	public class SearchRequestVO
	{
		public function SearchRequestVO()
		{
		}
		public var transactionDate:String;
		public var transactionTypeId:int;
		public var loanNo:int;
		public var releaseTypeId:int;
	}
}