package Interface.ex1;

public class Dog implements Animal{

	@Override
	public void move() {
		System.out.println("촐랑촐랑 뛰어다닌다.");
		
	}

	public void eat() {
		System.out.println("촵촵촵 먹는다.");
		
	}

	public void makeSound() {
		System.out.println("멍멍 ~ 멍멍~");
		
	}
	
}
