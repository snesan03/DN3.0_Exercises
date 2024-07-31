package notifier;

public class SlackNotifierDecorator extends NotifierDecorator{

	public SlackNotifierDecorator(Notifier notifier) {
		super(notifier);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		super.send(msg);
		System.out.println("Notification of "+msg+" is sent to the slack");
	}
	
}
