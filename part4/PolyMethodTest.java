package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        display(c);
        display(d);
        Animal ani = new Animal();
    }
//    public static void display(Dog d){
//        d.eat();
//    }
//    public static void display(Cat c){
//        c.eat();
//    }

    public static void display(Animal ani){
        ani.eat();
        //night 는 어쩌지?
        //cat 타입으로 받은 경우에만 night(); 실행하도록.
        //if문으로 받은 경우에 night();실행 !
        if(ani instanceof Cat){
            ((Cat) ani).night();
        }
    }
}
