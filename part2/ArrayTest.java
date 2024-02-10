package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr=new int[5];
        for(int i = 0; i < arr.length; i++ ) {
            arr[i]=10;
            System.out.print(i+"\t"); System.out.println(arr[i]);
        }

        int[] a = {10, 20, 30, 40, 50};

        System.out.println(a.length);

        char[] c = {'a','p','p','l','e'};
        for(int i = 0; i<c.length; i++){
            c[i]=(char)(c[i]-32);
            System.out.print(c[i]);
        }
    }
}
