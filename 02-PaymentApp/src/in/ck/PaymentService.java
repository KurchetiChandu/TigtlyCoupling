package in.ck;

public class PaymentService {
	private IPayment pay;
	public PaymentService(IPayment pay) {
		this.pay = pay;
	}
	public void doPayment(double billAmt) {
		  boolean status = pay.processPayment(billAmt);
		  if(status){
			  System.out.println("Printing Recipt..");
		  }else {
			  System.out.println("Payment Declined..");
		  }
	}
}
