package payment.adapter;


public class PhonePeAdapter implements PaymentProcessor{
	PhonePe phonePe;
	@Override
	public void processPayment(double money) {
		// TODO Auto-generated method stub
		phonePe.makePayment(money);
	}
	public PhonePeAdapter(PhonePe phonePe) {
		super();
		this.phonePe = phonePe;
	}
	
}
