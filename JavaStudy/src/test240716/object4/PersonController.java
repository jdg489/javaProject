package test240716.object4;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e =  new Employee[10];
	
	public int[] personCount() {
		int[] countArr = new int[2];
		
		int studentCount = 0, employeeCount = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				break;
			}
			studentCount++;
		}
		for(Employee emp : e) {
			if(emp == null) {
				break;
			}
			employeeCount++;
		}
		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return null;
	}
	
	public void insertStudent(String name, int age, double height, 
			double weight, int grade, String major) {
		
	}
	
	public Student[] printStudent() {
		return null;
	}
	
	public void insertEmployee(String name, int age, double height, 
			double weight, int salary, String dept) {
		
	}
	
	public Employee printEmployee() {
		return null;
	}
}
