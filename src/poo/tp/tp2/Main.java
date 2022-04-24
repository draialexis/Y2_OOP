package poo.tp.tp2;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Dog    medor = new Dog("Medor");
        Animal felix = new Cat("Felix");
        System.out.println(medor);
        System.out.println(felix);

        medor.woof();
        //        felix.meow();
        ((Cat) felix).meow();
        //        medor.meow();
        //        ((Cat)medor).meow();

        Word word = new Word();
        word.afficheVoyelles();
        System.out.println("isPalindrome = " + word.isPalindrome());

        Word wordCandidate = new Word();
        System.out.println("isContained = " + word.isContainedIn(wordCandidate));
        char[] arr = wordCandidate.getContent().toCharArray();
        Arrays.sort(arr);
        System.out.println("sorted = " + new String(arr));

    }
}
