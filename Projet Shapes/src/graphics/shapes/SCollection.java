package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;

public class SCollection extends Shape {

	public Iterator iterator;
	public ArrayList<Shape> liste;
	public Rectangle borders;

	public SCollection() {
		liste = new ArrayList<Shape>();
	}

	public Iterator iterator() {
		return null; //J'ai pas trouve la fonction pour ca
	}

	public void add(Shape s) {
		liste.add(s);
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
