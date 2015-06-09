package graphics.shapes;

import java.awt.Point;

public abstract class SPeople extends Shape {
	
	private Shape Border;
	private SMan father;
	private SWoman mother;
	private SPeople[] children;
	private int nbChild;
	private SText name;
	
	public abstract int addMom(SWoman mom, boolean a);
	public abstract int addDad(SMan dad, boolean a);
	public abstract int addBoy(SMan boy,boolean a);
	public abstract int addGirl(SWoman girl,boolean a);
	
	public SPeople() {
		setFather(null);
		setMother(null);
		setNbchild(0);
		name = new SText(null,"");
	}
	
	public int setName(String s) {
		this.name.setText(s);
		return 0;
	}
	
	public SText getText() {
		return this.name;
	}
	
	public String getName() {
		return this.name.getText();
	}
	
	public int setPosName(Point p) {
		this.name.setLoc(p);
		return 0;
	}
	
	public abstract int displayA(int x,int y);
	
	public abstract int displayF();
	
	public SWoman getMom() {
		return this.getMother();
	}
	
	public SMan getDad() {
		return this.getFather();
	}

	public Shape getBorder() {
		return Border;
	}

	public int getNbChild() {
		return nbChild;
	}

	public void setNbchild(int nbchild) {
		nbChild = nbchild;
	}

	public SPeople[] getChildren() {
		return children;
	}

	public SMan getFather() {
		return father;
	}

	public void setFather(SMan father) {
		this.father = father;
	}

	public SWoman getMother() {
		return mother;
	}

	public void setMother(SWoman mother) {
		this.mother = mother;
	}
	
	public int addBoy(SMan boy) {
		children[nbChild]=new SMan(boy);
		nbChild++;
		return 0;
	}
	
	public int addGirl(SWoman girl) {
		children[nbChild]=new SWoman(girl);
		nbChild++;
		return 0;
	}
}
