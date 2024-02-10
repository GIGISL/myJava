package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("위정현",28,"010-77094-7858");
        System.out.println(vo.getName()+vo.getPhone()+vo.getAge());

        PersonVO vo1 = new PersonVO();
        System.out.println(vo1.getName()+vo1.getPhone()+vo1.getAge());
    }
}
