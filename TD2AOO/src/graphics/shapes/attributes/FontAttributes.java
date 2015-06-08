package graphics.shapes.attributes;

import graphics.shapes.ui.ShapesView;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;

public class FontAttributes extends Attributes{
	
	private Font font=null;
	private Graphics g;

	public FontAttributes() {
		super("FontAttributes");
		font=Font.decode("arial");
	}
	
	public Rectangle getBounds(String s){
		return null;
	}

	public Font getFont() {
		return font;
	}

	public Graphics getG() {
		return g;
	}

	public void setG(Graphics g) {
		this.g = g;
	}

}
