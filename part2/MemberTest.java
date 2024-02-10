package fc.java.part2;

public class MemberTest {
    public static void main(String[] args) {
        Member h=new Member();

        h.name="홍길동";
        h.age=30;
        h.phone="010-1111-1111";
        h.email="fc@naver.com";
        h.address="서울";
        h.weight=57.6f;

        System.out.println(h.name+"\t"+h.age+"\t"+h.phone+"\t"+h.email+"\t"+h.address+"\t"+h.weight);
    }
}
