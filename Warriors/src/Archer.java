public class Archer extends Warrior {
    public Archer() {
        super();
        weapon = new Bow();
        name = "Archer";
        health = 100;
    }

    @Override
    public void getDamage(int damage) {
        health -= damage;
    }
}
