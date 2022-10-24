package interfacehomework.gooddesign;

import interfacehomework.gooddesign.models.Bird;
import interfacehomework.gooddesign.models.Cat;
import interfacehomework.gooddesign.models.Dog;

public class Main {
    public static void main(String[] args) {
        Bird tweety = new Bird("Tweety");
        tweety.fly();

        Dog scoobyDoo = new Dog("Scooby Doo");
        scoobyDoo.bark();
        scoobyDoo.run();

        Cat garfield = new Cat("Garfield");
        garfield.run();
    }
}
