package graphics.shapes.ui;

import graphics.shapes.SCollection;
import graphics.shapes.Shape;
import graphics.shapes.attributes.SelectionAttributes;
import graphics.ui.Controller;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Iterator;

public class ShapesController extends Controller {

	private int mouseX = 0;
	private int mouseY = 0;
	
	public ShapesController(Object newModel) {
		super(newModel);
	}

	public void mousePressed(MouseEvent e) {
		this.mouseX=e.getX();
		this.mouseY=e.getY();
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		SCollection sc = (SCollection) this.getModel();
		for (Iterator it= sc.liste.iterator();it.hasNext();) {
			Shape s = (Shape) it.next();
			SelectionAttributes sa = (SelectionAttributes)
					s.getAttributes("SelectionAttributes");
			if (s.getBounds().contains(e.getX(), e.getY())) {
				if (e.isShiftDown())
					sa.toggleSelection();
				else
					sa.select();
		} else {
			if (!e.isShiftDown())
				sa.deselect();
			}
		}
		super.getView().repaint();
	}

	public void mouseEntered(MouseEvent e) {
		super.getView().requestFocus();
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent evt) {
	}

	public void mouseDragged(MouseEvent evt) {
	}

	public void keyTyped(KeyEvent evt) {
	}

	public void keyPressed(KeyEvent evt) {
	}

	public void keyReleased(KeyEvent evt) {
	}

}
