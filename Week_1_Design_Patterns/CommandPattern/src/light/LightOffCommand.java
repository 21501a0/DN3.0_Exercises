package light;

public class LightOffCommand implements Command {
    private final Light lightSource;

    public LightOffCommand(Light lightSource) {
        this.lightSource = lightSource;
    }

    @Override
    public void execute() {
        turnOffLight();
    }

    private void turnOffLight() {
        lightSource.turnOff();
    }
}
