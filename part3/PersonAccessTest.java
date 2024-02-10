package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        //q. Person 클래스에 이름, 나이, 전화번호를 저정하고출력하세요.
        Person p = new Person();
        p.name="장재형";
        p.age = 1000;
        p.phone="01089376906";
        System.out.println(p.name+"\t"+p.age+"\t"+ p.phone);
        //나이에 이상한 값 저장 할 수 있으니 접근제한잘 ㅗ막아야 한다!
    }
}
