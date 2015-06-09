package graphics.shapes;

import graphics.shapes.ui.ShapeDraftman;

import java.awt.Point;
import java.awt.Rectangle;

public class SWoman extends SPeople {

	private SCircle Border;
	private final int XCenter = 400;
	private final int YCenter = 300;
	private final int XDelta = 200;
	private final int YDelta = 200;
	private final ShapeDraftman SD = new ShapeDraftman();
	
	public SWoman() {
		super();
		setBorder(new SCircle(new Point(0,0), 0));
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
	
	public void setBorder(SCircle sCircle) {
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
		SD.visitCircle(this.Border);
		this.setPosName(p);
		SD.visitText(this.getText());
		return 0;
	}
}