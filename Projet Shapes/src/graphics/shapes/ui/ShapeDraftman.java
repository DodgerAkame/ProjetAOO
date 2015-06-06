package graphics.shapes.ui;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.shapes.SText;
import graphics.shapes.Shape;
import graphics.shapes.ShapeVisitor;
import graphics.shapes.attributes.ColorAttributes;
import graphics.shapes.attributes.FontAttributes;
import graphics.shapes.attributes.SelectionAttributes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Iterator;

public class ShapeDraftman implements ShapeVisitor {

	private ColorAttributes color;
	private Graphics2D g;

	public ColorAttributes DEFAULTCOLORATTRIBUTES = new ColorAttributes(true,
			false, color.BLACK, color.BLACK);

	public ShapeDraftman(Graphics2D g) {
		this.g = g;
	}

	public void selectedShape(Shape e) {
		SelectionAttributes s = (SelectionAttributes) e
				.getAttributes("SelectionAttrubutes");
		if (s.isSelected()) {
			g.setColor(Color.BLACK);
			g.drawOval(e.getBounds().x - 4, e.getBounds().y - 4, 4, 4);
			g.drawOval(e.getBounds().x + e.getBounds().width, e.getBounds().y
					+ e.getBounds().height, 4, 4);
		}
	}

	public void visitRectangle(SRectangle sr) {
		// TODO Auto-generated method stub
		if (sr.getAttributes("ColorAttributes") == null) {
			color = DEFAULTCOLORATTRIBUTES;
		} else
			color = (ColorAttributes) sr.getAttributes("ColorAttributes");
		if (color.getFilled()) {
			g.setColor(color.getFilledColor());
			g.fillRect(sr.getRect().x, sr.getRect().y, sr.getRect().width,
					sr.getRect().height);
		}
		if (color.getStroked()) {
			g.setColor(color.getStrokedColor());
			g.drawRect(sr.getRect().x, sr.getRect().y, sr.getRect().width,
					sr.getRect().height);
		}
		

	}

	public void visitCircle(SCircle sc) {
		// TODO Auto-generated method stub

		if (sc.getAttributes("ColorAttributes") != null) {
			if (((ColorAttributes) sc.getAttributes("ColorAttributes"))
					.getFilled()) {
				g.setColor(((ColorAttributes) sc
						.getAttributes("ColorAttributes")).getFilledColor());
				g.fillOval(sc.getBounds().x, sc.getBounds().y,
						sc.getBounds().width, sc.getBounds().height);
			} else {
				g.setColor(Color.BLACK);
				g.drawOval(sc.getBounds().x, sc.getBounds().y,
						sc.getBounds().width, sc.getBounds().height);
			}
			if (((ColorAttributes) sc.getAttributes("ColorAttributes"))
					.getStroked()) {
				g.setColor(((ColorAttributes) sc
						.getAttributes("ColorAttributes")).getStrokedColor());
				g.drawRect(sc.getBounds().x, sc.getBounds().y,
						sc.getBounds().width, sc.getBounds().height);
			}
		} else {
			g.setColor(Color.BLACK);
			g.drawOval(sc.getBounds().x, sc.getBounds().y,
					sc.getBounds().width, sc.getBounds().height);
		}
	}

	public void visitText(SText st) {
		// TODO Auto-generated method stub
		if ((FontAttributes) st.getAttributes("Font") != null) {
			FontAttributes fa = (FontAttributes) st.getAttributes("Font");
			fa.g = g;
			Rectangle tRect = st.getBounds();
			if (st.getAttributes("ColorAttributes") == null) {
				color = DEFAULTCOLORATTRIBUTES;
			} else
				color = (ColorAttributes) st.getAttributes("ColorAttributes");
			if (color.getFilled()) {
				g.setColor(color.getFilledColor());
				g.fillRect(tRect.x, tRect.y, tRect.width, tRect.height);
			}
			if (color.getStroked()) {
				g.setColor(color.getStrokedColor());
				g.drawRect(tRect.x, tRect.y, tRect.width, tRect.height);
			}
		}
		g.drawString(st.getText(), st.getLoc().x, st.getLoc().y);
	}

	public void visitCollection(SCollection sco) {
		// TODO Auto-generated method stub
		for (Iterator it = sco.liste.iterator(); it.hasNext();)
			((Shape) it.next()).accept(this);
	}

}
