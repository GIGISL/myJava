package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.Tv;

public class InterFaceTest {
    public static void main(String[] args) {
        //리모컨으로 라디오와  tv를 동작시켜보자
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.VolUp();
        remo.VolDown();
        remo.internet();


        remo = new Tv();
        remo.chUp();
        remo.chDown();
        remo.VolUp();
        remo.VolDown();
        remo.internet();



    }
}
