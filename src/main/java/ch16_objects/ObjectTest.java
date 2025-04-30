package ch16_objects;
/*
    필드를 전부 private으로 선언.
    String name;
    String address;

    기본생성자, 매개변수 생성자 생성.
    getter / setter
    displayInfo() 메서드를 call1() 유형으로 정의
    ex)
    이름 : ???
    주소 : ???

    ObjectTestMain에서 ObjectTest의 객체를 생성하고 이름과 주소를 출력.

 */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name) {
        this.name = name;
    }

    public ObjectTest(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

//    public void setAddress(String address) {
//        this.address = address;
//    }
    /*
    이상의 코드가 오류가 발생하는 이유 :
    1. 매개변수와 field는 서로 다른 개념
        호출 상황을 가정하겠습니다. -> ObjectTestMain에서 객체 생성
    ObjectTest object1 = new ObjectTest("이름");
    ObjectTest object2 = new ObjectTest("주소")
     */

    // Object 클래스의 메서드들을 override할 겁니다.

    @Override
    public String toString() {
        return "이름 : " + name + "\n" + "주소 : " + address;
    }

//    @Override
//    public String toString() {
//        return "ObjectTest{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
