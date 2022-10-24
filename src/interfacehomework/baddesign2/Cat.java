package interfacehomework.baddesign2;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void bark() {
        // Gereksiz override edilen metod kedi havlayamaz
    }

    @Override
    public void fly() {
        // Gereksiz override edilen metod kedi uçamaz
    }

    @Override
    public void run() {

    }
}
