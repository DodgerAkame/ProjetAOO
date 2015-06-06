package graphics.shapes.attributes;

import java.awt.Color; //Pour les booleens de couleurs

public class ColorAttributes extends Attributes {

	public boolean filled;
	public boolean stroked;
	public Color filledColor;
	public Color strokedColor;

	public static final String ID = "color";
	public final Color BLACK = null;

	public ColorAttributes() { // Par defaut

	}

	public ColorAttributes(boolean filled, boolean stroked, Color filledColor,
			Color strokedColor) { // Value
		this.filled = filled;
		this.stroked = stroked;
		this.filledColor = filledColor;
		this.strokedColor = strokedColor;
	}

	public String getID() {
		return ID;
	}

	public boolean getFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public boolean getStroked() {
		return stroked;
	}

	public void setStroked(boolean stroked) {
		this.stroked = stroked;
	}

	public Color getFilledColor() {
		return filledColor;
	}

	public void setFilledColor(Color filledColor) {
		this.filledColor = filledColor;
	}

	public Color getStrokedColor() {
		return strokedColor;
	}

	public void setStrokedColor(Color strokedColor) {
		this.strokedColor = strokedColor;
	}

}
