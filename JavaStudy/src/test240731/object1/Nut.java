package test240731.object1;

public class Nut extends Farm{
	private String name;

	public Nut() {
		super();
	}

	public Nut(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Nut [name=" + name + "]";
	}
	
	public int hashCode() {
		return 0;
	}
	
	public boolean equals() {
		return true;
	}
}
