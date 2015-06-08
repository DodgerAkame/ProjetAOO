package graphics.shapes.ui;

import java.awt.Graphics;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.ui.Controller;
import graphics.ui.View;

public class ShapesView extends View {
	private ShapeDraftman d;
	
	public ShapesView(Object model)
	{
		super(model);
		this.d = new ShapeDraftman();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//System.out.println("I am drawing");
		SCollection model = (SCollection) this.getModel();
		if(model ==null) return;
		
		d.setGraphics(g);
		model.accept(d);
		
	}
	
	

}
