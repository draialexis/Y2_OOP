package poo.tp.old.tp2;

public abstract class Animal
{
    // ex1q1
    private final String name;

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return "Animal{" + "name='" + this.name + "'}";
    }

    protected Animal(String name)
    {
        this.name = name;
    }
}
