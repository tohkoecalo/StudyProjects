import java.util.List;

public abstract class Subject {
    protected List<Observer> members;
    protected String name;

    public abstract void registerMember(Observer member);
    public abstract void removeMember(Observer member);
    public abstract void notifyMembers(String message);
    public abstract void sendMessage(String message);

    public String getName(){
        return  name;
    }
}

