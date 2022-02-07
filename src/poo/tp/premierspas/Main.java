package poo.tp.premierspas;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args) throws IllegalAccessException
    {

        // q2
        if (args.length != 2)
        {
            throw new RuntimeException("please enter two int arguments (int#1 < int#2)");
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        GuessingGame game = new GuessingGame(a, b);
        game.run();

        // q3
        Date d1 = new Date(1, 3, 154);
        Date d2 = new Date(5, 3, 57);
        Date d3 = new Date(9, 3, 237);
        Date d4 = new Date(1, 3, 154);
        Date d5 = new Date(1, 4, 154);

        Date[] dates = new Date[]{d1, d2, d3, d4, d5};
        System.out.println(Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        // q4
        Date d6 = new Date(1, 3, 154);
        Date d7 = new Date(5, 3, 57);
        Date d8 = new Date(9, 3, 237);

        Personne p1 = new Personne("a", "A", 'm', d6);
        Personne p2 = new Personne("b", "B", 'm', d7);
        System.out.println(p1 + " & " + p2);
        p1.marry(p2, d8);
        System.out.println(p1 + " & " + p2);
    }
}
