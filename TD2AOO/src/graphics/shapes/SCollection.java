package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;

public class SCollection extends Shape {

	public Iterator<Shape> iterator;
	public ArrayList<Shape> list;
	public Rectangle borders;

	public SCollection() {
		list = new ArrayList<Shape>();
	}

	public Iterator<Shape> iterator() {
		return list.iterator(); //J'ai pas trouve la fonction pour ca
	}

	public void add(Shape s) {
		list.add(s);
	}

	public Point getLoc() {
		// TODO Auto-generated method stub
		return borders.getLocation();
	}

	public void setLoc(Point p) {
		// TODO Auto-generated method stub
		borders.setLocation(p);
	}

	public void translate(int x, int y) {
		// TODO Auto-generated method stub
		borders.translate(x, y);
	}

	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return borders.getBounds();
	}

	public void accept(ShapeVisitor sv) {
		// TODO Auto-generated method stub
		sv.visitCollection(this);
	}

}
