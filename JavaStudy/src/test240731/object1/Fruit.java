package test240731.object1;

public class Fruit extends Farm{
	private String name;

	public Fruit() {
		super();
	}

	public Fruit(String kind, String name) {
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
		return "Fruit [name=" + name + "]";
	}

	public int hashCode() {
		return 0;
	}
	
	public boolean equals() {
		return true;
	}
	
}
