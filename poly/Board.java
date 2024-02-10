package fc.java.poly;

public class Board extends Object{ //안에 toString()이라는 메서드 들어 있다
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}
