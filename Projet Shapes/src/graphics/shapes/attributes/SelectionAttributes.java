package graphics.shapes.attributes;

public class SelectionAttributes extends Attributes {

	private boolean selected;
	
	public static final String ID="selected";

	public SelectionAttributes() {
		this.selected = false;
	}

	public boolean isSelected() { // Demande si la figure est selectionnee
		return selected;
	}

	public void select() { // Selectionne la figure
		this.selected = true;
	}

	public void deselect() { // Deselectionne la figure
		this.selected = false;
	}

	public void toggleSelection() {
		if (this.selected == false) this.selected = true;
		this.selected = false;
	}
	
	public String getID(){
		return ID;
	}
}
