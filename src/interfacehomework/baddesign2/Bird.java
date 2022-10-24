package interfacehomework.baddesign2;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void bark() {
        // Gereksiz override edilen metod kuş havlayamaz
    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {
        // Gereksiz override edilen metod kuş koşamaz belki?devekuşu
    }
}
