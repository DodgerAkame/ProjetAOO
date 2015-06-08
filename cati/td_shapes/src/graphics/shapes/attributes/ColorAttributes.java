package graphics.shapes.attributes;

import java.awt.Color;

public class ColorAttributes extends Attributes {

	// Cet ID permet de regrouper les Attributes servant dans d'autre classes,
	// d'où son statut public
	// Attribut qui ne peut être modifié que par une méthode

	public final static String ID = "colors";

	// Permet de définir les couleurs de la Shape : Stroked = Contour, Filled =
	// Remplissage

	public Color strokedColor;
	public Color filledColor;
	public boolean filled = true;
	public boolean stroked = false;

	public ColorAttributes() {
		this.strokedColor = Color.BLACK;
		this.filledColor = Color.WHITE;
	}

	public ColorAttributes(boolean filled, boolean stroked, Color filledColor,
			Color strokedColor) {
		this.filled = filled;
		this.stroked = stroked;
		this.filledColor = filledColor;
		this.strokedColor = strokedColor;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Color getFilledColor() {
		return filledColor;
	}

	public void setFilledColor(Color filledColor) {
		this.filledColor = filledColor;
	}

	public boolean isStrocked() {
		return stroked;
	}

	public void setStrocked(boolean strocked) {
		this.stroked = strocked;
	}

	public Color getStrockedColor() {
		return strokedColor;
	}

	public void setStrockedColor(Color strockedColor) {
		this.strokedColor = strockedColor;
	}

	public String getId() {
		return ID;
	}

}
