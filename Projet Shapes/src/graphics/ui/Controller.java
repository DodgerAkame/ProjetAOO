package graphics.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Controller implements MouseListener, MouseMotionListener,
		KeyListener {
	private Object model;
	private View view;

	public Controller(Object newModel) {
		model = newModel;
	}

	public void setView(View view) {
		this.view = view;
	}

	final public View getView() {
		return this.view;
	}

	public void setModel(Object model) {
		this.model = model;
	}

	public Object getModel() {
		return this.model;
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("press");
		System.out.println(e);
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("release");
		System.out.println(e);
	}

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

	public void mouseMoved(MouseEvent evt) {
		System.out.println("move");
		System.out.println(evt);
	}

	public void mouseDragged(MouseEvent evt) {
		System.out.println("drag");
		System.out.println(evt);
	}

	public void keyTyped(KeyEvent evt) {
		System.out.println("type");
		System.out.println(evt);
	}

	public void keyPressed(KeyEvent evt) {
		System.out.println("press key");
		System.out.println(evt);
	}

	public void keyReleased(KeyEvent evt) {
		System.out.println("release key");
		System.out.println(evt);
	}
}
