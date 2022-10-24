package interfacehomework.baddesign2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {

    }

    @Override
    public void fly() {
        // Gereksiz override edilen metod köpek uçamaz
    }

    @Override
    public void run() {

    }
}
