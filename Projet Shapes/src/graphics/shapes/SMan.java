package graphics.shapes;

import graphics.shapes.ui.ShapeDraftman;

import java.awt.Point;
import java.awt.Rectangle;

public class SMan extends SPeople {

	private SRectangle Border;
	private final int XCenter = 150;
	private final int YCenter = 200;
	private final int XDelta = 100;
	private final int YDelta = 100;
	private final ShapeDraftman SD = new ShapeDraftman();
	
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

	@Override
	public int displayF() { //affiche une famille
		this.displayA(XCenter,YCenter);
		if (this.getDad()!=null) getDad().displayA((int)(XCenter-1.2*XDelta), YCenter-YDelta);
		if (this.getMom()!=null) getMom().displayA((int)(XCenter+1.2*XDelta), YCenter-YDelta);
		switch (getNbChild()) {
			case 1 : 	getChildren()[0].displayA(XCenter,YCenter+YDelta);
						break;
			case 2 : 	getChildren()[1].displayA((int) (XCenter-(0.8*XCenter)), YCenter+YDelta);
						getChildren()[2].displayA((int) (XCenter+(0.8*XCenter)), YCenter+YDelta);
						break;
			case 3 : 	getChildren()[1].displayA((int) (XCenter-(1.2*XCenter)), YCenter+YDelta);
						getChildren()[2].displayA(XCenter, YCenter+YDelta);
						getChildren()[3].displayA((int) (XCenter+(1.2*XCenter)), YCenter+YDelta);
						break;
			case 4 : 	getChildren()[1].displayA((int) (XCenter-(1.5*XCenter)), YCenter+YDelta);
						getChildren()[2].displayA((int) (XCenter-(0.5*XCenter)), YCenter+YDelta);
						getChildren()[3].displayA((int) (XCenter+(0.5*XCenter)), YCenter+YDelta);
						getChildren()[4].displayA((int) (XCenter+(1.5*XCenter)), YCenter+YDelta);
						break;
			default :	break;
		}
		return 0;
	}

	@Override
	public int displayA(int x, int y) { //affiche une personne
		Point p=new Point(x,y);
		this.setLoc(p);
		SD.visitRectangle(this.Border);
		this.setPosName(p);
		SD.visitText(this.getText());
		return 0;
	}
} 