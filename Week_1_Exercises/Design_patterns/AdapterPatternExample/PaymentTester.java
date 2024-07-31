package payment.adapter;
import payment.gateway.*;
import payment.integration.*;

public class PaymentTester {
	public static void main(String[] args) {
		Gpay gpay=new Gpay();
		GpayAdapter gpayAdapter= new GpayAdapter(gpay);
		gpayAdapter.processPayment(1000);
		PhonePeAdapter phonePeAdapter=new PhonePeAdapter(new PhonePe());
		phonePeAdapter.processPayment(100);
		PaytmAdapter paytmAdapter=new PaytmAdapter(new Paytm());
		paytmAdapter.processPayment(7660);
	}
}
