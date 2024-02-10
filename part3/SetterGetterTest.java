package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO vo=new PersonVO();
        vo.setName("짱재형");
        System.out.println(vo.getName());
        vo.setAge(28);
        System.out.println(vo.getAge());
        vo.setPhone("010-8937-6906");
        System.out.println(vo.getPhone());
    }
}
