package graphics.shapes.attributes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class FontAttributes extends Attributes {

	public Font font;
	public Color fontColor;
	
	public static final String ID="font";
	private static final Font DEFAULT_FONT = new Font("Dialog",Font.PLAIN, 10);
	//public static final Graphics2D DEFAULTS_GRAPHICS = (Graphics2D) new BufferedImage();
	public Graphics2D g;
	
	public FontAttributes(){
		this.font=DEFAULT_FONT;
	}

	public FontAttributes(Font font, Color fontColor){
		this.font=font;
		this.fontColor=fontColor;
	}
	
	public Rectangle getBounds(String id){
		return this.font.getStringBounds(id,g.getFontRenderContext()).getBounds();
	}
	
	public String getID(){
		return ID;
	}
	
}
