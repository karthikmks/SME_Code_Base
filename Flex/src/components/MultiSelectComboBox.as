/**
 * @author Karthik M
 * **/
package components
{
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.collections.IList;
	import mx.core.ClassFactory;
	import mx.events.ItemClickEvent;
	
	import spark.components.CheckBox;
	import spark.components.DropDownList;
	import spark.components.Label;
	import spark.events.DropDownEvent;
	
	[Event(name="addItem", type="flash.events.Event")]
	[Event(name="removeItem", type="flash.events.Event")]
	[Event(name="selectAll", type="flash.events.Event")]
	[Event(name="deSelectAll", type="flash.events.Event")]
	
	public class MultiSelectComboBox extends DropDownList {
		public var itemAllValue:String="All";
		public var itemAllPosition:int = 0;
		public var labelFieldMultiple:String = "Multiple";
		[Bindable]
		private var customLabelField:String = "value"; 
		
		private var actualIndex:int;
		private var _selectedItems:Vector.<Object>;
		
		[Bindable("change")]
		[Bindable("valueCommit")]
		[Bindable("collectionChange")]
		override public function set selectedItems(value:Vector.<Object>):void {
			_selectedItems=value;
		}
		
		override public function get selectedItems():Vector.<Object> {
			return _selectedItems;
		}
		
		override public function set labelField(value:String):void{
			customLabelField = value;
			super.labelField = value;
		}
		
		public function MultiSelectComboBox() {
			super();
			var render:ClassFactory = new ClassFactory(MultiSelectComboBoxItemRenderer);
			super.itemRenderer = render;
			addEventListener(DropDownEvent.CLOSE, onDropDown);
			addEventListener(ItemClickEvent.ITEM_CLICK, onItemClick);
		}
		
		override public function set dataProvider(value:IList):void {
			super.dataProvider = value; 
			//Label(labelDisplay).setStyle("styleName","smeDropDownListSkin");
			// Load initial selected items
			selectedItems = new Vector.<Object>;
			/*for (var i:int;i<dataProvider.length;i++) {
				if (dataProvider[i].assigned==true) {
					selectedItems.push(dataProvider[i]);
				}
				if (dataProvider[i].value == itemAllValue) {
					itemAllPosition=i;
				}
			}*/
			var selectAll:Object = new Object;
			selectAll['label'] = "All";
			selectAll[customLabelField] = "All";
			selectAll['assigned'] = true;
			(dataProvider as ArrayCollection).addItemAt(selectAll,0);
			for (var i:int;i<dataProvider.length;i++) {
				dataProvider[i].assigned=true;
				dataProvider[i]['label'] = dataProvider[i][customLabelField];
				selectedItems.push(dataProvider[i]);
			}
		}
		
		override protected function commitProperties():void {
			super.commitProperties();
			var render:ClassFactory = new ClassFactory(MultiSelectComboBoxItemRenderer);
			super.itemRenderer = render;
			setText();
		}
		
		override protected function item_mouseDownHandler(event:MouseEvent):void {
			if (event.target is MultiSelectComboBoxItemRenderer) {
				var render:MultiSelectComboBoxItemRenderer = event.target as MultiSelectComboBoxItemRenderer;
				var check:CheckBox = render.item as CheckBox;
				if (check.selected) {
					render.data.assigned = false;
					check.selected = false;
				} else {
					render.data.assigned = true;
					check.selected = true;
				}
				onCheck(render.data);
			}
		}
		
		private function onItemClick(event:ItemClickEvent):void {
			onCheck(event.item);
		}
		
		private function onDropDown(event:DropDownEvent):void {
			selectedIndex=-1;
			setText();
		}
		
		private function onCheck(obj:Object):void {
			trace ("check");
			if (selectedItems == null || selectedItems.indexOf(obj) == -1) {
				if (selectedItems == null) {
					selectedItems = new Vector.<Object>();
				}
				selectedItems.push(obj);
				if (obj[customLabelField] == itemAllValue) {
					dispatchEvent(new Event("selectAll"));  
					selectAllCheckBox(true);
				} else {
					if (selectedItems.length == dataProvider.length - 1) {
						selectAllItem (true);
					}
				}
				dispatchEvent(new Event("addItem"));
			} else {
				var index:int=selectedItems.indexOf(obj);
				selectedItems.splice(index,1);
				if (obj[customLabelField] == itemAllValue) {
					dispatchEvent(new Event("deSelectAll"));    
					selectAllCheckBox(false);
				} else {
					if (selectedItems.length == dataProvider.length - 1) {
						selectAllItem (false);
					}
				}
				dispatchEvent(new Event("removeItem"));
			}
			setText();
			
			dispatchEvent(new Event("valueCommit"));
		}
		
		private function setText():void {
			if (selectedItems != null && selectedItems.length > 0) {
				if (selectedItems.length == dataProvider.length) {
					labelDisplay.text=itemAllValue;
				}else if (selectedItems.length>1) {
					labelDisplay.text=labelFieldMultiple;
				} else {
					labelDisplay.text=selectedItems[0].label;
				}
			} else {
				labelDisplay.text=prompt;
			}
		}
		
		private function selectAllCheckBox (value:Boolean):void {
			trace ("select all");
			selectedItems = new Vector.<Object>();
			for each (var obj:Object in dataProvider) {
				obj.assigned = value;
				if (value == true) {
					selectedItems.push(obj);
				}
			}
			invalidateProperties();
		}
		
		private function selectAllItem (value:Boolean):void {
			var item:Object = dataProvider.getItemAt(itemAllPosition);
			item.assigned=value;
			if (value) {
				selectedItems.push(item);
			} else {
				var index:int=selectedItems.indexOf(item);
				selectedItems.splice(index,1);
			}
			invalidateProperties();
		}
	}
}