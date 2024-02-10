package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // animal --> dog, cat 이 있다 .
        //up캐스팅은
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();   // 부모가 자식에게 먹는 행위를 시킴.
        //ani.eat은 동일한 메세지를 보낸다.
        //그러나 각 자식의 반응은 "다르다" ->다형성
        Cat c = (Cat)ani;  // 다운캐스팅
        c.night();          //실행된다 ?!
        ((Cat)ani).night();

    }
}
