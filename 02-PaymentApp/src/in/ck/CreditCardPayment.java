package in.ck;

public class CreditCardPayment implements IPayment {
@Override
public boolean processPayment(double billAmt) {
	System.out.println("CreditCardPayment processed..");
	return true;
}
}
