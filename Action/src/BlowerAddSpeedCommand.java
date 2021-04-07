public class BlowerAddSpeedCommand extends Command{
    private Blower blower;

    public BlowerAddSpeedCommand(Blower blower){
        this.blower = blower;
    }

    @Override
    public void execute() {
        if (blower.currentSpeed == BlowerSpeed.Slow){
            blower.setVolume(BlowerSpeed.Medium);
        } else
        if (blower.currentSpeed == BlowerSpeed.Medium){
            blower.setVolume(BlowerSpeed.Hard);
        } else
        if (blower.currentSpeed == BlowerSpeed.Hard){
            System.out.println("Blower is already on the hardest speed");
        }
    }

    @Override
    public void revertPreviousCommand() {
        blower.setVolume(blower.lastSpeed);
    }
}
