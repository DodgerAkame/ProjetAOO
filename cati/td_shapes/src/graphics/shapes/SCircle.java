package graphics.shapes;

import java.awt.*;

public class SCircle extends Shape {

	private Point loc;
	private int radius;

	public SCircle(Point loc, int radius) {
		this.loc = loc;
		this.radius = radius;
	}

	// Le point est le centre du cercle

	public Point getLoc() {
		return this.loc;
	}

	public void setLoc(Point loc) {
		this.loc = loc;
	}

	public void translate(int dx, int dy) {
		this.loc.translate(dx, dy);
	}

	// La limite de sélection est le carré dans lequel s'inscrit le cercle

	public Rectangle getBounds() {
		return new Rectangle(loc.x, loc.y, 2 * radius, 2 * radius);
	}

	public void accept(ShapeVisitor v) {
		v.visitCircle(this);
	}

}
