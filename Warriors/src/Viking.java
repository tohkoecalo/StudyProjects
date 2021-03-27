public class Viking extends Warrior {
    public Viking() {
        super();
        health = 90;
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
    public void getDamage(int damage) {
        health -= (int)(damage * 0.9);
    }
}
