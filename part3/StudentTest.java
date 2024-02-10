package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        //q.정수 5개를 저장할 배열을 생성하세요.
        int[] arr = new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        StudentVO vo = new StudentVO();
        System.out.println(vo);
    }
}
