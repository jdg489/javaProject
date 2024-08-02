package JDG_object4;

public class Run {
	public static void main(String[] args) {
		
		Employee em = new Employee();
		
		em.setEmpNo(50);
		em.setEmpName("조동근");
		em.setDept("개발부");
		em.setJob("인턴");
		em.setAge(25);
		em.setGender('남');
		em.setSalary(270);
		em.setBonusPoint(0.05);
		em.setPhone("010-1234-5678");
		em.setAddress("서울시 강남구");
		
		System.out.print("점수 :" + em.getEmpNo());
		System.out.print("/이름 :" + em.getEmpName());
		System.out.print("/부서 :" + em.getDept());
		System.out.print("/직급 :" + em.getJob());
		System.out.print("/나이 :" + em.getAge());
		System.out.print("/성별 :" + em.getGender());
		System.out.print("/월급 :" + em.getSalary());
		System.out.print("/포인트 :" + em.getBonusPoint());
		System.out.print("/전화번호 :" + em.getPhone());
		System.out.print("/주소 :" + em.getAddress());
	}
}
