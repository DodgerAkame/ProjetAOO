package graphics.shapes.attributes;

import java.awt.Color;

public class ColorAttributes extends Attributes{

	public boolean filled=false;
	public boolean stroked=false;
	public Color filledColor=null;
	public Color strokedColor=null;
	
	public ColorAttributes(boolean filled,boolean stroked,Color filledColor,Color strokedColor) {
		super("ColorAttributes");
		this.filled=filled;
		this.stroked=stroked;
		this.filledColor=filledColor;
		this.strokedColor=strokedColor;
	}

	public boolean isFilled() {
		return filled;
	}

	public boolean isStroked() {
		return stroked;
	}

	public Color getFilledColor() {
		return filledColor;
	}

	public Color getStrokedColor() {
		return strokedColor;
	}
	

}
