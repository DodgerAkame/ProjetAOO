package graphics.shapes.attributes;

public class SelectionAttributes extends Attributes{

	public SelectionAttributes() {
		super("SelectionAttributes");
	}

	private boolean selected=false;
	
	public boolean isSelected(){
		return this.selected;
	}
	
	public void select(){
		this.selected=true;
	}
	
	public void unselect(){
		this.selected=false;
	}
	
	public void toggleSelection(){
		this.selected=!selected;
	}
	
}
