package graphics.shapes.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;

import graphics.shapes.Shape;
import graphics.ui.Controller;
import graphics.shapes.ui.ShapeDraftman;
import graphics.ui.View;

//Adaptation de l'archétype View (MVC) à notre application

@SuppressWarnings("serial")
// oubli du SerialVersionUid dans une classe déclarée Serializable
public class ShapesView extends View {

	private ShapeDraftman draftman;

	public ShapesView(Object model) {
		super(model);
		this.draftman = new ShapeDraftman();
	}

	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		this.draftman.setGraphics((Graphics2D) arg0);
		Shape model = (Shape) this.getModel();
		if (model == null)
			return;
		model.accept(this.draftman);
	}

	// Association du Controller avec la vue
	public Controller defaultController(Object model) {
		return new ShapesController(model);
	}

}