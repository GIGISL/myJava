package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int result = add(a); // 번지전달 Call By Reference
        System.out.println("result = " + result);
    }

    public static int add(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
