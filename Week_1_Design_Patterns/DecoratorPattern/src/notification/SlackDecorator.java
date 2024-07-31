package notification;

public class SlackDecorator extends NotifierDoc {
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        Slack(message);
    }

    private void Slack(String message) {
        System.out.println("Sending Slack message with: " + message);
    }
}