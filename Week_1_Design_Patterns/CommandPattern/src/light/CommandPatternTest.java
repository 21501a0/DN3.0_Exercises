package light;

public class CommandPatternTest {
    public static void main(String[] args) {
        Light roomLight = new Light();

        Command turnOnLight = new LightOnCommand(roomLight);
        Command turnOffLight = new LightOffCommand(roomLight);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnLight);
        remoteControl.pressButton();
        System.out.println();

        remoteControl.setCommand(turnOffLight);
        remoteControl.pressButton();
    }
}
