package graphics.shapes;

import graphics.shapes.attributes.*;

import java.awt.*;
import java.util.*;

public abstract class Shape {

	private HashMap<String, Attributes> attributes;

	public Shape() {
		attributes = new HashMap<String, Attributes>();
	}

	public void addAttributes(Attributes a) {
		attributes.put(a.getID(), a);

	}

	public Attributes getAttributes(String s) {
		return (Attributes) attributes.get(s);
	}

	public abstract Point getLoc();

	public abstract void setLoc(Point p);

	public abstract void translate(int x, int y);

	public abstract Rectangle getBounds();

	public abstract void accept(ShapeVisitor sv);

}
