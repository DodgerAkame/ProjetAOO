package graphics.shapes;

import graphics.shapes.ui.ShapeDraftman;

import java.awt.Point;
import java.awt.Rectangle;

public class SMan extends SPeople {

	private SRectangle Border;
	
	public SMan() { 
		super();
		setBorder(new SRectangle(null, 0, 0));
	}
	
	public SMan(SMan dad) {
		// TODO Auto-generated constructor stub
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

	public Shape getBorder() {
		return this.Border;
	}

	@Override
	public void setLoc(Point p) {
		this.Border.setLoc(p);		
	}

	@Override
	public int displayA(int x, int y) {
		Border.getBounds().x=x;
		Border.getBounds().y=y;
		new ShapeDraftman(null).visitRectangle(Border);
		return 0;
	}

	@Override
	public int setMom(SWoman Mom, boolean i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDad(SMan Dad, boolean i) {
		// TODO Auto-generated method stub
		return 0;
	}
} 