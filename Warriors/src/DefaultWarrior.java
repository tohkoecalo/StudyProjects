public class DefaultWarrior extends Warrior {
    public DefaultWarrior() {
        super();
        name = "None";
        weapon = new DefaultWeapon();
        health = 0;
    }

    @Override
    public int nextHitDamage() {
        return 0;
    }

    @Override
    public void getDamage(int damage) {

    }
}
