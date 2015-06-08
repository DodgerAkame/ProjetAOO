package graphics.shapes.attributes;

public class Attributes {

	private String ID;
	private final static String DEFAULT_ID = "default";

	public Attributes() {
		this.ID = DEFAULT_ID;
	}

	public Attributes(String ID) {
		this.ID = ID;
	}

	public String getId() {
		return ID;
	}

}
