package graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestPanel extends JPanel {
	public TestPanel() {
		this.setMinimumSize(new Dimension(100, 100));
		this.setMaximumSize(new Dimension(250, 150));
		this.setPreferredSize(new Dimension(300, 200));
		this.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("click");
				System.out.println(e);
			}

			public void mouseEntered(MouseEvent e) {
				System.out.println("enter");
				System.out.println(e);
			}

			public void mouseExited(MouseEvent e) {
				System.out.println("exit");
				System.out.println(e);
			}

			public void mousePressed(MouseEvent e) {
				System.out.println("press");
				System.out.println(e);
			}

			public void mouseReleased(MouseEvent e) {
				System.out.println("releas"); // relacher
				System.out.println(e);
			}
		});
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				System.out.println("drag");
				System.out.println(e);
			}

			public void mouseMoved(MouseEvent e) {
				System.out.println("move");
				System.out.println(e);
			}
		});
	}

	// Source / Override...
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(10, 10, 10, 10);
		super.paintComponent(g);
		g.drawString("Hello Hello", 50, 50); // (0,0) en haut a gauche
		g.drawRect(65, 65, 20, 20);
		g.drawRect(rect.x, rect.y, rect.height, rect.width);
		g.drawRect(95, 65, 20, 20);
		g.setColor(Color.red);
		// g.setFont(new Font()); a finir
		g.drawString("AUDI", 65, 120);
		g.setColor(Color.DARK_GRAY);
		g.drawOval(100, 100, 25, 25);
		g.drawOval(120, 100, 25, 25);
		g.drawOval(140, 100, 25, 25);
		g.drawOval(160, 100, 25, 25);
	}
}