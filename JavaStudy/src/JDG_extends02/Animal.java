package JDG_extends02;

public abstract class Animal {
	private String location;
	private String name;
	
	public Animal() {
		super();
	}
	
	public Animal(String location, String name) {
		super();
		this.location = location;
		this.name = name;
	}

	

	@Override
	public String toString() {
		return location + "에는" + name + "(이)가 ";
	}

	public abstract void fam();
}
