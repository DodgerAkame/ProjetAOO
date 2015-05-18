package graphics.shapes;

import java.awt.*;



public class TestShape {


	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(15,25);
		Rectangle b = new Rectangle (5,5);
		a.add(b); 
		
		System.out.println(a.getSize());
		System.out.println(a.getBounds());
		System.out.println(b.getSize());
		System.out.println(b.getBounds());
		
	}

}
