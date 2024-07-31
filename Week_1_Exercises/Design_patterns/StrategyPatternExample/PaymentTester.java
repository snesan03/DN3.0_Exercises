package paymentsystem;

public class PaymentTester {
	public static void main(String[] args) {
		PaymentContext pc=new PaymentContext();
		pc.executePayment(100);
		pc.setPaymentStartegy(new CreditCardPayment());
		pc.executePayment(1000);
		pc.setPaymentStartegy(new PayPalPayment());
		pc.executePayment(10000);
		
	}
}
