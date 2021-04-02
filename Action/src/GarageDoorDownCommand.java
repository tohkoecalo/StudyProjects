public class GarageDoorDownCommand extends Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.down();
    }
}
