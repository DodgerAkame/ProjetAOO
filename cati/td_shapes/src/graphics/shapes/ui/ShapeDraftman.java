package graphics.shapes.ui;

import java.awt.*;
import graphics.shapes.*;
import graphics.shapes.attributes.*;

public class ShapeDraftman implements ShapeVisitor {

	private Graphics2D g;
	private final static ColorAttributes DEFAULT_COLOR_ATTRIBUTES = new ColorAttributes();
	private final static FontAttributes DEFAULT_FONT_ATTRIBUTES = new FontAttributes();

	public Graphics2D getGraphics() {
		return g;
	}

	public void setGraphics(Graphics2D g) {
		this.g = g;
	}

	// Pour toutes les méthodes de visite, la démarche est la même :
	// 1) Récupérer les attributs de couleur
	// 2) Dessiner le rectangle avec g

	public void visitRectangle(SRectangle r) {
		Rectangle rect = r.getBounds();
		ColorAttributes ca = (ColorAttributes) r
				.getAttributes(ColorAttributes.ID);
		SelectionAttributes sa = (SelectionAttributes) r
				.getAttributes(SelectionAttributes.ID);

		if (ca == null)
			ca = DEFAULT_COLOR_ATTRIBUTES;

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
			this.drawHandler(r.getBounds());
	}

	public void visitCircle(SCircle c) {
		Rectangle rect = c.getBounds();
		ColorAttributes ca = (ColorAttributes) c
				.getAttributes(ColorAttributes.ID);
		SelectionAttributes sa = (SelectionAttributes) c
				.getAttributes(SelectionAttributes.ID);

		if (ca == null)
			ca = DEFAULT_COLOR_ATTRIBUTES;

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
			this.drawHandler(c.getBounds());
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
			ca = DEFAULT_COLOR_ATTRIBUTES;

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
			this.drawHandler(t.getBounds());
		
	}

	public void visitCollection(SCollection collection) {
		SelectionAttributes sa = (SelectionAttributes) collection
				.getAttributes(SelectionAttributes.ID);
		for (int i = 0; i < collection.getShapes().size(); i++) {
			collection.getShapes().get(i).accept(this);
		}
		if (sa.isSelected())
			this.drawHandler(collection.getBounds());
		
	}

	// Permet de dessiner les indicateurs de sélection

	protected void drawHandler(Rectangle bounds) {
		g.setColor(Color.GREEN);
		g.drawRect(bounds.x - 3, bounds.y - 3, 6, 6);
		g.drawRect(bounds.x + bounds.width - 3, bounds.y + bounds.height - 3,
				6, 6);
	}

}
