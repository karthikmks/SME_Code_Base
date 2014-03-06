package valueobject
{
	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.ReportMetadata")]
	public class ReportMetadata
	{
		public function ReportMetadata()
		{
		}
		
		public var reportTypeId:int;
		public var reportName:String;
		public var fieldId:int;
		public var fieldName:String;
	}
}