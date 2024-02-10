package fc.java.part2;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("정수를 입력하세요");
        a=scan.nextInt();
        if(a%7==0) {
            System.out.println(a + "는 7의 배수입니다");
        }
        else {
            System.out.println(a + "는 7의 배수가 아닙니다");
        }

    }
}
