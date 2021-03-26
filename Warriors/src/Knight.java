public class Knight extends Warrior {
    public Knight(int health) {
        super(health);
        weapon = new Sword();
        name = "Knight";
    }

    @Override
    public int nextHitDamage() {
        switch (weapon.getName()) {
            case "Sword":   return (int)(weapon.getDamage() * 1.2);
            case "Mace":    return (int)(weapon.getDamage() * 0.8);
            case "Bow":     return weapon.getDamage();
            default:        return 0;
        }
    }

    @Override
    public void getDamage(Weapon weapon) {

    }
}
