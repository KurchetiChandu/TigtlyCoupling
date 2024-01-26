package in.ck.beans;

public class CreditCardPayment implements IPayment{
public CreditCardPayment() {
	System.out.println("CCP::Constructor");
}
	@Override
public boolean processPayment(double billAmt) {
System.out.println("CreditCardPayment Processed...");
	return true;
}	

}
