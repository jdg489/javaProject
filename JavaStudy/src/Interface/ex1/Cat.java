package Interface.ex1;

public class Cat implements Animal{

	@Override
	public void move() {
		System.out.println("사뿐사뿐 움직입니다.");
		
	}

	public void eat() {
		System.out.println("츄릅츄릅 먹습니다.");
		
	}

	public void makeSound() {
		System.out.println("야옹~ 야옹~");
		
	}

}
