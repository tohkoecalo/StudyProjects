public class Bow extends Weapon {
    public Bow(){
        double hitProbability = Math.random();
        this.damage = (int)(20 * hitProbability);
        this.name = "Bow";
    }
}
