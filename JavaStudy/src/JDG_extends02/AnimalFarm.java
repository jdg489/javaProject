package JDG_extends02;

public class AnimalFarm {
	public static void main(String[] args) {
		Animal[] animalArr = new Animal[8];
		
		animalArr[0] = new Hen("닭장속"," 암탉","꼬꼬댁");
		animalArr[1] = new Goose("문간 옆"," 거위","꽥꽥꽥");
		animalArr[2] = new Goat("배나무 밑"," 염소","음~메~");
		animalArr[3] = new Cow("외양간"," 소","음메~");
		animalArr[4] = new Cuckoo("깊은산 속"," 뻐꾸기","뻐꾹 뻐꾹");
		animalArr[5] = new Lark("높은 하늘"," 종달새","짹쨱 짹쨱");
		animalArr[6] = new Cat("부뚜막 위"," 고양이","야옹");
		animalArr[7] = new Dog("마루 밑"," 강아지","멍멍");

		
		
		for(Animal ani : animalArr) {
			ani.fam();
		}
	}
}
