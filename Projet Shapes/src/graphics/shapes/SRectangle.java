package graphics.shapes;

import java.awt.*;
//Faire un toString
//Pour getBounds,faire un clone (cela evite les problemes avec la reference de l'objet)
import graphics.shapes.ui.*;

public class SRectangle extends Shape {

	private Rectangle rect = new Rectangle(0, 0, 0, 0);

	public SRectangle(Point point, int w, int h) {
		this.rect.x = point.x;
		this.rect.y = point.y;
		this.rect.width = w;
		this.rect.height = h;
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
		return (Rectangle) rect.clone();
	}

	public void accept(ShapeVisitor sv) {
		sv.visitRectangle(this);
	}

}
