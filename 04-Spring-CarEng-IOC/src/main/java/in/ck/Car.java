package in.ck;

public class Car {
private IEngine eng;
public Car() {
System.out.println("Car::0-param Constructor");
}
public Car(IEngine eng) {
this.eng =eng;
}

public void drive() {
	int status = eng.start();
	if(status>=1) {
		System.out.println("Journey started..");
	}else {
		System.out.println("Engine in Trouble");
	}
}
}
