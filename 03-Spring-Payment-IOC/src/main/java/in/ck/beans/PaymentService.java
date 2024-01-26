package in.ck.beans;

public class PaymentService {
	private IPayment payment;
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	public PaymentService() {
		System.out.println("PaymentService :: constructor");
	}
	public void doPayment(double billAmt) {
		   boolean status = payment.processPayment(billAmt);		
	if(status) {
		System.out.println("Recipt Printing..");
	}else {
		System.out.println("Card declined..");
	}
	
	}

}
