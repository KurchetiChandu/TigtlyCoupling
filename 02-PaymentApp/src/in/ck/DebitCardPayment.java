package in.ck;

public class DebitCardPayment implements IPayment{
	
@Override
public boolean processPayment(double billAmt) {
System.out.println("DebitCardPayment Processed");
	return true;
}
}
