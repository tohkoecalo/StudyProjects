public class Archer extends Warrior {

    public Archer(int health) {
        super(health);
        weapon = new Bow();
        name = "Archer";
    }

    @Override
    public int nextHitDamage() {
        switch (weapon.getName()) {
            case "Bow":     return (weapon.getDamage() * 2);
            case "Mace":    return (int)(weapon.getDamage() * 0.5);
            case "Sword":   return (int)(weapon.getDamage() * 0.7);
            default:        return 0;
        }
    }

    @Override
    public void getDamage(Weapon weapon) {

    }
}
