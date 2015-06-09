package graphics.shapes.attributes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;

public class FontAttributes extends Attributes {

	public Font font;
	public Color fontColor;
	
	public static final String ID="font";
	//private static final Font DEFAULT_FONT = new Font("Dialog",Font.PLAIN, 10);
	public static final Graphics2D DEFAULTS_GRAPHICS = (Graphics2D) new 
			BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB).getGraphics();
	public Graphics2D g=null;
	
	public FontAttributes(){
		this.font=new Font("Dialog",Font.PLAIN,11);
		this.fontColor=Color.BLACK;
	}

	public FontAttributes(Font font, Color fontColor){
		this.font=font;
		this.fontColor=fontColor;
	}
	
	public Rectangle getBounds(String id){
		FontRenderContext frc = DEFAULTS_GRAPHICS.getFontRenderContext();
		return font.getStringBounds(id, frc).getBounds();
	}
	
	public String getID(){
		return ID;
	}
	
	public Graphics2D getGraphics() {
		return g;
	}
	
	public void setGraphics(Graphics2D g) {
		this.g=g;
	}
}
