package SpingFramework;

public class Car {
	
	public void drive() {
		
		Engine eng = new Engine();
		int result = super.start();
		
		if(result>=1) {
			System.out.println("Journey Started Successfully");
		}
		else {
			System.out.println("Engine has some problems");
		}

	}

}
