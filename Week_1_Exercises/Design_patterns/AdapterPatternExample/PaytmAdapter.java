package payment.adapter;

public class PaytmAdapter implements PaymentProcessor{
	private Paytm paytm;
	
	

	public PaytmAdapter(Paytm paytm) {
		super();
		this.paytm = paytm;
	}



	@Override
	public void processPayment(double money) {
		// TODO Auto-generated method stub
		paytm.makePayment(money);
	}
	
}
