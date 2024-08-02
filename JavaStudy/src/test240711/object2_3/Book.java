package test240711.object2_3;

public class Book {
	
	private String titre;
	private String genre;
	private String writer;
	private int number;
	
	
	public Book(String titre, String genre, String writer, int number) {
		super();
		this.titre = titre;
		this.genre = genre;
		this.writer = writer;
		this.number = number;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
