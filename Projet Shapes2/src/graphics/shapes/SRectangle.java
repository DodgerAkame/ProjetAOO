package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;
//Faire un toString
//Pour getBounds,faire un clone (cela evite les problemes avec la reference de l'objet)

public class SRectangle extends Shape {

	private Rectangle rect;

	public SRectangle(Point loc, int w, int h) {
		rect = new Rectangle(loc.x,loc.y,w,h);
	}

	public Rectangle getRect() {
		return this.rect;
	}

	public Point getLoc() {
		return rect.getLocation(); // Retourne un point sur la position du
									// rectangle
									//le coin supérieur gauche
	}

	public void setLoc(Point p) {
		this.rect.x=p.x;
		this.rect.y=p.y;
	}

	public void translate(int x, int y) {
		this.rect.translate(x, y);
	}

	public Rectangle getBounds() {
		return rect.getBounds();
	}

	public void accept(ShapeVisitor sv) {
		sv.visitRectangle(this);
	}

}
