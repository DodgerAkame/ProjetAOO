package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SFemale extends SPeople {

	SFemale() {
		super();
		setBorder(new SCircle());
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
		if (i) tod.setMom(this,false);
		return 0;
	}

	@Override
	Shape getBorder() {
		// TODO Auto-generated method stub
		return null;
	}
}