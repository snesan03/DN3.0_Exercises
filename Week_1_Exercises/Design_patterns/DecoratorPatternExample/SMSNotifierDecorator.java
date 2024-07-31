package notifier;

public class SMSNotifierDecorator extends NotifierDecorator{

	public SMSNotifierDecorator(Notifier notifier) {
		super(notifier);
		// TODO Auto-generated constructor stub
		
	}

	public void send(String msg) {
		super.send(msg);	
		// TODO Auto-generated method stub
		System.out.println("Notification of "+msg+" is sent to the sms");
	}
	
//	public void sendSms() {
//		System.out.println("Notifi");
//	}

}
