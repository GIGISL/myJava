package fc.java.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 65) + " : " + (65 + i));
        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}

        // int [] numbers = { 1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문으로 출력



