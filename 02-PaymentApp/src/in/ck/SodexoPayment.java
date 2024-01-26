package in.ck;

public class SodexoPayment implements IPayment {
	@Override
	public boolean processPayment(double billAmt) {
System.out.println("Sodexo Processed...");
		return true;
	}
	
	

}
