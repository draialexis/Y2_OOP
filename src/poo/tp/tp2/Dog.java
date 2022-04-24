package poo.tp.tp2;

public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    public void woof()
    {
        System.out.println("woof");
    }

    @Override
    public String toString()
    {
        return String.format("Dog{name=%s}", this.getName());
    }
}
