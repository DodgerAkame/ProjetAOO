package graphics.shapes;

public interface ShapeVisitor {
	
	public void visitRectangle(SRectangle s);
	public void visitCircle(SCircle s);
	public void visitText(SText s);
	public void visitCollection(SCollection s);

}
