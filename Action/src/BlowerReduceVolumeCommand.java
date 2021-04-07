public class BlowerReduceVolumeCommand extends Command {
    private Blower blower;

    public BlowerReduceVolumeCommand(Blower blower){
        this.blower = blower;
    }

    @Override
    public void execute() {
        if (blower.currentSpeed == BlowerSpeed.Slow){
            System.out.println("Blower is already on the lowest speed");
        } else
        if (blower.currentSpeed == BlowerSpeed.Medium){
            blower.setVolume(BlowerSpeed.Slow);
        } else
        if (blower.currentSpeed == BlowerSpeed.Hard){
            blower.setVolume(BlowerSpeed.Medium);
        }
    }

    @Override
    public void revertPreviousCommand() {
        blower.setVolume(blower.lastSpeed);
    }
}
