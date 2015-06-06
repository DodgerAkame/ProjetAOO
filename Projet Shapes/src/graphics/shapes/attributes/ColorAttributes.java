package graphics.shapes.attributes;

import java.awt.Color; //Pour les booleens de couleurs

public class ColorAttributes extends Attributes {

	public boolean fixed;
	public boolean stroked;
	public Color filledColor;
	public Color strokedColor;

	public static final String ID="color";
	public static final Color BLACK = null;
	
	public ColorAttributes(){ //Par defaut
		
	}
	
	public ColorAttributes(boolean fixed, boolean stroked, Color filledColor, Color strokedColor){ //Value
		this.fixed=fixed;
		this.stroked=stroked;
		this.filledColor=filledColor;
		this.strokedColor=strokedColor;
	}
	
	public String getID(){
		return ID;
	}

	
}
