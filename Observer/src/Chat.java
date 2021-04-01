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
    public void notifyMembers(String message){
        for (Observer member : members){
            member.update(message);
        }
    }
}
