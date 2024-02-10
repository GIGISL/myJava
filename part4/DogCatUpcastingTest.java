package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        //Dog객체를 사용해보자.
//        Dog d = new Dog();
//        d.eat();    내가 설계하지 않았을때는 무슨 동작이 들어있는지 모르므로 비추
        //Upcating을 써 보자!
        //부모가 자식을 가리킨다. 라고 보면 된다
        Animal ani = new Dog();
        ani.eat();   //->개처럼 먹다가 나와야 하는데?
        ani = new Cat();
        ani.eat(); //->고양이처럼 먹다가 나와야 화는데ㅐ?
    }
}
