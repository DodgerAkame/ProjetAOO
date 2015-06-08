package graphics.shapes.attributes;

public class SelectionAttributes extends Attributes {

	// Public car ce param�tre doit �tre accessible aux autres classes, Static
	// car il s'agit d'une valeur par d�faut

	public static final String ID = "Selection";
	private boolean selected = false;

	public String getId() {
		return ID;
	}

	public boolean isSelected() {
		return selected;
	}

	public void select() {
		selected = true;
	}

	public void unselect() {
		selected = false;
	}

	public void toggleSelection() {
		selected = !selected;
	}

}
