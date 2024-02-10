package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //myutil 이용해 두수의 합을 구하ㅓ기
        //static이 있는 경우
//        int sum = MyUtil.hap(a,b);
//        System.out.println("sum = " + sum);

        //static이 아닌 경우
        MyUtil ut = new MyUtil();
        int sum = ut.hap(a,b);
        System.out.println("sum = " + sum);

    }
}
