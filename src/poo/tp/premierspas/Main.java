package poo.tp.premierspas;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {

        // q2
//        if (args.length != 2)
//        {
//            throw new RuntimeException("Guessing game: interval: please enter two int arguments (int#1 < int#2)");
//        }
//
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//
//        GuessingGame game = new GuessingGame(a, b);
//        game.run();

        // q3
        Date d1 = new Date(154, 3, 3);
        Date d2 = new Date(57, 3, 5);
        Date d3 = new Date(237, 3, 9);
        Date d4 = new Date(154, 3, 1);
        Date d5 = new Date(154, 4, 1);

        Date[] dates = new Date[]{d1, d2, d3, d4, d5};
        System.out.println(Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        // q4
        Date d6 = new Date(154, 3, 1);
        Date d7 = new Date(57, 3, 5);
        Date d8 = new Date(237, 3, 9);

        Personne p1 = new Homme("a", "A", null, null, d6, null, null);
        Personne p2 = new Femme("b", "B", null, null, d7, null, null);
        System.out.println(p1 + " & " + p2);
        p1.wed(p2, d8);
        System.out.println(p1 + " & " + p2);
    }
}
