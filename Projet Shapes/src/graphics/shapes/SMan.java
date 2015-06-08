package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SMan extends SPeople {

	private SRectangle Border;
	private final int XCenter = 150;
	private final int YCenter = 200;
	private final int XDelta = 100;
	private final int YDelta = 100;
	
	public SMan() { 
		super();
		setBorder(new SRectangle(null, 0, 0));
	}
	
	public SMan(SMan man) {
		setFather(man.getDad());
		setMother(man.getMom());
		setNbchild(man.getNbChild());
		setName(man.getName());
		setBorder(man.getBorder());
	}
	
	public int addMom(SWoman woman,boolean a) {
		setMother(woman);
		if (a) woman.addBoy(this,false);
		return 0;
	}
	
	public int addDad(SMan man,boolean a) {
		setFather(man);
		if (a) man.addBoy(this,false);
		return 0;
	}
	
	public int addGirl(SWoman woman,boolean a) {
		addGirl(woman);
		if (a) woman.addDad(this,false);
		return 0;
	}
	
	public int addBoy(SMan man,boolean a) {
		addBoy(man);
		if (a) man.addDad(this, false);
		return 0;
	}
	
	public SRectangle getBorder() {
		return this.Border;
	}
	
	public void setBorder(SRectangle sr) {
		this.Border=sr;
	}

	public Point getLoc() {
		return this.getBorder().getLoc();
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

	public void setLoc(Point p) {
		this.Border.setLoc(p);		
	}
} 