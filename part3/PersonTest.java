package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        //한 사람의 데이터를 저장할 변수를 선언하세요.
        Person p;
        p = new Person();
        p.name = "장재형";
        p.age = 30;
        p.phone="010-8937-6906";

        System.out.println(p.age + "\t" + p.name+ "\t" +p.phone);
        p.play();
        p.eat();;
        p.walk();
    }
}
