package Soccer;

public class Member {
	private String name;
	private String pw;
	private String em;
	
	public Member() {
		super();
	}

	public Member(String name, String pw, String em) {
		super();
		this.name = name;
		this.pw = pw;
		this.em = em;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", pw=" + pw + ", em=" + em + "]";
	}
	
	
}
