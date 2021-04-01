import java.util.List;

public abstract class Subject {
    protected List<Observer> members;
    protected String name;

    public void registerMember(Observer member){
        members.add(member);
        System.out.println(member.getName() + " joined");
    }

    public void removeMember(Observer member){
        members.remove(member);
        System.out.println(member.getName() + " disconnected");
    }

    public abstract void notifyMembers(String message);

    public void sendMessage(String message){
        notifyMembers(message);
    }

    public String getName(){
        return  name;
    }
}

