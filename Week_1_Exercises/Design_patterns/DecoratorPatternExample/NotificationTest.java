package notifier;

public class NotificationTest {
	public static void main(String[] args) {
		Notifier not=new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
		not.send("Hi");
	}
	


}
