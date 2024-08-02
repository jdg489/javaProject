package test240719.object2;

public class Secretary extends Employee implements Bouns{

	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return this.getSalary() * 0.1;
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		super.setSalary((int)(super.getSalary()* 0.8));
	}

}
