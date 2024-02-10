package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        //q.객체 배열을 이용하여 4명의 학생 데이터를 저장하고 출력하세요
        StudentVO[] std = new StudentVO[4];
        std[0]=new StudentVO();
        std[1]=new StudentVO();
        std[2]=new StudentVO();
        std[3]=new StudentVO();
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }


    }
}
