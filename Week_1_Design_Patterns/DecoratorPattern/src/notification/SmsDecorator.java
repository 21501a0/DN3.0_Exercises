package notification;

public class SmsDecorator extends NotifierDoc {
    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        super.send(message);
        SMS(message);
    }
    private void SMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}