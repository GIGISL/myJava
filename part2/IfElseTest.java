package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수르 입력하세요");
        int a = scan.nextInt();
        if (a%2==0) {
            System.out.println(a + "는 짝수입니다");
        }
        else {
            System.out.println(a + "는 홀수입니다");
        }
        if (a%12==0) {
            System.out.println(a + "는 12의 배수입니다");
        }
        else {
            System.out.println(a + "는 12의 배수가 아닙니다");
        }
    }
}
