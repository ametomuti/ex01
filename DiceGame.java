import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(6) + 1;
        int b = rand.nextInt(6) + 1;
	Scanner sc =new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.next();

	System.out.println("Hello, "+name);

        System.out.println("Rolling dice...");

        System.out.println("Die 1: " + a);

        System.out.println("Die 2: " + b);

        System.out.println("Total value: " + (a + b));

    }

}
