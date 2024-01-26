package in.ck;

public class Car{
	public void drive() {
		Engine e =new Engine();
		  int status = e.start();
		 if(status>=1) {
			 System.out.println("Engine started");
		 }else {
			 System.out.println("Engine in Trobule");
		 }
	}

}
