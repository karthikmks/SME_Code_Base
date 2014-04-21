package valueobject
{
	import mx.collections.ArrayCollection;

	[Bindable]
	[RemoteClass(alias="com.bfp.valueobjects.ManageDocumentsVO")]
	public class ManageDocumentsVO
	{
		public function ManageDocumentsVO()
		{
		}
		public var manageDocumentsId:int;
		public var typeId:int;
		public var categoryId:int;
		public var subCategoryId:int;
		public var createdBy:String;
		public var createdTimestamp:String;
		public var modifiedBy:String;
		public var modifiedTimestamp:String;
		public var activeFlag:String;
		public var branchId:String;
		public var keyField:String;
		public var auditStatus:String;
		public var branchDocComment:String;
		public var auditorDocComment:String;
		public var auditedBy:String;
		public var auditedTimestamp:String;
		public var isAuditorLogin:Boolean;
		public var logedInUser:String;
		
		public var manageDocCompDetailList:ArrayCollection; //ManageDocCompDtlVO
		public var fileList:ArrayCollection;
	}
}