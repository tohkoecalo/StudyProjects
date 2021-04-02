public class BlowerOffCommand extends Command {
    private Blower blower;

    public BlowerOffCommand(Blower blower){
        this.blower = blower;
    }

    @Override
    public void execute() {
        blower.off();
    }
}
