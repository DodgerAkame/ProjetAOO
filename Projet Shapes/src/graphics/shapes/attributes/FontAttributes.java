package graphics.shapes.attributes;

import java.awt.*;
import java.awt.image.BufferedImage;

public class FontAttributes extends Attributes {

	public Font font;
	public Color fontColor;
	
	public static final String ID="font";
	
	//public static final Graphics2D DEFAULTS_GRAPHICS = (Graphics2D) new BufferedImage();
	
	public FontAttributes(){
		
	}

	public FontAttributes(Font font, Color fontColor){
		this.font=font;
		this.fontColor=fontColor;
	}
	
	public Rectangle getBounds(String id){
		return null;
	}
	
	public String getID(){
		return ID;
	}
	
}
