public class Member extends Observer {
    public Member(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " got message: " + message);
    }
}
