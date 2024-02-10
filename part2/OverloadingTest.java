package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
    int a = add(3,4);
    float b = add(3.5f,4.5f);
    int c = add(3,4,5);
        System.out.println(a +"\t"+ b +"\t"+ c);
    }

    public static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static float add(float a, float b) {
        float sum = a+b;
        return sum;
    }

    public static int add(int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }
}
