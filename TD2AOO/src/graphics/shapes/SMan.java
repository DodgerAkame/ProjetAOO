package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SMan extends SPeople {

	private SRectangle Border;
	
	public SMan() { 
		super();
		setBorder(new SRectangle(null, 0, 0));
	}
	
	private void setBorder(SRectangle sr) {
		this.Border=sr;
	}

	@Override
	public Point getLoc() {
		return this.getBorder().getLoc();
	}

	@Override
	public void translate(int x, int y) {
		Point loc=this.getBorder().getLoc();
		loc.x+=x;
		loc.y+=y;
		setLoc(loc);		
	}

	@Override
	public Rectangle getBounds() {
		return this.getBounds();
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

	public Shape getBorder() {
		return this.Border;
	}

	@Override
	public void setLoc(Point p) {
		this.Border.setLoc(p);		
	}
} 