package poo.tp.premierspas;

public final class Hello
{
    private Hello()
    {
        throw new UnsupportedOperationException("Don't instantiate utility classes");
    }

    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.err.println("Give me your name");
            System.exit(1);
        }
        else
        {
            System.out.println("Hello " + args[0]);
        }
    }
}
