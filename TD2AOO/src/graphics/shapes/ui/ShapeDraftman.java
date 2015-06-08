package graphics.shapes.ui;

import java.awt.Graphics;
import java.util.Iterator;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.shapes.SText;
import graphics.shapes.Shape;
import graphics.shapes.ShapeVisitor;
import graphics.shapes.attributes.ColorAttributes;

public class ShapeDraftman implements ShapeVisitor {

	public ColorAttributes DEFAULTCOLORATTRIBUTES; 
	private Graphics g;
	
	public void visitRectangle(SRectangle s) {
		ColorAttributes fc = (ColorAttributes) s.getAttributes("ColorAttributes");
		if(fc.isFilled()) {
			g.setColor(fc.getFilledColor());
		}
		g.drawRect(s.getRect().x, s.getRect().y, s.getRect().width, s.getRect().height);
		if(fc.isStroked()) {
			g.setColor(fc.getStrokedColor());
			g.fillRect(s.getRect().x, s.getRect().y, s.getRect().width, s.getRect().height);
		}
	}

	public void visitCircle(SCircle s) {
		ColorAttributes fc = (ColorAttributes) s.getAttributes("ColorAttributes");
		if(fc.isFilled()) {
			g.setColor(fc.getFilledColor());
		}
		g.drawOval(s.getLoc().x,s.getLoc().y,s.getRadius(),s.getRadius());
		if(fc.isStroked()) {
			g.setColor(fc.getStrokedColor());
			g.fillOval(s.getLoc().x,s.getLoc().y,s.getRadius(),s.getRadius());
		}
	}
	
	public void visitCollection(SCollection s) {
		Iterator<Shape> i=s.iterator();
		while(i.hasNext()){
			i.next().accept(this);
		}
	}
	public void visitText(SText s) {

	}

	public void setGraphics(Graphics g) {
		this.g = g;
	}

}
