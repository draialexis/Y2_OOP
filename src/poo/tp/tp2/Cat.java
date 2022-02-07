package poo.tp.tp2;

public class Cat extends Animal
{
    // ex1q2

    @Override
    public String toString()
    {
        return "Cat{" + "name='" + this.getName() + "'}";
    }

    public Cat(String name)
    {
        super(name);
    }

    // ex1q5
    public void meow()
    {
        System.out.println("meow.");
    }
}
