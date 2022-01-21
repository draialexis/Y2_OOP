package poo.tp.premierspas;
// 1)

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new RuntimeException("please enter an argument");
        }
        System.out.println("Hello " + args[0] + "!");
    }
}

// 2) javac Hello.java --> <Hello.class>
// a bytecode class file that runs on the JVM

// 3) java Hello --> Hello World!

// 4) "-d" enables us to specify the output directory
// package statement helps us define the structure of our project, and earmark specific files according to it
// javac -d build src/poo/tp/premierspas/*.java --> build/<Hello.class>
// java -cp build poo.tp.premierspas.Hello ---> Hello World!
// "-cp" helps us specify the location of classes and packages. classpath...

