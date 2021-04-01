public class Main {
    public static void main(String[] args) {
        Subject chat = new Chat("Chat");
        Observer user1 = new Member("User 1");
        Observer user2 = new Member("User 2");

        user1.subscribe(chat);
        user2.subscribe(chat);

        chat.sendMessage("Hello");

        user1.unsubscribe();
        user2.unsubscribe();
    }
}
