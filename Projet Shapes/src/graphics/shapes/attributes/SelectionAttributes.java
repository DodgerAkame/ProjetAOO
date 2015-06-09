package graphics.shapes.attributes;

public class SelectionAttributes extends Attributes {

	private boolean selected=false;
	
	public static final String ID="selected";

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
		selected=!selected;
	}
	
	public String getId(){
		return ID;
	}
}
