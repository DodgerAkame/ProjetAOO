package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class SRectangle extends Shape {
	private Rectangle rect;
	
	public SRectangle() {
		super();
		rect= new Rectangle(0,0,0,0);
	}
	public SRectangle(Point point, int i, int j) {
		rect= new Rectangle(point.x,point.y,i,j);
	}
	public Point getLoc(){
		return rect.getLocation(); //modifier pour retourner une copie
	}
	public Rectangle getRect() {
		return rect;
	}
	public void setLoc(Point p){
		rect.setLocation(p);
	}
	public void translate(int xt,int yt){
		rect.translate(xt, yt);
	}
	public Rectangle getBounds(){
		return rect.getBounds();
	}
	public void accept(ShapeVisitor sv) {
		sv.visitRectangle(this);
	}

}
