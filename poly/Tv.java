package fc.java.poly;

public class Tv implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("티비의 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("티비오의 채널이 내라간다");
    }

    @Override
    public void VolUp() {
        System.out.println("티비의 볼륨이 올라간다");
    }

    @Override
    public void VolDown() {
        System.out.println("티비의 볼륨이 내라간다");
    }
    //chUp() chDown, volUp(), vopDown()


    @Override
    public void internet() {
        System.out.println("티비에서 인터넷 실행된다");
    }
}
