public class Viking extends Warrior {
    public Viking(int health) {
        super(health);
        weapon = new Mace();
        name = "Viking";
    }

    @Override
    public int nextHitDamage() {
        switch (weapon.getName()) {
            case "Mace":    return (int)(weapon.getDamage() * 1.2);
            case "Sword":   return (int)(weapon.getDamage() * 0.8);
            case "Bow":     return weapon.getDamage();
            default:        return 0;
        }
    }

    @Override
    public void getDamage(Weapon weapon) {

    }
}