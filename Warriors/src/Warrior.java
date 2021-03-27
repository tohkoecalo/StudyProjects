public abstract class Warrior {
    protected int health;
    protected Weapon weapon;
    protected String name;

    public Warrior(){}

    public abstract int nextHitDamage();
    public abstract void getDamage(int damage);

    public void setNewWeapon(Weapon newWeapon){
        weapon = newWeapon;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){ return health; }

    public boolean isAlive(){
        return health > 0;
    }
}
