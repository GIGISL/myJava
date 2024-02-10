package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        float[] f = {24.5f, 45.6f, 77.65f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        Book[] b = new Book[3];
        b[0]=new Book();
        b[0].title="자바";

        System.out.println("b = " + b[0].title);
    }
}
