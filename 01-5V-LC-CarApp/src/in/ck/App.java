package in.ck;

public class App {
	public static void main(String[] args) {
		// for constructor injection Car c = new Car(new PetrolEngine());
		Car c = new Car();
		//for setter injection
		c.setEng(new DesielEngine());
		c.drive();
		/*
		 *  //For Field Injection
		 *  c.eng = new PetrolEngine();
		 */
	}

}
