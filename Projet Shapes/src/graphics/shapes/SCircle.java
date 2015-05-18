package graphics.shapes;

import java.awt.*;

public class SCircle extends Shape {

	private int radius;
	private Point loc;

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int i) {
		this.radius = this.radius + i;
	}

	public Point getLoc() {
		return this.loc;
	}

	public void setLoc(Point p) {
		this.loc = p;
	}

	public void translate(int x, int y) {

	}

	public void accept(ShapeVisitor sv) {

	}

	public Rectangle getBounds() {

		return null;
	}
}
