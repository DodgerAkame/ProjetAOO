package graphics.shapes.ui;

import graphics.shapes.SCollection;
import graphics.shapes.Shape;
import graphics.shapes.attributes.SelectionAttributes;
import graphics.ui.Controller;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Iterator;

public class ShapesController extends Controller {
	
	private Shape target;
	private Point Click = new Point();
	
	public ShapesController(Object newModel) {
		super(newModel);
	}
	
	public Shape getTarget(MouseEvent e) {
		SCollection model = (SCollection) this.getModel();
		for (Iterator<Shape> it = model.iterator(); it.hasNext();) {
			Shape s = it.next();
			if (s.getBounds().contains(e.getPoint()))
				return s;
		}
		return null;
	}

	protected void translateSelected(int dx, int dy) {
		SCollection model = (SCollection) this.getModel();
		if (model == null)
			return;
		for (Iterator<Shape> it = model.iterator(); it.hasNext();) {
			Shape s = (Shape) it.next();
			if (((SelectionAttributes) s.getAttributes(SelectionAttributes.ID))
					.isSelected())
				s.translate(dx, dy);
		}
	}

	public void unselectAll() {
		SCollection model = (SCollection) this.getModel();
		if (model == null)
			return;
		for (Iterator<Shape> it = model.iterator(); it.hasNext();) {
			Shape s = (Shape) it.next();
			((SelectionAttributes) s.getAttributes(SelectionAttributes.ID))
					.deselect();
		}
	}

	// Vérifie si la touche Shift est maintenue, pour les sélections multiples

	public boolean shiftDown(KeyEvent k) {
		return k.isShiftDown();
	}

	public void mouseControl(MouseEvent e) {
		System.out.println(e);
	}

	public void mouseDragged(MouseEvent evt) {
		this.translateSelected(evt.getPoint().x - Click.x, evt.getPoint().y
				- Click.y);
		Click = evt.getPoint();
		this.getView().paintImmediately(this.getView().getBounds());
	}

	public void mouseClicked(MouseEvent e) {
		Shape t = this.getTarget(e);
		// Shape t = this.getTarget();
		if (t == null)
			System.out.println("?");
		else
			System.out.println(this.getTarget(e));
		// else System.out.println(this.getTarget());
		this.getView().invalidate();
	}

	public void mousePressed(MouseEvent e) {
		Click = (Point) e.getPoint().clone();
		System.out.println("\n");
		System.out.println("Le point sélectionné est " + Click);
		target = this.getTarget(e);
		// target=this.getTarget();
		if (!e.isShiftDown())
			this.unselectAll();
		if (target != null)
			((SelectionAttributes) target.getAttributes().get(
					SelectionAttributes.ID)).toggleSelection();
		super.mousePressed(e);
		System.out.println("Les éléments séléctionnés sont :");
		SCollection model = (SCollection) this.getModel();
		for (Iterator<Shape> it = model.iterator(); it.hasNext();) {
			Shape s = it.next();
			if (((SelectionAttributes) (s.getAttributes()
					.get(SelectionAttributes.ID))).isSelected())
				System.out.println(s);
		}
	}

	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
	}

	public void mouseMoved(MouseEvent e) {
		super.mouseMoved(e);
	}

}

