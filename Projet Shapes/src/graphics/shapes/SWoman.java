package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SWoman extends SPeople {

	private SCircle Border;
	private final int XCenter = 150;
	private final int YCenter = 200;
	private final int XDelta = 100;
	private final int YDelta = 100;
	
	public SWoman() {
		super();
		setBorder(new SCircle(null, 0));
	}
	
	public SWoman(SWoman woman) {
		setFather(woman.getDad());
		setMother(woman.getMom());
		setNbchild(woman.getNbChild());
		setName(woman.getName());
		setBorder(woman.getBorder());
	}
	
	public int addMom(SWoman woman,boolean a) {
		setMother(woman);
		if (a) woman.addGirl(this,false);
		return 0;
	}
	
	public int addDad(SMan man,boolean a) {
		setFather(man);
		if (a) man.addGirl(this,false);
		return 0;
	}
	
	public int addGirl(SWoman woman,boolean a) {
		addGirl(woman);
		if (a) woman.addMom(this,false);
		return 0;
	}
	
	public int addBoy(SMan man,boolean a) {
		addBoy(man);
		if (a) man.addMom(this, false);
		return 0;
	}
	
	private void setBorder(SCircle sCircle) {
		this.Border=sCircle;
	}

	public Point getLoc() {
		return this.getBorder().getLoc();
	}

	public void setLoc(Point p) {
		this.Border.setLoc(p);
	}
	
	public void setRad(int r) {
		Point p=this.getBorder().getLoc();
		setBorder(new SCircle(p,r));
	}

	public void translate(int x, int y) {
		Point loc=this.getBorder().getLoc();
		loc.x+=x;
		loc.y+=y;
		setLoc(loc);
	}

	public Rectangle getBounds() {
		return this.getBounds();
	}

	public void accept(ShapeVisitor sv) {
		// TODO Auto-generated method stub	
	}

	public SCircle getBorder() {
		return this.Border;
	}
}