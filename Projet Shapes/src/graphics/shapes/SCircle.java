package graphics.shapes;

import java.awt.*;

public class SCircle extends Shape {

	private int radius;
	private Point loc;

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int i) {
		this.radius = i;
	}

	public Point getLoc() {
		return this.loc;
	}

	public void setLoc(Point p) {
		this.loc = p;
	}

	public void translate(int x, int y) {
		this.loc.translate(x, y);
	}

	public void accept(ShapeVisitor sv) {

	}

	public Rectangle getBounds() {
		return new Rectangle(2*radius,2*radius);
	}
}
