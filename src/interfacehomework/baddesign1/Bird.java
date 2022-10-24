package interfacehomework.baddesign1;

public class Bird implements Animal{
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
