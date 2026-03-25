public class Remote {

    Command[] commands;

    public Remote(int numberOfSlots) {
        commands = new Command[numberOfSlots];
    }   

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        commands[slot].execute();
    }

    public void pressUndoButton(int slot) {
        commands[slot].undo();
    }
}
