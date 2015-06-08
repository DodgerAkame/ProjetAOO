package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;

import graphics.shapes.attributes.Attributes;

public abstract class Shape {
	private Map<String, Attributes> attributes;
	
	public Shape(){
		attributes=new HashMap<String, Attributes>();
	}
	
	public void addAttributes(Attributes attr){
		attributes.put(attr.getId(), attr);
	}
	
	public Attributes getAttributes(String id){
		return (Attributes) attributes.get(id);
	}
	
	public abstract Point getLoc();
	public abstract void setLoc(Point p);
	public abstract void translate(int xt,int yt);
	public abstract Rectangle getBounds();
	public abstract void accept(ShapeVisitor sv);
	
}
