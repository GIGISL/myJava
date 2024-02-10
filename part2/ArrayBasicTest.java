package fc.java.part2;

public class ArrayBasicTest {
    public static void main(String[] args) {
        int a,b,c;
        a=b=c=10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);

        Book[] books = new Book[3];
        books[0].title="hi";;
        System.out.println("books[0].title = " + books[0].title);



    }
}
