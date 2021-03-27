public class Archer extends Warrior {
    public Archer() {
        super();
        weapon = new Bow();
        name = "Archer";
        health = 100;
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
    public void getDamage(int damage) {
        health -= damage;
    }
}
