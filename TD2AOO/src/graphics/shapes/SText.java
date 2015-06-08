package graphics.shapes;

import graphics.shapes.attributes.FontAttributes;
import java.awt.Point;
import java.awt.Rectangle;

public class SText extends Shape{
	
	private String text=null;
	private Point loc=null;
	
	public SText(Point loc,String text){
		super();
		this.loc=loc;
		this.text=text;
	}

	public void accept(ShapeVisitor sv) {
		sv.visitText(this);
	}

	public Rectangle getBounds(){
		FontAttributes sa=(FontAttributes) getAttributes("FontAttributes");
		Rectangle r=sa.getBounds(text);
		r.setLocation(loc);
		return r;
	}

	public Point getLoc() {
		return loc;
	}

	public void setLoc(Point p) {
		this.loc.setLocation(p);
	}


	public void translate(int xt, int yt) {
		loc.translate(xt, yt);
	}
	
	public String getText(){
		return this.text;
	}

}
