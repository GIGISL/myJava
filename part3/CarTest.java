package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차 일렬번호");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 이름");
        String carName = scan.nextLine();

        System.out.println("자동차 가격");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 소유주");
        String carOwner = scan.nextLine();


        System.out.println("자동차 연식");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 타입");//g(휘발유) d(경유)
        String carType = scan.nextLine();

//        System.out.println(carType +"\t"+ carOwner +"\t"+ carSn +"\t"+ carYear +"\t"+ carPrice +"\t"+ carName);
        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
        carInfoPrint(car);
    }

    //q.매개변수로 자동차의 정보를 받아서 출력하는 메서드를 정의하세요.

//    public static void carInfoPrint(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType){
//        System.out.println(carType +"\t"+ carOwner +"\t"+ carSn +"\t"+ carYear +"\t"+ carPrice +"\t"+ carName);
//    }
public static void carInfoPrint(CarDTO car){
    System.out.println(car.carType +"\t"+ car.carOwner +"\t"+ car.carSn +"\t"+ car.carYear +"\t"+ car.carPrice +"\t"+ car.carName);
}
}
