package interfacehomework.gooddesign.models;

public class Dog extends Animal implements IBarkable, IRunnable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("Ben " + getName() + ", havlayabiliyorum.");
    }

    @Override
    public void run() {
        System.out.println("Ben " + getName() + ", koşabiliyorum.");
    }
}
