package notification;

public class App {
    public static void main(String[] args) throws Exception {
        Notifier mailnot = new EmailNotification();
        Notifier smsnot = new SmsDecorator(mailnot);
        Notifier slacknot= new SlackDecorator(smsnot);
        slacknot.send("Hello, this is a test message!");
    }
}