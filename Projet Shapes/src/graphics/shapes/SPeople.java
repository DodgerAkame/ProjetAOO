package graphics.shapes;

abstract class SPeople extends Shape {
	
	private Shape Border;
	private SMale father;
	private SFemale mother;
	private SPeople[] children;
	private int Nbchild;
	
	SPeople() {
		father = new SMale();
		mother = new SFemale();
		Nbchild=0;
	}
	
	abstract Shape getBorder();
	
	public int setBorder(Shape shape) {
		this.Border=shape;
		return 0;
	}
	
	public int displayA(int x,int y) { //affiche une personne
		return 0;
	}
	
	public int displayF(int x, int y) { //affiche une personne, ses parents et ses enfants
		return 0;
	}
	
	public SFemale getMom() {
		return this.mother;
	}
	
	public int setMom(SFemale Mom,boolean i) { //fixe/modifie la mère
		int a = 0;
		mother = Mom;
		if (i) Mom.addChild(this,false);
		return a;
	}
	
	public SMale getDad() {
		return this.father;
	}
	
	public int setDad(SMale Dad,boolean i) { //fixe/modifie le père
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
}