package paymentsystem;

public class PaymentContext {
	PaymentStrategy paymentStartegy;

	public void setPaymentStartegy(PaymentStrategy paymentStartegy) {
		this.paymentStartegy = paymentStartegy;
	}

	public void executePayment(double amount) {
		if(paymentStartegy!=null) {
			paymentStartegy.pay(amount);
		}
		else {
			System.out.println("Please select any payment method");
		}
	}
	
}
