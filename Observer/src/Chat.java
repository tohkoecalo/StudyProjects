import java.util.ArrayList;
import java.util.List;

public class Chat extends Subject {
    private List<String> messages;

    public Chat(String name){
        this.messages = new ArrayList<>();
        this.members = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerMember(Observer member){
        members.add(member);
        System.out.println(member.getName() + " joined");
    }

    @Override
    public void removeMember(Observer member){
        members.remove(member);
        System.out.println(member.getName() + " disconnected");
    }

    @Override
    public void notifyMembers(String message){
        for (Observer member : members){
            member.update(message);
        }
    }

    @Override
    public void sendMessage(String message) {
        notifyMembers(message);
    }
}
