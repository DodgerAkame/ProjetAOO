package graphics.shapes.ui;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Iterator;

import graphics.shapes.SCollection;
import graphics.shapes.Shape;
import graphics.ui.Controller;
import graphics.shapes.attributes.SelectionAttributes;

//Adaptation de l'arch�type Controller (MVC) � notre application
public class ShapesController extends Controller {

	private Shape target;
	private Point Click = new Point();

	public ShapesController(Object newModel) {
		super(newModel);
	}

	// Permet l'acquisition � l'endroit du clic souris
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
					.unselect();
		}
	}

	// V�rifie si la touche Shift est maintenue, pour les s�lections multiples
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
		super.mouseClicked(e); // A essayer d'enlever, pour voir le
								// fonctionnement
		Shape t = this.getTarget(e);
		if (t == null)
			System.out.println("?");
		else
			System.out.println(this.getTarget(e));
		this.getView().invalidate();
	}

	public void mousePressed(MouseEvent e) {
		Click = (Point) e.getPoint().clone();
		System.out.println("Le point s�lectionn� est " + Click);
		target = this.getTarget(e);
		if (!e.isShiftDown())
			this.unselectAll();
		if (target != null)
			((SelectionAttributes) target.getAttributes().get(
					SelectionAttributes.ID)).toggleSelection();
		super.mousePressed(e);
		System.out.println("Les �l�ments s�lectionn�s sont :");
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
