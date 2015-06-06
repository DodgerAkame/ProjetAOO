package graphics.shapes.ui; //redefinir une fonction specifique (voir Graphics)

import graphics.shapes.SCollection;
import graphics.ui.Controller;
import graphics.ui.View;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class ShapesView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1732482651961386050L;

	public ShapesView(Object model) {
		super(model);
	}

	protected void paintComponant(Graphics g) {
		super.paintComponent(g);
		System.out.println("Test");

		Graphics2D f = (Graphics2D) g;
		ShapeDraftman d = new ShapeDraftman(f);
		SCollection m = (SCollection) this.getModel();
		if (m != null)
			m.accept(d);
	}

	public Controller defaultController(Object model) {
		return new ShapesController(model);
	}


}
