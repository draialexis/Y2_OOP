package poo.tp.tp2;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    public void meow()
    {
        System.out.println("meow");
    }

    @Override
    public String toString()
    {
        return String.format("Cat{name=%s}", this.getName());
    }
}
