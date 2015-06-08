package graphics.shapes;

import java.awt.Point;
import java.util.Scanner;

abstract class SPeople extends Shape {
	
	private Shape Border;
	private SMan father;
	private SWoman mother;
	private SPeople[] children;
	private int nbChild;
	private SText name;
	
	public SPeople() {
		Border=null;
		father = null;
		mother = null;
		nbChild = 0;
		name = new SText(null,"");
	}
	
	public int delChildren() {
		nbChild=0;
		return nbChild;
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
	
	public abstract int displayA(int x,int y);
	
	public int displayF(int x, int y) { //affiche une personne, ses parents et ses enfants
		
		return 0;
	}
	
	public SWoman getMom() {
		return this.mother;
	}
	
	public abstract int setMom(SWoman Mom,boolean i);
	
	public SMan getDad() {
		return this.father;
	}
	
	public abstract int setDad(SMan Dad,boolean i);
	
	public Shape getBorder() {
		return Border;
	}

	public void setBorder(Shape border) {
		Border = border;
	}
}
