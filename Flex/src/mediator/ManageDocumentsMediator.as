package mediator
{
	import components.ManageDocuments;
	
	import org.puremvc.as3.multicore.interfaces.IMediator;
	import org.puremvc.as3.multicore.interfaces.INotification;
	import org.puremvc.as3.multicore.patterns.mediator.Mediator;
	
	import proxy.ManageDocumentsProxy;
	
	import util.SMEModel;

	public class ManageDocumentsMediator extends Mediator implements IMediator
	{
		public static const MEDIATOR_NAME:String = "ManageDocumentsMediator";
		
		private var _proxy:ManageDocumentsProxy;
		
		public function get proxy():ManageDocumentsProxy{
			return _proxy;
		}
		
		public function set proxy(value:ManageDocumentsProxy):void{
			_proxy = value;
		}
		
		public function get model():SMEModel{
			return SMEModel.getinstance();
		}
		
		public function ManageDocumentsMediator(viewComponent:ManageDocuments){
			super(MEDIATOR_NAME, viewComponent);
		}
		
		override public function onRegister():void{
			super.onRegister();
		}
		
		override public function listNotificationInterests():Array{
			return [	
				//SMEConstants.FACADE_STATRED,
				
			]
		}
		
		override public function handleNotification(notification:INotification):void{
			
		}
	
	}
}