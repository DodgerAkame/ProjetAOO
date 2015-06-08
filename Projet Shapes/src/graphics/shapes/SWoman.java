package graphics.shapes;

import graphics.shapes.ui.ShapeDraftman;

import java.awt.Point;
import java.awt.Rectangle;

public class SWoman extends SPeople {

	private SCircle Border;
	
	public SWoman() {
		setBorder(new SCircle(null, 0));
		setDad(null,false);
		setMom(null,false);
		delChildren();
		setName("");
	}
	
	public SWoman(SWoman Mom) {
		this.Border=Mom.getBorder();
		setDad(Mom.getDad(),!(Mom.getDad().equals(null)));
		setMom(Mom.getMom(),!(Mom.getMom().equals(null)));
		delChildren();
		setName(Mom.getName());
	}

	private void setBorder(SCircle sCircle) {
		this.Border=sCircle;
	}

	@Override
	public Point getLoc() {
		return this.getBorder().getLoc();
	}

	@Override
	public void setLoc(Point p) {
		this.Border.setLoc(p);
	}
	
	public void setRad(int r) {
		Point p=this.getBorder().getLoc();
		setBorder(new SCircle(p,r));
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

	public SCircle getBorder() {
		return this.Border;
	}

	@Override
	public int displayA(int x, int y) {
		Border.getBounds().x=x;
		Border.getBounds().y=y;
		new ShapeDraftman(null).visitCircle(Border);
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