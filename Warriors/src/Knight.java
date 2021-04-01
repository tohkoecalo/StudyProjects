public class Knight extends Warrior {
    public Knight() {
        super();
        weapon = new Sword();
        name = "Knight";
        health = 110;
    }

    @Override
    public void getDamage(int damage) {
        health -= (int)(damage * 1.1);
    }
}
