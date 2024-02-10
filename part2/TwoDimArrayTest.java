package fc.java.part2;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        //q. 2*4의 정수형 배열을 생성하시오
        int [][] a = new int[2][4];
        a[0][0]=0;
        a[0][1]=10;
        a[0][2]=20;
        a[0][3]=30;

        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;
        a[1][3]=70;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(a[i][j]+"\t");

            }

        }



    }
}
