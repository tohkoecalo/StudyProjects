public class GarageDoorUpCommand extends Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }
}
