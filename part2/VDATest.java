package fc.java.part2;

public class VDATest {
    public static void main(String[] args){
        int a = 10;
        int b = a;
        int c = b * 10;
        int sum = 0;
        for (int i = 1; i < 6; ++i){
            sum=sum+i;
        }
        System.out.println(sum);
        int x = 10;
        int y = 20;
        int exc = x;
        x = y;
        y = exc;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
