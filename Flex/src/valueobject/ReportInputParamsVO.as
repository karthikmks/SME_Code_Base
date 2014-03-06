package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.ReportInputParamsVO")]
	public class ReportInputParamsVO
	{
					public function ReportInputParamsVO()
					{
					}
					public var loanIndicator:String;
					public var fromDate:String;
					public var toDate:String;
					public var reportType:String;
					
	}
}
