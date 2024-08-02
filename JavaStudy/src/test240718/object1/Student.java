package test240718.object1;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {
		super();
	}

	public Student(String name, int age, double height, double weight, int grde, String major) {
		super(name, age, height, weight);
		this.grade = grde;
		this.major = major;
	}

	public int getGrde() {
		return grade;
	}

	public void setGrde(int grde) {
		this.grade = grde;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [grde=" + grade + ", major=" + major + "]";
	}
	
	
}
