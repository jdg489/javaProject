package JDG_extends02;

public class Cat extends Animal{
	private String sound;

	public Cat() {
		super();
	}

	public Cat(String location, String name, String sound) {
		super(location, name);
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public void fam() {
		String info = super.toString() + sound;
		System.out.println(info);
		
	}
	
	
}