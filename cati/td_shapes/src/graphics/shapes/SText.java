package graphics.shapes;

import java.awt.*;

import graphics.shapes.attributes.FontAttributes;
import graphics.shapes.Shape;

public class SText extends Shape {

	private String text;
	private Point loc;

	public SText(Point loc, String text) {
		this.loc = loc;
		this.text = text;
	}

	// Le point est le coin en haut à gauche

	public Point getLoc() {
		return this.loc;
	}

	public String getText() {
		return this.text;
	}

	public void setLoc(Point loc) {
		this.loc = loc;
	}

	public void translate(int dx, int dy) {
		this.loc.translate(dx, dy);
	}

	// La limite de sélection est le rectangle qui contient toutes les lettres

	public Rectangle getBounds() {
		FontAttributes fa = new FontAttributes();
		Rectangle rect = new Rectangle();
		if (attributes.get(FontAttributes.ID) != null)
			rect = ((FontAttributes) attributes.get(FontAttributes.ID))
					.getBounds(text);
		rect.height = fa.getBounds(text).height;
		rect.width = fa.getBounds(text).width;
		rect.setLocation(loc.x, loc.y - fa.getBounds(text).height);
		return rect;
	}

	public void accept(ShapeVisitor v) {
		v.visitText(this);
	}

}
