package in.ck;

public class Car extends Engine {
	public void drive() {
		 int status = super.start();
		 if(status>=1) {
			 System.out.println("Engine started");
		 }else {
			 System.out.println("Engine in Trobule");
		 }
	}

}
