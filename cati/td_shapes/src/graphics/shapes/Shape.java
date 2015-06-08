package graphics.shapes;

import graphics.shapes.attributes.Attributes;

import java.awt.*;
import java.util.TreeMap;

public abstract class Shape {

	// Table d'association pour l'identification des Attributes par ID

	protected TreeMap<String, Attributes> attributes = new TreeMap<String, Attributes>();

	public void addAttributes(Attributes a) {
		this.attributes.put(a.getId(), a);
	}

	public Attributes getAttributes(String s) {
		return (Attributes) this.attributes.get(s);
	}

	public abstract Point getLoc();

	public abstract void setLoc(Point p);

	public abstract void translate(int dx, int dy);

	public abstract Rectangle getBounds();

	public abstract void accept(graphics.shapes.ShapeVisitor v);

	public TreeMap<String, Attributes> getAttributes() {
		return attributes;
	}

}
