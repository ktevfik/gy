package interfacehomework.baddesign1;

public class Cat implements Animal {
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
