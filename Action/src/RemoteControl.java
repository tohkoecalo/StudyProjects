import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private int countButtons;
    private List<Command> onCommands;
    private List<Command> offCommands;
    private Command noCommands;
    private Command lastCommand;


    public RemoteControl(int countButtons){
        this.countButtons = countButtons;
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();
        noCommands = new NoCommand();
        lastCommand = new NoCommand();

        for (int i = 0; i < countButtons; i++){
            onCommands.add(noCommands);
            offCommands.add(noCommands);
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        if (!onCommands.get(slot).equals(noCommands)){
            onCommands.remove(slot);
        }
        onCommands.set(slot, onCommand);
        if (!offCommands.get(slot).equals(noCommands)){
            offCommands.remove(slot);
        }
        offCommands.set(slot, offCommand);
    }

    public void onButtonWasPushed(int slot){
        onCommands.get(slot).execute();
        if (!onCommands.get(slot).equals(noCommands)){
            lastCommand = onCommands.get(slot);
        }
    }

    public void offButtonWasPushed(int slot){
        offCommands.get(slot).execute();
        if (!offCommands.get(slot).equals(noCommands)){
            lastCommand = offCommands.get(slot);
        }
    }

    public void revertButtonWasPushed(){
        lastCommand.revertPreviousCommand();
    }

    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl(7);
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        Blower blower = new Blower();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        BlowerOnCommand blowerOn = new BlowerOnCommand(blower);
        BlowerOffCommand blowerOff = new BlowerOffCommand(blower);
        BlowerAddSpeedCommand blowerAddSpeed = new BlowerAddSpeedCommand(blower);
        BlowerReduceVolumeCommand blowerReduceSpeed = new BlowerReduceVolumeCommand(blower);

        rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        rc.setCommand(1, kitchenLightOn, kitchenLightOff);
        rc.setCommand(2, garageDoorUp, garageDoorDown);
        rc.setCommand(3, stereoOnWithCD, stereoOff);
        rc.setCommand(4, blowerOn, blowerOff);
        rc.setCommand(5, blowerAddSpeed, blowerReduceSpeed);

        for (int i = 0; i < 7; i++){
            rc.onButtonWasPushed(i);
            rc.offButtonWasPushed(i);
        }
        rc.revertButtonWasPushed();
    }
}
