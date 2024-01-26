package in.ck;
//Target class
public class Car {
	/*  
	  // Field injection
	   If we take the variable is non-private
	       IEngine eng;
	    */
	private IEngine eng;// = new DieselEngine(); --> gives Tightly coupling
	/* 
	 //constructor Injection//
	  * public Car(IEngine eng) {
		this.eng= eng;
		} */
	//Setter injection
	public void setEng(IEngine eng){
		this.eng =eng;
	}
	
	public void drive() {
		 int status = eng.start();
		 if(status>=1) {
			 System.out.println("Journey started");
		 }else {
			 System.out.println("Engine in Trobule");
		 }
	}

}
