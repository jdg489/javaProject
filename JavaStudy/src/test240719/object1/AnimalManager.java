package test240719.object1;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] animalArr = new Animal[5];
		
		animalArr[0] = new Dog("검둥이", "시고르자브종", 15);
		animalArr[1] = new Dog("흰둥이", "시고르자브종", 13);
		animalArr[2] = new Dog("누렁이", "시고르자브종", 10);
		animalArr[3] = new Cat("럭키", "미니","우리집", "검은색");
		animalArr[4] = new Cat("비키", "마니","우리집", "하얀색");
		
		for(Animal ani : animalArr) {
			ani.speak();
		}
	}
}
