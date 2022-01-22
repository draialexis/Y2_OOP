package poo.tp.premierspas;

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new RuntimeException("please enter two int arguments (int#1 < int#2)");
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        GuessingGame game = new GuessingGame(a, b);
        game.run();

    }
}
