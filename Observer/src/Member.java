public class Member extends Observer {
    public Member(String name){
        this.name = name;
    }

    @Override
    public void subscribe(Subject subject) {
        if (this.subject != null){
            unsubscribe();
        }
        this.subject = subject;
        this.subject.registerMember(this);
    }

    @Override
    public void unsubscribe() {
        this.subject.removeMember(this);
        this.subject = null;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " got message: " + message);
    }
}
