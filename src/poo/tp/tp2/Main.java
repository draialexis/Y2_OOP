package poo.tp.tp2;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // ex1q3 : the overridden methods are called.
        // Without one, the superclass' methods would be used instead.

        Dog dog = new Dog("dog");
        Animal cat = new Cat("cat");
        System.out.println(dog);
        System.out.println(cat);

        // ex1q4
        dog.woof();

        // ex1q5 ... does that mean we instantiated an abstract class, or is that the
        // compiler / JVM showing their limits somewhat?
        // cat.meow();

        // ex1q6
        ((Cat) cat).meow();

        // ex1q7 ... why would we even try this?
        // dog.meow();

        // ex2q3
        Word word = new Word();
        word.afficheVoyelles();

        // ex2q4
        System.out.println("isPalidrome = " + word.isPalindrome());

        // ex2q5
        Word wordCandidate = new Word();
        System.out.println("isContained = " + word.isContainedIn(wordCandidate));

        // ex2q6
        char[] arr = wordCandidate.getContent().toCharArray();
        Arrays.sort(arr);
        System.out.println("sorted = " + new String(arr));
    }
}
