package graphics.shapes;

import java.awt.*;

public class SRectangle extends Shape {

	private Rectangle rect;

	public SRectangle(Point loc, int width, int height) {
		rect = new Rectangle(loc.x, loc.y, width, height);
	}

	public Rectangle getRect() {
		return this.rect;
	}

	// Le point est le coin en haut à gauche du rectangle

	public Point getLoc() {
		return this.rect.getLocation();
	}

	public void setLoc(Point p) {
		this.rect.setLocation(rect.x, rect.y);
	}

	public void translate(int dx, int dy) {
		this.rect.translate(dx, dy);
	}

	// La limite de sélection est le même que le rectangle dessiné

	public Rectangle getBounds() {
		return rect.getBounds();
	}

	public void accept(ShapeVisitor s) {
		s.visitRectangle(this);
	}

}
