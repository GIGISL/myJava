package fc.java.part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Book b = new Book();
//        b.title=scan.nextLine();
//        b.page= scan.nextInt();
//        b.prince= scan.nextInt();
//        b.isbn= scan.next();
//        b.company=scan.next();
//        b.author=scan.nextLine();
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int num = scan.nextInt();
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요:");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자열 입력하세요");
        String str = scan.next();
        System.out.println("str = " + str);


        System.out.println("문자열 입력하세요");
        String str2 = scan.nextLine();
        System.out.println("str2 = " + str2);
    }
}
