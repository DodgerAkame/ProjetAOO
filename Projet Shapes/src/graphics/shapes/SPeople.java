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
		setNbchild(0);
		name = new SText(null,"");
	}
	
	public int setName(String s) {
		this.name.setText(s);
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
	
	public SMan getDad() {
		return this.father;
	}

	public Shape getBorder() {
		return Border;
	}

	public int getNbchild() {
		return Nbchild;
	}

	public void setNbchild(int nbchild) {
		Nbchild = nbchild;
	}

	public SPeople[] getChildren() {
		return children;
	}
}
