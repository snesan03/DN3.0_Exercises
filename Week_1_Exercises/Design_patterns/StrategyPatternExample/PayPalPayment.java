package paymentsystem;

public class PayPalPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of "+amount+" is done through paypal");
	}
	

}
