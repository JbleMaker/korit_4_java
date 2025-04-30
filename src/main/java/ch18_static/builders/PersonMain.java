package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        //Person 클래스의 인스턴스인 person1을 만든다고 가정하겠습니다.
        // 이름-> 김일 / 나이-> 21 /  주소 -> 서울
        // Person person1 = new Person("이름",21,"서울");
        // 라고 작성해야 했습니다. 근데 만약에 AllArgsConstructor가 없다면
        // Person person1 = new Person();
        // person1.setName();
        // person1.setAge();
        // person1.setAddress();

        Person person1 = new Person.Builder().name("김일").age(21).address("서울").build();
        Person person2 = new Person.Builder().age(21).name("김일").build();
        Person person3 = new Person.Builder().address("서울").build();
    }
}
