enum BlowerSpeed {
    Slow, Medium, Hard;
}

public class Blower {
    private BlowerSpeed currentSpeed = BlowerSpeed.Medium;
    private BlowerSpeed lastSpeed;

    public void on(){
        System.out.println("Blower is on");
    }

    public void off(){
        System.out.println("Blower is off");
    }

    public void setVolume(BlowerSpeed speed){
        lastSpeed = currentSpeed;
        currentSpeed = speed;
        System.out.println("Blower speed is set to " + speed);
    }

    public void revertLastAction(){
        currentSpeed = lastSpeed;
        System.out.println("Blower speed is reverted to " + currentSpeed);
    }
}
