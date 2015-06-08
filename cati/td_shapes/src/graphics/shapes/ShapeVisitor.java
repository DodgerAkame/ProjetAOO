package graphics.shapes;

public interface ShapeVisitor {

	// C'est auprès de cette classe que les Shapes s'identifient pour être
	// dessinées correctement.

	void visitRectangle(SRectangle rectangle);

	void visitCircle(SCircle circle);

	void visitText(SText text);

	void visitCollection(SCollection collection);

}
