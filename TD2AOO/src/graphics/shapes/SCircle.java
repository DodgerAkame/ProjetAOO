package graphics.shapes;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class SCircle extends Shape{
	
	private Point loc=null;
	private int radius=0;
	
	public SCircle(Point loc,int radius){
		super();
		this.loc=loc;
		this.radius=radius;
	}

	public void accept(ShapeVisitor sv) {
		sv.visitCircle(this);
	}

	public Rectangle getBounds() {
		return new Rectangle(new Point(loc.x,loc.y),new Dimension(radius,radius));
	}

	public Point getLoc() {
		return loc;
	}

	public void setLoc(Point p) {
		loc.setLocation(p);
	}

	public void translate(int xt, int yt) {
		loc.translate(xt, yt);
	}
	
	public int getRadius(){
		return this.radius;
	}

}
