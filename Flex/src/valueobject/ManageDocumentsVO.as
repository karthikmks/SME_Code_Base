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
		
		public var manageDocCompDetailList:ArrayCollection; //ManageDocCompDtlVO
		public var fileList:ArrayCollection;
	}
}