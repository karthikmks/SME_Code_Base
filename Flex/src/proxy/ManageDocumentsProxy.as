package proxy
{
	import components.LoadingMask;

	public class ManageDocumentsProxy extends BaseProxy
	{
		public static const PROXY_NAME:String = "ManageDocumentsProxy";
		
	
		public function ManageDocumentsProxy()
		{
			super(PROXY_NAME);
		}
		private static var popCounter:int=0;
		
		private static function showLoadingMask():void {
			if(popCounter<1){
				LoadingMask.show();
			}
			popCounter++;	
		}
		
		private static function closeLoadingMask():void {
			if(popCounter >0)
				popCounter--;
			if(popCounter==0){
				LoadingMask.hide();
			}	
			trace("popCounter"+popCounter)
		}

	}
}