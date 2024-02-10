package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        //도서정보 입력받기
        Scanner scan = new Scanner(System.in);
        Book b = new Book();
        System.out.println("제목 입력:");
        b.title=scan.nextLine();

        System.out.println("가격 입력:");
        b.prince=scan.nextInt();

        System.out.println("출판사 입력:");
        b.company=scan.next();

        System.out.println("저자 입력:");
        b.author=scan.nextLine();

        System.out.println("페이지수 입력:");
        b.page=scan.nextInt();
        scan.nextLine();

        System.out.println("ISBN 입력:");
        b.isbn=scan.nextLine();

        System.out.println(b.title + b.isbn + b.page + b.author + b.company + b.prince );
    }
}
