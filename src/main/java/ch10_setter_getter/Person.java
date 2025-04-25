package ch10_setter_getter;

public class Person {
    //필드 선언
    private String name;
    private int age;
    //기본 생성자, 매개변수가 하나인 생성자 두 개, 매개변수 두개인 매개변수 생성자 하나를
    //작성하시오.
    //showInfo() 정의
    // 이름 : 김일
    // 나이 : 30


    public Person() {
        System.out.println("기본 생성자를 통해 Person클래스의 인스턴스가 생성되었습니다.");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("이름이 입력되었습니다 : " + name);
    }

    public int getAge() {
        return age;
    }
    /*
        이제 setAge를 자동완성한 것을 기본으로 두고, 편집
        나이가 0미만이거나 200초과인 age가 매개변수로 들어오게 된다면,
        객체의 속성에 들어갈 수 없도록 할 예정
        md파일을 참조하여 setAge를 완성하고 ,
        PersonMain에서 person1 객체를 '기본생성자로 생성'하고,
        person1.setName("김일")'
        person1.setAge(245); 을 입력했을 때,

        콘솔창의 실행예시로
        기본생성자를 통해 Person 클래스의 인스턴스가 생성되었습니다.
        이름이 입력되었습니다. : 김일
        불가능한 나이 입력입니다. 현재 나이 : 0
        나이가 입력되었습니다.
        변경 전 나이 : 0
        변경 후 나이 : 21
     */

    public void setAge(int age) {
        if(age < 0 || age > 200){
            System.out.println("불가능한 나이 입력입니다.");
            return;
        }
        System.out.println("나이가 입력되었습니다.");
        System.out.println("변경 전 나이 : " + this.age);
        this.age = age;
        System.out.println("변경 후 나이 : " + this.age);
    }

    //스트링값.length() 하면 스트링 데이터의 길이가 int로 반환
    // "안녕하세요".length()의 결과값 : 5

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }


    
}
