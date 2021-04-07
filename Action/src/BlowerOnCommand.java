public class BlowerOnCommand extends Command {
    private Blower blower;

    public BlowerOnCommand(Blower blower){
        this.blower = blower;
    }

    @Override
    public void execute() {
        blower.on();
    }

    @Override
    public void revertPreviousCommand() {
        blower.off();
    }
}
