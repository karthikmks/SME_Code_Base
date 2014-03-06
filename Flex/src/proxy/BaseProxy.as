package proxy
{
	import flash.events.Event;
	import flash.utils.Dictionary;
	
	import mx.messaging.ChannelSet;
	import mx.messaging.channels.AMFChannel;
	import mx.messaging.channels.SecureAMFChannel;
	import mx.rpc.AbstractOperation;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;
	import mx.rpc.http.mxml.HTTPService;
	import mx.rpc.remoting.mxml.RemoteObject;
	
	import org.puremvc.as3.multicore.patterns.proxy.Proxy;
	
	import util.SMEConstants;
	
	public class BaseProxy extends Proxy 
	{
		private static var __static:* = __static_initialize();
		
		private static function __static_initialize():*
		{
			var Channel:Object = null;
			channelSet = new ChannelSet;
			
			var source:String = SMEConstants.APPLICATION_URL;
			source += "spring/messagebroker/amf";
			
			if(source.indexOf("https") == 0)
			{
				source += "secure";
				Channel = SecureAMFChannel;
			}
			else
			{ 						
				Channel = AMFChannel;
			}
			
			channelSet.addChannel(new Channel("sme",source));
		}
		
		private static var channelSet:ChannelSet;		
		protected var rpcObject:RemoteObject;
		protected var __servicesInProgress:Dictionary = new Dictionary(true);
		
		public function BaseProxy(name:String)
		{
			super(name);
			rpcObject = new RemoteObject(destination);
			rpcObject.showBusyCursor = false;
			rpcObject.channelSet = channelSet;
		}
		
		protected function get destination():String
		{
			return "smeDestination";	
		}
		
		protected function createXMLRequest(url:String, handler:Function):HTTPService
		{
			var service:HTTPService = new HTTPService;
			service.showBusyCursor = false;
			service.resultFormat = "e4x";
			service.url = SMEConstants.APPLICATION_URL + url;			
			trace("SMEConstants.APPLICATION_URL + url: "+ SMEConstants.APPLICATION_URL + url);
			service.addEventListener(ResultEvent.RESULT,handler,false,0,true);
			service.addEventListener(FaultEvent.FAULT,handler,false,0,true);
			
			service.addEventListener(ResultEvent.RESULT,responseHandler,false,0,true);
			service.addEventListener(FaultEvent.FAULT,responseHandler,false,0,true);			
			
			__servicesInProgress[service] = true;
			
			return service;
		}
		
		protected function createRPCRequest(method:String, handler:Function, concurrency:String = "multiple"):AbstractOperation
		{
			var service:AbstractOperation = null;
			try {
				rpcObject.concurrency = concurrency;
				service = rpcObject.getOperation(method);
				
				service.addEventListener(ResultEvent.RESULT,handler,false,0,true);
				service.addEventListener(FaultEvent.FAULT,handler,false,0,true);
				
				service.addEventListener(ResultEvent.RESULT,responseHandler,false,0,true);
				service.addEventListener(FaultEvent.FAULT,responseHandler,false,0,true);
				
				__servicesInProgress[service] = true;
			}catch(e:Error) {
				trace("Error in base proxy createRPCRequest: "+e);
			}
			return service;
		}
		
		protected function responseHandler(e:Event):void {
			delete __servicesInProgress[e.target];
		}
		
		public function cancelAllRequests():void
		{			
			for(var service:Object in __servicesInProgress)
			{				
				service.cancel();
				delete __servicesInProgress[service];
			}
		}
		
	}
}