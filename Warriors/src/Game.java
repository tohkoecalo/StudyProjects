import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static int readPlayerChose(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;
        boolean isCorrect = false;
        while (!isCorrect) {
            isCorrect = true;
            try {
                input = Integer.parseInt(br.readLine());
            } catch(NumberFormatException | IOException e) {
                System.err.println("Invalid input format");
                isCorrect = false;
            }
            if (input <= 0 || input > 3){
                System.err.println("Invalid input value");
                isCorrect = false;
            }
            if (!isCorrect){
                System.out.print("Try again to enter a value: ");
            }
        }
        return input;
    }

    public static Warrior getWarriorByChose(int chose){
        Warrior playerChose = new DefaultWarrior();
        switch (chose){
            case 1: playerChose = new Archer();
                System.out.println("Archer chosen");
                break;
            case 2: playerChose = new Viking();
                System.out.println("Viking chosen");
                break;
            case 3: playerChose = new Knight();
                System.out.println("Knight chosen");
                break;
        }
        return playerChose;
    }

    public static Weapon getWeaponByChose(int chose){
        Weapon newWeapon = new DefaultWeapon();
        switch (chose){
            case 1: newWeapon = new Bow();
                System.out.println("Bow chosen");
                break;
            case 2: newWeapon = new Mace();
                System.out.println("Mace chosen");
                break;
            case 3: newWeapon = new Sword();
                System.out.println("Sword chosen");
                break;
        }
        return newWeapon;
    }

    public static void play(){
        System.out.print("Player 1, choose warrior!\n1: Archer\n2: Viking\n3: Knight\nEnter your chose: ");
        int firstPlayerChose = readPlayerChose();
        Warrior firstPlayer = getWarriorByChose(firstPlayerChose);
        System.out.println();
        System.out.print("Player 2, choose warrior!\n1: Archer\n2: Viking\n3: Knight\nEnter your chose: ");
        int secondPlayerChose = readPlayerChose();
        Warrior secondPlayer = getWarriorByChose(secondPlayerChose);
        System.out.println();

        while (firstPlayer.isAlive() && secondPlayer.isAlive()){
            System.out.print("Player 1, choose new weapon!\n1: Bow\n2: Mace\n3: Sword\nEnter your chose: ");
            firstPlayerChose = readPlayerChose();
            firstPlayer.setNewWeapon(getWeaponByChose(firstPlayerChose));
            System.out.println();

            System.out.print("Player 2, choose new weapon!\n1: Bow\n2: Mace\n3: Sword\nEnter your chose: ");
            secondPlayerChose = readPlayerChose();
            secondPlayer.setNewWeapon(getWeaponByChose(secondPlayerChose));
            System.out.println();

            secondPlayer.getDamage(firstPlayer.nextHitDamage());
            firstPlayer.getDamage(secondPlayer.nextHitDamage());
            System.out.println("First player's health: " + firstPlayer.getHealth());
            System.out.println("Second player's health: " + secondPlayer.getHealth());
            System.out.println();
        }
        if (firstPlayer.isAlive()){
            System.out.println("Player 1 won!");
        } else {
            System.out.println("Player 2 won!");
        }
    }

    public static void main(String[] args) {
        play();
    }
}
