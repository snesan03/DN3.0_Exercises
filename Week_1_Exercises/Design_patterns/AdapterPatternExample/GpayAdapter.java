package payment.adapter;

public class GpayAdapter implements PaymentProcessor{
	private Gpay gpay;

	public GpayAdapter(Gpay gpay) {
		super();
		this.gpay = gpay;
	}

	@Override
	public void processPayment(double money) {
		// TODO Auto-generated method stub
		gpay.makePayment(money);
	}
}
