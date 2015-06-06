package graphics.shapes;

import graphics.shapes.attributes.FontAttributes;

import java.awt.Point;
import java.awt.Rectangle;

public class SText extends Shape {

	private String text;
	private Point loc;

	public SText(Point point, String string) {
		super(); // On passe a la super classe, je crois que c'est parce que le
					// texte est dans un cadre
		this.loc = point;
		this.text = string;
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
		this.loc.translate(x, y);
	}

	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		FontAttributes fa = (FontAttributes) this.getAttributes("Font");
		Rectangle result=fa.getBounds(text);
		result.setLocation(loc.x-2, loc.y-result.height);
		result.height=result.height+3;
		result.width=result.width+6;
		return result;
		//C'est moche
	}

	public void accept(ShapeVisitor sv) {
		sv.visitText(this);
	}

}
