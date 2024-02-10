package fc.java.model;

public class Allstatic {

    private Allstatic(){

    }
    public static int hap(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int max(int a, int b){
        int max = a>b? a : b;
        return max;
    }

    public static int min(int a, int b){
        return a<b? a : b;
    }

}
