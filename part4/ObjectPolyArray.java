package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArray {
    public static void main(String[] args) {
        //A와 B를 저장 할 배열을 생성하세요
        //다형성 배열
        Object[] obj = new Object[2];
        obj[0]=new A();
        obj[1]=new B();//업캐스팅 2개
        //((A)obj[0]).printGo();
        //((B)obj[1]).printGo();

//        for (int i = 0; i < obj.length; i++) {
//            if(obj[i] instanceof A) {
//                ((A) obj[0]).printGo();
//            } else {
//                ((B) obj[1]).printGo();
//            }
//        }
        display(obj);



    }
    public static void display(Object[] obj){
        for (int i = 0; i < obj.length; i++) {
            if(obj[i] instanceof A) {
                ((A) obj[0]).printGo();
            } else {
                ((B) obj[1]).printGo();
            }
        }
    }


}
