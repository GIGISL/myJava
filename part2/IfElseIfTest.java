package fc.java.part2;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+"번째 학생의 점수를 입력하세요");
            a[i]= scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1) + "번째 학생의 점수:" + a[i]);
            if(a[i]>=90) {
                System.out.print("으로 A반 입니다");
            } else if (a[i]>=85) {
                System.out.print("으로 B반 입니다");
            } else {
                System.out.print("으로 C반 입니다");
            }
            System.out.println();
        }
    }
}
