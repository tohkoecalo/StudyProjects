public abstract class Observer{
    protected Subject subject;
    protected String name;

    public abstract void subscribe(Subject subject);
    public abstract void unsubscribe();
    public abstract void update(String message);

    public String getName(){
        return name;
    }
}
