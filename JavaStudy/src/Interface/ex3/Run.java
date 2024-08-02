package Interface.ex3;

public class Run {
	public static void main(String[] args) {
		
		PhoneController phController = new PhoneController();
		
		String[] results = phController.method();
		
		for(String res : results) {
			System.out.println(res);
			System.out.println();
		}
	}
}	
