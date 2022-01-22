package poo.tp.premierspas;

import java.util.Random;

public class GuessingGame {
    int a;
    int b;
    int x;

    public GuessingGame(int a, int b) {
        if (a >= b) {
            throw new RuntimeException("please ensure that int#1 < int#2");
        }
        this.a = a;
        this.b = b;
        Random rdm = new Random();
        this.x = rdm.nextInt(b) + a;
    }

    void run() {
        int guess;
        System.out.println("you can enter 'q' to quit at any point");
        while (true) {
            String input = System.console().readLine("guess within [" + a + ", " + b + "] >: ");

            try {
                guess = Integer.parseInt(input);
                if (guess == x) {
                    System.out.println("YOU WIN!");
                    break;
                }
                if (guess > x) {
                    System.out.println("lower");
                }
                if (guess < x) {
                    System.out.println("higher");
                }
                if (guess < a || guess > b) {
                    System.out.println("the bounds are [" + a + ", " + b + "]");
                }
            } catch (NumberFormatException e) {
                System.out.println(e + "is not a valid int, try again");
            }

            if (input.equals("q")) {
                break;
            }
        }
    }
}
