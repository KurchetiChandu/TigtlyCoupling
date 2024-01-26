package in.ck;

public class App {
	public static void main(String[] args) {
		PaymentService ps = new PaymentService(new CreditCardPayment());
		ps.doPayment(150.00);
	}

}
