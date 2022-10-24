package interfacehomework.baddesign1;

public class Dog implements Animal {
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
