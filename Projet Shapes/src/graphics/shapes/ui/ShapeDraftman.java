package graphics.shapes.ui;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.shapes.SText;
import graphics.shapes.ShapeVisitor;
import graphics.shapes.attributes.ColorAttributes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class ShapeDraftman implements ShapeVisitor {

	private ColorAttributes color;
	private Graphics2D g;

	public static final ColorAttributes DEFAULTCOLORATTRIBUTES = new ColorAttributes(
			true, false, color.BLACK, color.BLACK);

	public ShapeDraftman(Graphics2D g) {
		this.g =  g;
	}

	public void visitRectangle(SRectangle sr) {
		// TODO Auto-generated method stub
		Rectangle r = sr.getBounds();

	}

	public void visitCircle(SCircle sc) {
		// TODO Auto-generated method stub

	}

	public void visitText(SText st) {
		// TODO Auto-generated method stub

	}

	public void visitCollection(SCollection sco) {
		// TODO Auto-generated method stub

	}

}
