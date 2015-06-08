package graphics.shapes.attributes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;

public class FontAttributes extends Attributes {

	// Public et Static car ces paramètres sont ceux par défaut et doivent être
	// accessibles aux autres classes

	public static final String ID = "font";
	public static final Graphics2D DEFAULT_GRAPHICS = (Graphics2D) new BufferedImage(
			1, 1, BufferedImage.TYPE_INT_ARGB).getGraphics();
	public Font font;
	public Color fontColor;
	private Graphics2D g = null;

	public FontAttributes() {
		this.font = new Font("Dialog", Font.PLAIN, 11);
		this.fontColor = Color.BLACK;
	}

	public FontAttributes(Font font, Color fontColor) {
		this.font = font;
		this.fontColor = fontColor;
	}

	public Graphics2D getGraphics() {
		return g;
	}

	public void setGraphics(Graphics2D g) {
		this.g = g;
	}

	// La taille du rectangle de délimitation dépends de la police chosie, d'où
	// l'appel à FontRenderContext

	public Rectangle getBounds(String s) {
		FontRenderContext frc = DEFAULT_GRAPHICS.getFontRenderContext();
		return font.getStringBounds(s, frc).getBounds();
	}

	public String getId() {
		return ID;
	}

}
