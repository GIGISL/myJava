package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //자동차 정보를 키보드로부터 입력을 받아서 DB에 저장하세요
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

        CarDAO dao = new CarDAO(); //cardao는 DB에 데이터 넣어주는 역할.
        dao.carInsert(car);
        dao.carSelect(car);
        dao.carDelete(car);
        dao.carUpdate(car);
    }
}
