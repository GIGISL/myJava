package fc.java.model;

public class CarDAO {
    // C.R.U.D 기능 알아보다
    public void carInsert(CarDTO car){
        //DB연결, insert SQL 되었다 치자.
        System.out.println("car정보가 DB에 저장이 되었습니다");
    }

    public void carSelect(CarDTO car){
        System.out.println("car정보가 출력이 되었습니다");
    }

    public void carDelete(CarDTO car){
        System.out.println("car정보가 삭제이 되었습니다");
    }

    public void carUpdate(CarDTO car){
        System.out.println("car정보가 업데이트이 되었습니다");
    }
}
