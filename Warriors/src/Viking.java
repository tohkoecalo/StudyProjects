public class Viking extends Warrior {
    public Viking() {
        super();
        health = 90;
        weapon = new Mace();
        name = "Viking";
    }

    @Override
    public void getDamage(int damage) {
        health -= (int)(damage * 0.9);
    }
}
