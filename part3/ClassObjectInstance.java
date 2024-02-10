package fc.java.part3;

import fc.java.model.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVO st1;
        StudentVO st2;
        StudentVO st3; /// 객체변수
        st1 = new StudentVO(); // st1은 인스턴수변수
        st2 = new StudentVO();
        st3 = new StudentVO();
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3);

    }
}
