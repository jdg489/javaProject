package JDG_extends02;

public class Goose extends Animal{
	private String sonud;

	public Goose() {
		super();
	}

	public Goose(String location, String name, String sonud) {
		super(location, name);
		this.sonud = sonud;
	}

	public String getSonud() {
		return sonud;
	}

	public void setSonud(String sonud) {
		this.sonud = sonud;
	}

	@Override
	public void fam() {
		String info = super.toString() + sonud;
		System.out.println(info);
		
	}
	
	
}
