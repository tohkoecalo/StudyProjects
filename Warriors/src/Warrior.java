public abstract class Warrior {
    protected int health;
    protected Weapon weapon;
    protected String name;

    public Warrior(int health){
        this.health = health;
    }

    public abstract int nextHitDamage();
    public abstract void getDamage(Weapon weapon);

    public void setNewWeapon(Weapon newWeapon){
        weapon = newWeapon;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public String getName(){
        return name;
    }

    public boolean isAlive(){
        return health > 0;
    }
}
