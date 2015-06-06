package graphics.shapes;

import java.awt.*;

public class SText extends Shape {

	private String text;
	private Point loc;

	public SText() {

	}

	public String getText() {
		return this.text;
	}

	public void setText(String s) {
		this.text = s;
	}

	public Point getLoc() {

		return loc.getLocation();
	}

	public void setLoc(Point p) {
		this.loc.setLocation(p);
	}

	public void translate(int x, int y) {
		// TODO Auto-generated method stub
		this.loc.translate(x,y);
	}

	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null; //je vois pas comment avoir les bords d'un texte
	}

	public void accept(ShapeVisitor sv) {
		// TODO Auto-generated method stub

	}

}
