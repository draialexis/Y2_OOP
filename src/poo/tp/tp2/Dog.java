package poo.tp.tp2;

public class Dog extends Animal
{
    // ex1q2

    @Override
    public String toString()
    {
        return "Dog{" + "name='" + this.getName() + "'}";
    }

    public Dog(String name)
    {
        super(name);
    }

    // ex1q4
    public void woof()
    {
        System.out.println("woof!");
    }
}
