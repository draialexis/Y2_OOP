package poo.tp.premierspas;

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new RuntimeException("please enter two int arguments (int#1 < int#2)");
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a >= b) {
            throw new RuntimeException("please ensure that int#1 < int#2");
        }
        Random rdm = new Random();
        int x = rdm.nextInt(b) + a;
        int guess;
        System.out.println("you can enter 'q' to quit at any point");
        while (true) {
            String input = System.console().readLine(">: ");

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
