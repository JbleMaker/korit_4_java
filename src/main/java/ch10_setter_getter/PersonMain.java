package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("김일");
        person1.setAge(254);
        person1.setAge(21);


        int strLength = "dddddd".length();
        System.out.println(strLength);

        // 객체 하나 더 생성.
        Person person2 = new Person("이이", 32);
        // 여기서 이이 라는 사람의 이름을 강이로 바꾸고 싶다면 두 가지 방법.
        // # 1 객체명.속성명
//            person2.name = "강이";        //Person.java에 private 적용하면 오류
        // # 2 setName()을 이용하는 방법
            person2.setName("강이");

        // 마찬가지로 콘솔창에 person2의 name을 출력하는 방법도 두 가지
        //#1
//        System.out.println(person2.name);   //Person.java에 private 적용하면 오류
        //#2 getName() -> call3()
        System.out.println(person2.getName());

        // call1()/ call2() 유형의 경우 return이 없는 대신에 콘솔창에 출력하기 위해서는
        // 메서드 내에 sout()을 구현할 필요가 있다.
        // 이상의 경우 main 단계에서 메서드 호출을 하기만 하면 콘솔창에 결과가 출력된다는
        // 장점이 있기는 하지만 '데이터의 가공'이 어렵다.
        // 데이터 가공을 위해 get사용
        
        
        
    }
}
