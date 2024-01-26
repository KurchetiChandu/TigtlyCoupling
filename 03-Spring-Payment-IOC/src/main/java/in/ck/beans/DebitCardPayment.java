package in.ck.beans;

public class DebitCardPayment implements IPayment  {
public DebitCardPayment() {
	System.out.println("DCC::Constructor");
}
	@Override
public boolean processPayment(double billAmt) {
	System.out.println("DebitCard Paymnet Processed...");
	return true;
}	
	

}
