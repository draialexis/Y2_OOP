package poo.tp.tp2;

public class Animal
{
    private final String name;

    public Animal(String name) {this.name = name;}

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return String.format("Animal{name=%s}", this.getName());
    }
}
