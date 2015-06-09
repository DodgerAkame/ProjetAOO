package graphics.shapes.ui;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SPeople;
import graphics.shapes.SMan;
import graphics.shapes.SRectangle;
import graphics.shapes.SWoman;
import graphics.shapes.attributes.ColorAttributes;
import graphics.shapes.attributes.SelectionAttributes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Scanner;

import javax.swing.JFrame;

@SuppressWarnings("serial")
//Oubli du SerialVersionUid dans une classe d�clar�e Serializable
public class Editor extends JFrame {
	
	ShapesView sview;
	static SCollection model;
	static String s = "";
	static Scanner sc = new Scanner(System.in);
	static SPeople people = null;

	public Editor() {
		super("Shapes Editor");

		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				System.exit(0);
			}
		});

		this.buildModel();

		this.sview = new ShapesView(model);
		this.sview.setPreferredSize(new Dimension(400, 300));
		this.getContentPane().add(this.sview, java.awt.BorderLayout.CENTER);
	}

	private void buildModel() {

		model = new SCollection();
		model.addAttributes(new SelectionAttributes());

		/*SRectangle r = new SRectangle(new Point(60, 90), 100, 80);
		r.addAttributes(new ColorAttributes(true, false, Color.BLUE, Color.BLUE));
		r.addAttributes(new SelectionAttributes());
		this.model.add(r);

		SCircle c = new SCircle(new Point(100, 100), 10);
		c.addAttributes(new ColorAttributes(false, true, Color.BLUE, Color.BLUE));
		c.addAttributes(new SelectionAttributes());
		this.model.add(c);

		SText t = new SText(new Point(100, 100), "hello");
		t.addAttributes(new ColorAttributes(true, true, Color.YELLOW,
				Color.BLUE));
		t.addAttributes(new FontAttributes());
		t.addAttributes(new SelectionAttributes());
		this.model.add(t);

		SCollection sc = new SCollection();
		sc.addAttributes(new SelectionAttributes());
		r = new SRectangle(new Point(20, 30), 30, 30);
		r.addAttributes(new ColorAttributes(true, false, Color.MAGENTA,
				Color.BLUE));
		r.addAttributes(new SelectionAttributes());
		sc.add(r);
		c = new SCircle(new Point(150, 100), 20);
		c.addAttributes(new ColorAttributes(false, true, Color.BLUE,
				Color.DARK_GRAY));
		c.addAttributes(new SelectionAttributes());
		sc.add(c);
		this.model.add(sc);/**/

	}
	
	public static void addMan(String arg) {
		SMan P = new SMan();
		people=P;
		P.addAttributes(new ColorAttributes(true,false,Color.blue,Color.blue));
		P.setBorder(new SRectangle(new Point(),100,50));
		P.setFather(null);
		P.setMother(null);
		P.setName(arg.substring(1));
		P.setNbchild(Integer.parseInt(arg.substring(0, 1)));
		model.add(P);
		System.out.println("OK");
	}
	
	public static void addWoman(String arg) {
		SWoman P = new SWoman();
		people=P;
		P.addAttributes(new ColorAttributes(true,false,Color.blue,Color.blue));
		P.setBorder(new SCircle(new Point(),60));
		P.setFather(null);
		P.setMother(null);
		P.setName(arg.substring(1));
		P.setNbchild(Integer.parseInt(arg.substring(0, 1)));
		model.add(P);
		System.out.println("OK");
	}
	
	public static void addMom(String arg) {
		SWoman P = new SWoman();
		P.addAttributes(new ColorAttributes(true,false,Color.blue,Color.blue));
		P.setBorder(new SCircle(new Point(),60));
		P.setFather(null);
		P.setMother(null);
		P.setName(arg.substring(1));
		P.setNbchild(Integer.parseInt(arg.substring(0, 1)));
		people.addMom(P,true);
		model.add(P);
		people=P;
		System.out.println("OK");
	}
	
	public static void addDad(String arg) {
		SMan P = new SMan();
		P.addAttributes(new ColorAttributes(true,false,Color.blue,Color.blue));
		P.setBorder(new SRectangle(new Point(),100,50));
		P.setFather(null);
		P.setMother(null);
		P.setName(arg.substring(1));
		P.setNbchild(Integer.parseInt(arg.substring(0, 1)));
		people.addDad(P,true);
		model.add(P);
		people=P;
		System.out.println("OK");
	}
	
	public static void addBoy(String arg) {
		SMan P = new SMan();
		P.addAttributes(new ColorAttributes(true,false,Color.blue,Color.blue));
		P.setBorder(new SRectangle(new Point(),100,50));
		P.setFather(null);
		P.setMother(null);
		P.setName(arg.substring(1));
		P.setNbchild(Integer.parseInt(arg.substring(0, 1)));
		people.addBoy(P,true);
		model.add(P);
		people=P;
		System.out.println("OK");
	}
	
	public static void addGirl(String arg) {
		SWoman P = new SWoman();
		P.addAttributes(new ColorAttributes(true,false,Color.blue,Color.blue));
		P.setBorder(new SCircle(new Point(),60));
		P.setFather(null);
		P.setMother(null);
		P.setName(arg.substring(1));
		P.setNbchild(Integer.parseInt(arg.substring(0, 1)));
		people.addGirl(P,true);
		model.add(P);
		people=P;
		System.out.println("OK");
	}

	public static void main(String[] args) {
		Editor self = new Editor();
		self.pack();
		self.setVisible(true);
		/*s=sc.next();
		boolean a=true;
		while(a){
		if(!(s.equals(""))) {
			s=s.toLowerCase();
			switch (s.substring(0, 2)) {
				case "ma" : addMan(s.substring(2));s="";continue;
				case "wo" : addWoman(s.substring(2));s="";continue;
				case "mo" : addMom(s.substring(2));s="";continue;
				case "da" : addDad(s.substring(2));s="";continue;
				case "bo" : addBoy(s.substring(2));s="";continue;
				case "gi" : addGirl(s.substring(2));s="";continue;
				case "ok" : a=false;continue;
				}
		}
		}/**/
		
	}
}
