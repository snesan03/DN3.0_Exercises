package paymentsystem;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of "+amount+" is done through Credit Card");
	}
	
	
}
