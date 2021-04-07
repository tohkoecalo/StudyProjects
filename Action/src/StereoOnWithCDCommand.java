public class StereoOnWithCDCommand extends Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void revertPreviousCommand() {
        stereo.setVolume(0);

    }
}
