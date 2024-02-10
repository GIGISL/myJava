package fc.java.poly;

public class Radio implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("라디오의 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("라디오의 채널이 내라간다");
    }

    @Override
    public void VolUp() {
       System.out.println("라디오의 소리이 올라간다");
    }

    @Override
    public void VolDown() {
        System.out.println("라디오의 소리이 내라간다");
    }

    @Override
    public void internet() {
        System.out.println("라디오에서 인터넷 실행된다");
    }

    //chUp() chDown, volUp(), vopDown()

}
