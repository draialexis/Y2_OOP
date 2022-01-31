package poo.tp.tp2;

public abstract class Animal {
    // ex1q1
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + "'}";
    }

    protected Animal(String name) {
        this.name = name;
    }
}
