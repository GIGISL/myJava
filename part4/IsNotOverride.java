package fc.java.part4;

import fc.java.poly.*;


public class IsNotOverride {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat(); // ?가 나오니 다형성을 보장하지 않는다ㅓ
        ani = new Cat();
        ani.eat(); // ?가 나오니 이것 또한 재정의 하지 안음
        //다형성을 보장하지 않음 -> 그러면 다형성을 보장하려면 어떻게 해야할까
        //재정의를 하도록 만들어 주며 ㄴ된다
        //추상클래스, 인터페이스 등장 !


    }

}
