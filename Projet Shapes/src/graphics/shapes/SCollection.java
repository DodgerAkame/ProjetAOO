package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SCollection extends Shape {

	private List<Shape> shapes = new ArrayList<Shape>();
	private Point loc = new Point(0,0);

	public SCollection(Shape s) {
		this.setLoc(s.getLoc());
		shapes.add(s);
	}
	
	public Iterator<Shape> iterator() {
		return shapes.iterator();
	}

	public SCollection() {
		shapes = new ArrayList<Shape>();
		loc = new Point(0, 0);
	}

	public void add(Shape s) {
		shapes.add(s);
	}

	public Point getLoc() {
		return loc;
	}

	public void setLoc(Point p) {
		loc = p;
		int dx=p.getLocation().x-this.getLoc().x;
		int dy=p.getLocation().y-this.getLoc().y;
		for (int i = 0; i<shapes.size();i++) {
			shapes.get(i).translate(dx, dy);
		}
	}

	public void translate(int x, int y) {
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).translate(x, y);
		}
	}

	public Rectangle getBounds() {
		Rectangle union = new Rectangle(shapes.get(0).getBounds());
		for (int i = 1; i < shapes.size(); i++) {
			union = union.union(shapes.get(i).getBounds());
		}
		return union;
	}
	
	public List<Shape> getShapes() {
		return shapes;
	}

	public void accept(ShapeVisitor sv) {
		sv.visitCollection(this);
	}

}
