package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        //q. Car 정보를 출력하는 동작을 가지고 있는 Utility클래스를 설계하시오.
        int carSn = 1110;
        String carName = "BMW528I";
        int carPrice = 90000000;
        String carOwner="장재형";
        int carYear = 2015;
        String carType = "G";

        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
        //하나의 구조로 묶임!
        //carPrint(car);
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);


    }
    //매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하세요
//    public static void carPrint(CarDTO car){
//        System.out.println(car.carSn +"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType  );
//    }
}
