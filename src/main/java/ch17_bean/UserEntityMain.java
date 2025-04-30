package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        /*
            UserEntity 클래스의 인스턴스 user1을 생성.
            username에 1
            password 9876
            email jbo@naver.com
            name 이름
            toString()으로 출력
         */
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(1234);
        user1.setEmail("jbo@naver.com");
        user1.setName("김종보");
        System.out.println(user1);

        System.out.println();

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(3);
        user2.setPassword(1234);
        user2.setEmail("jbojsun@naver.com");
        user2.setName("김종보");
        System.out.println(user2);

        System.out.println();


    }
}
