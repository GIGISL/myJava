package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char c='가';
        System.out.println("a = " + c);
        int a = 'A';
        System.out.println("a = " + a);
        int b = 'B'+1;
        System.out.println("b = " + b);
        char han='가';
        System.out.println("han = " + han);
        int hand='가';
        System.out.println("hand = " + hand);
        int hanU='\uAC00';
        System.out.println("hanU = " + hanU);
        System.out.println("(char)hanU = " + (char)hanU);

        //대문자 A를 소문자 a로 변호나하여 출력하시오.
        char upper = 'A';
        char lower = (char)(upper+32);
        System.out.println("lower = " + lower);

        char lower1='u';
        char upper1= (char)(lower1-32);
        int upper2=lower1-32;
        System.out.println("upper1 = " + upper1);
        System.out.println("upper2 = " + (char)upper2);

        //q. '1'+'2'=3이 나오도록 프로그래밍 하시오.
        int data='1'+'2';
        System.out.println("data = " + data); //99

        char i='1';
        char j='2';
        int sum = i + j;
        System.out.println("sum = " + sum);
        //1이 49고 2가 50이니 0의 아스키코드 값은 48을 알면 된다.
        // 1의 아스키코드 49에서 48을 빼고 2의 아스키코드 50에서 48을 빼서 1,2로 만든다.
        int sum1 = (i-48) + (j-48);


        

    }
}
