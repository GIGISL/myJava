package fc.java.part2;

public class TwoDimArrayinit {
    public static void main(String[] args) {
        int [][] a = new int[2][4];
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=k;
                ++k;
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        int [][]b = new int[5][];
        b[0]=new int[1];
        b[1]=new int[2];
        b[2]=new int[3];
        b[3]=new int[4];
        b[4]=new int[5];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]='ㅁ';
                System.out.print((char)b[i][j]);

            }
            System.out.println();
        }
    }
}
