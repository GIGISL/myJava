package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        // 매개변수로 2개의 정수를 받아서 총함ㅂ을 구하여 리턴하는 메서드를 정의하세요.
        int a = 3, b = 5;
        int result = add(a,b);
        System.out.println("result = " + result);

    }

    public static int add(int a, int b) {
        int sum =  a + b;
        return sum;
    }
}
