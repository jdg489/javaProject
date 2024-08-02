package test240711.object2_1;

public class TV {
	
	String name;
	int year;
	int num;
	int price;
	
	public TV(String name, int year, int num, int price) {
		super();
		this.name = name;
		this.year = year;
		this.num = num;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println();
	}
	
}
