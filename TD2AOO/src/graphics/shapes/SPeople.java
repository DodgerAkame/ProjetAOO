package graphics.shapes;

import java.awt.Point;

abstract class SPeople extends Shape {
	
	private Shape Border;
	private SMan father;
	private SWoman mother;
	private SPeople[] children;
	private int Nbchild;
	private SText name;
	
	public SPeople() {
		father = new SMan();
		mother = new SWoman();
		Nbchild = 0;
		name = new SText(null,"");
	}
	
	public int setName(String s) {
		//this.name.setText(s);
		return 0;
	}
	
	public String getName() {
		return this.name.getText();
	}
	
	public int setPosName(Point p) {
		this.name.setLoc(p);
		return 0;
	}
	
	public int displayA(int x,int y) { //affiche une personne
		return 0;
	}
	
	public int displayF(int x, int y) { //affiche une personne, ses parents et ses enfants
		return 0;
	}
	
	public SWoman getMom() {
		return this.mother;
	}
	
	public int setMom(SWoman Mom,boolean i) { //fixe/modifie la mère
		int a = 0;
		mother = Mom;
		if (i) Mom.addChild(this,false);
		return a;
	}
	
	public SMan getDad() {
		return this.father;
	}
	
	public int setDad(SMan Dad,boolean i) { //fixe/modifie le père
		int a = 0;
		father = Dad;
		if (i) Dad.addChild(this,false);
		return a;
	}

	public int addChild(SPeople tod) {
		children[Nbchild]=tod;
		Nbchild++;
		return 0;
	}
	
	abstract int addChild(SPeople tod, boolean i);

	public Shape getBorder() {
		return Border;
	}

	public void setBorder(Shape border) {
		Border = border;
	}
}
