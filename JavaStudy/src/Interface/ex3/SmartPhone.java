package Interface.ex3;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker;

	public SmartPhone() {
		super();
	}
	
	public abstract String printlnformation();
		
	public String setMake(String  maker) {
		return this.maker =  maker;
	}
	
	public String getMaker() {
		return maker;
	}
}
