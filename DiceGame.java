import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(6) + 1;
        int b = rand.nextInt(6) + 1;

        System.out.println("Rolling dice...");

        System.out.println("Die 1: " + a);

        System.out.println("Die 2: " + b);

        System.out.println("Total value: " + (a + b));

    }

}