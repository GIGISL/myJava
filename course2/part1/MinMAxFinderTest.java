package fc.java.course2.part1;

import static fc.java.model2.MinMaxFinder.*;

public class MinMAxFinderTest {
    public static void main(String[] args) {
        int [] arr = {5,3,9,1,7};
        int min = findMin(arr);
        System.out.println("min = " + min);
        int max = findMax(arr);
        System.out.println("max = " + max);
    }
}
