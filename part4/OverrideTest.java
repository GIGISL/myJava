package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        //upcasting
        Animal ani = new Dog();
        ani.eat(); //---> Animal---(동적바인딩-->Dog)

        ani = new Cat();
        ani.eat();

    }
}
