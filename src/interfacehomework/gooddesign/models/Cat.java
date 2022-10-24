package interfacehomework.gooddesign.models;

public class Cat extends Animal implements IRunnable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Ben " + getName() + ", koşabiliyorum.");
    }
}
