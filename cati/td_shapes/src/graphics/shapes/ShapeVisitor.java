package graphics.shapes;

public interface ShapeVisitor {

	// C'est aupr�s de cette classe que les Shapes s'identifient pour �tre
	// dessin�es correctement.

	void visitRectangle(SRectangle rectangle);

	void visitCircle(SCircle circle);

	void visitText(SText text);

	void visitCollection(SCollection collection);

}
