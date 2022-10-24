package interfacehomework.gooddesign.models;

public class Bird extends Animal implements IFlyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Ben " + getName() + ", uçabiliyorum.");
    }
}
