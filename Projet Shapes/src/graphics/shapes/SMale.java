package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SMale extends SPeople {

	SMale() {
		super();
		setBorder(new SRectangle(null, 0, 0));
	}
	
	@Override
	public Point getLoc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLoc(Point p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void translate(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(ShapeVisitor sv) {
		// TODO Auto-generated method stub
		
	}
	
	public int addChild(SPeople tod, boolean i) {
		addChild(tod);
		if (i) tod.setDad(this,false);
		return 0;
	}

	@Override
	Shape getBorder() {
		// TODO Auto-generated method stub
		return null;
	}
}