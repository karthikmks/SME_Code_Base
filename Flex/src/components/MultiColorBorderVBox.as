package components
{
	import flash.display.Graphics;
	
	import mx.containers.HBox;
	import mx.containers.VBox;
	/**
	 * NOV2013_E698842_C09112013
	 * use this class where you want multi border layout
	 * **/
	public class MultiColorBorderVBox extends VBox
	{
		// You could add getters/setters or constructor parameters to be able to change these values.
		public var topColor:uint   = 0xFFFFFF;
		public var rightColor:uint = 0xCBB17E;
		public var bottomColor:uint = 0xCBB17E;
		public var leftColor:uint = 0xCBB17E;
		public var borderWidth:Number = 1;
		
		
		public function MultiColorBorderVBox()
		{
			super();
		}
		
		override protected function updateDisplayList(unscaledWidth:Number, unscaledHeight:Number):void
		{
			super.updateDisplayList(unscaledWidth, unscaledHeight);
			// This just ensures you dont have content under your border
			this.setStyle("paddingLeft", borderWidth);
			this.setStyle("paddingRight", borderWidth);
			this.setStyle("paddingTop", borderWidth);
			this.setStyle("paddingBottom", borderWidth);
			
			var g:Graphics = this.graphics;  // This creates a new Graphics object and sets it to the MultiColorBorderBox graphics object.  Since Box (superclass) descends from a Sprite object, it has a graphics object automatically.
			
			g.clear();
			g.moveTo(0,0);  // Moves the position to the top left corner
			g.lineStyle(borderWidth, topColor); // Sets the line style with the width and color
			g.lineTo(unscaledWidth, 10); // Draws the top border from top left to top right corners
			g.lineStyle(borderWidth, rightColor); // Changes the line style
			g.lineTo(unscaledWidth, unscaledHeight); // Draws the line from top right to bottom right
			g.lineStyle(borderWidth, bottomColor); //Changes the bottom border style
			g.lineTo(0, unscaledHeight); // Draws the line from bottom right to bottom left
			g.lineStyle(borderWidth, leftColor); // Changes the border color
			g.lineTo(0,10); // Closes the box by drawing from bottom left to top left            
			
		}
	}
}