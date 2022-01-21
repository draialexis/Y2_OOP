package poo.tp.premierspas;
// 1)

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// 2) javac Hello.java --> <Hello.class>
// a bytecode class file that runs on the JVM

// 3) java Hello --> Hello World!

// 4) "-d" enables us to specify the output directory
// package statement helps us define the structure of our project, and earmark specific files according to it
// javac -d build src/poo/tp/premierspas/*.java --> build/<Hello.class>
// java -cp build Hello ---> Hello World!
// "-cp" helps us specify the location of classes and packages. classpath...

