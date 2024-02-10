package fc.java.part2;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("요일을 영어로 입력");
        String day = scan.nextLine();
        switch (day) {
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("수영하기");
                break;
            case "Friday":
            case "Saturday":
                System.out.println("휴식하기");
                break;


        }
    }
}
