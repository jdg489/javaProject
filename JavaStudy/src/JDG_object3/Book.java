package JDG_object3;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double disountRate;
	
	public Book() {
		super();
	}

	public Book(String title, String publisher, String author) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	public Book(String title, String publisher, String author, int price, double disountRate) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.disountRate = disountRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDisountRate() {
		return disountRate;
	}

	public void setDisountRate(double disountRate) {
		this.disountRate = disountRate;
	}
	
	public void inform() {
		System.out.println("제목 :" + this.title);
		System.out.println("출판사 :" + this.publisher);
		System.out.println("작가 :" + this.author);
		System.out.println("가격 :" + this.price);
		System.out.println("할인 :" + this.disountRate);
		
	}
}
