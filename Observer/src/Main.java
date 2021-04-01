public class Main {
    public static void main(String[] args) {
        Subject chat = new Chat("Chat");
        Observer user1 = new Member("User 1");
        Observer user2 = new Member("User 2");

        user1.subscribe(chat);
        user2.subscribe(chat);

        chat.sendMessage(user1.sendMessage());
        chat.sendMessage(user2.sendMessage());

        user1.unsubscribe();
        user2.unsubscribe();
    }
}
