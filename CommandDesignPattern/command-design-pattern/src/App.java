public class App {
    public static void main(String[] args) throws Exception {
        Light light = new Light();
        Command lightCommand = new LightCommand(light);

        Fan fan = new Fan();
        Command fanCommand = new FanCommand(fan);

        Remote remoteControl = new Remote(2);

        remoteControl.setCommand(0, lightCommand);
        remoteControl.pressButton(0);
        remoteControl.pressUndoButton(0);

        remoteControl.setCommand(1, fanCommand);
        remoteControl.pressButton(1);
        remoteControl.pressUndoButton(1);
    }
}
