package notification;

public class EmailNotification implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }

}