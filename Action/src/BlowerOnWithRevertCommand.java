public class BlowerOnWithRevertCommand extends Command {
    private Blower blower;

    public BlowerOnWithRevertCommand(Blower blower){
        this.blower = blower;
    }

    @Override
    public void execute() {
        blower.on();
        blower.setVolume(BlowerSpeed.Hard);
        blower.revertLastAction();
    }
}
