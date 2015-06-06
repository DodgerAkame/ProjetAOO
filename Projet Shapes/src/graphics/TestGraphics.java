package graphics;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGraphics extends JFrame {

	public TestGraphics(){
		super("Hello World 1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hello World");
		this.getContentPane().add(label, BorderLayout.NORTH);
		// OU
		this.getContentPane().add(new JLabel("Hello2"), BorderLayout.WEST);
		this.getContentPane().add(new JLabel("Hello3"), BorderLayout.CENTER);
		this.getContentPane().add(new TestPanel(), BorderLayout.SOUTH);
		// this.setPreferredSize(new Dimension(500,500));
		this.setVisible(true);
		// Parcourt l'arbre, et la met en page (il faut le faire a chaque fois que l'on modifie quelque chose)
		this.pack();
}

	public static void main(String[] args) {
		TestGraphics self = new TestGraphics();
	}
	/*
	 * public static void main(String[] args) { //1. Create the frame. JFrame
	 * frame = new JFrame("TestGraphics"); //2. Optional: What happens when the
	 * frame closes? frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * JPanel panel = new JPanel(); JLabel label = new JLabel("Hello Wolrd");
	 * panel.add(label); //3. Create components and put them in the frame.
	 * //...create emptyLabel... // Layout : Grill qui permet de placer les
	 * ŽlŽments dans la page frame.getContentPane().add(panel,
	 * BorderLayout.CENTER); //4. Size the frame. frame.pack(); //5. Show it.
	 * frame.setVisible(true); }
	 */

}