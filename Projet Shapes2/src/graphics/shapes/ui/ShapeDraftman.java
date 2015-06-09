package graphics.shapes.ui;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.shapes.SText;
import graphics.shapes.ShapeVisitor;
import graphics.shapes.attributes.ColorAttributes;
import graphics.shapes.attributes.FontAttributes;
import graphics.shapes.attributes.SelectionAttributes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

public class ShapeDraftman implements ShapeVisitor {

	private final static ColorAttributes color = new ColorAttributes();
	private Graphics2D g;
	private final static FontAttributes DEFAULT_FONT_ATTRIBUTES = new FontAttributes();

	public Graphics2D getGraphics() {
		return g;
	}

	public void setGraphics(Graphics2D g) {
		this.g = g;
	}
	
	public void selectedShape(Rectangle rectangle) {
		g.setColor(Color.BLACK);
		g.drawOval(rectangle.getBounds().x - 4, rectangle.getBounds().y - 4, 4, 4);
		g.drawOval(rectangle.getBounds().x + rectangle.getBounds().width, rectangle.getBounds().y
					+ rectangle.getBounds().height, 4, 4);
	}

	public void visitRectangle(SRectangle r) {
		Rectangle rect = r.getBounds();
		ColorAttributes ca = (ColorAttributes) r
				.getAttributes(ColorAttributes.ID);
		SelectionAttributes sa = (SelectionAttributes) r
				.getAttributes(SelectionAttributes.ID);

		if (ca == null)
			ca = color;

		// Il faut remplir le fond avant de dessiner le contour
		if (ca.filled) {
			g.setColor(ca.filledColor);
			g.fillRect(rect.x, rect.y, rect.width, rect.height);
		}

		if (ca.stroked) {
			g.setColor(ca.strokedColor);
			g.drawRect(rect.x, rect.y, rect.width, rect.height);
		}

		if (sa.isSelected())
			this.selectedShape(r.getBounds());
	}

	public void visitCircle(SCircle c) {
		Rectangle rect = c.getBounds();
		ColorAttributes ca = (ColorAttributes) c
				.getAttributes(ColorAttributes.ID);
		SelectionAttributes sa = (SelectionAttributes) c
				.getAttributes(SelectionAttributes.ID);

		if (ca == null)
			ca = color;

		// Oval dessine le cercle inscrit dans le rectangle
		if (ca.filled) {
			g.setColor(ca.filledColor);
			g.fillOval(rect.x, rect.y, rect.width, rect.height);
		}

		if (ca.stroked) {
			g.setColor(ca.strokedColor);
			g.drawOval(rect.x, rect.y, rect.width, rect.height);
		}

		if (sa.isSelected())
			this.selectedShape(c.getBounds());
	}

	public void visitText(SText t) {
		Rectangle rect = t.getBounds();
		Point loc = t.getLoc();
		FontAttributes fa = (FontAttributes) t.getAttributes(FontAttributes.ID);
		ColorAttributes ca = (ColorAttributes) t
				.getAttributes(ColorAttributes.ID);
		SelectionAttributes sa = (SelectionAttributes) t
				.getAttributes(SelectionAttributes.ID);

		if (fa == null)
			fa = DEFAULT_FONT_ATTRIBUTES;

		if (ca == null)
			ca = color;

		if (ca.filled) {
			g.setColor(ca.filledColor);
			g.fillRect(rect.x, rect.y, rect.width, rect.height);
		}

		if (ca.stroked) {
			g.setFont(fa.font);
			g.setColor(ca.strokedColor);
		}

		g.drawString(t.getText(), loc.x, loc.y);

		if (sa.isSelected())
			this.selectedShape(t.getBounds());
		
	}

	public void visitCollection(SCollection collection) {
		SelectionAttributes sa = (SelectionAttributes) collection
				.getAttributes(SelectionAttributes.ID);
		for (int i = 0; i < collection.getShapes().size(); i++) {
			collection.getShapes().get(i).accept(this);
		}
		if (sa.isSelected())
			this.selectedShape(collection.getBounds());
		
	}

}
