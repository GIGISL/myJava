package fc.java.poly;


public class AbstractClassTest {
    public static void main(String[] args) {
        //추상클래스는 단독으로 객체ㅡㄹ 생서ㅗㅇ하ㅓㄹ 수 없다
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani=new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
