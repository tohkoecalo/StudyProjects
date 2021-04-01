public abstract class Observer{
    protected Subject subject = null;
    protected String name;

    public void subscribe(Subject subject){
        if (this.subject != null){
            unsubscribe();
        }
        this.subject = subject;
        this.subject.registerMember(this);
    }
    public void unsubscribe(){
        this.subject.removeMember(this);
        this.subject = null;
    }

    public abstract void update(String message);

    public String sendMessage(){ return name + " sent a massage"; }

    public String getName(){
        return name;
    }
}
