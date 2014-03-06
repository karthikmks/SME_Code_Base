package components 
{
	import flash.display.Sprite;
	
	import mx.containers.Box;
	import mx.controls.ProgressBar;
	import mx.core.Application;
	import mx.managers.PopUpManager;
	
	public class LoadingMask extends Box
	{
		
		private static var _mask:LoadingMask;
		
		private var _message:String;
		
		private static var popupCount:int = 0;
		
		public function LoadingMask()
		{
			super();
		}
		
		public static function getInstance():LoadingMask {
			if(_mask==null){
				_mask = new LoadingMask();
			}
			return _mask;
		}
		
		public static function show(message:String=null, parent:Sprite=null):LoadingMask{
			_mask = getInstance();
			_mask._message = message;
			PopUpManager.addPopUp(_mask, parent||Sprite(Application.application), true);
			PopUpManager.centerPopUp(_mask);
			return _mask;   
		}
		
		
		public static function hide(loadingReference:LoadingMask=null):void {
			if(loadingReference!=null){
				PopUpManager.removePopUp(loadingReference);
			}else{
				PopUpManager.removePopUp(_mask);
			}
		}

		
		override protected function createChildren():void
		{
			super.createChildren();
			
			var pb:ProgressBar = new ProgressBar();
			pb.label = _message||"Loading Data. Please wait...";
			pb.indeterminate = true;
			pb.labelPlacement= 'center';
			//pb.setStyle('barColor', uint(0xAEAEAE));
			pb.setStyle('barColor', uint(0x999966));
			pb.height = 26;
			
			addChild(pb);				
		}
	}
}