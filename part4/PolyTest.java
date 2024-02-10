package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        Animal C = new Cat();
        Animal D = new Dog();
        D.eat();
        C.eat();
        ((Cat)C).night();
    }
}
