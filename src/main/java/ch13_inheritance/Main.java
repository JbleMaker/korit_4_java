package ch13_inheritance;

public class Main {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.setAnimalName("나비");
//        animal1.setAnimalAge(10);
//        animal1.move();
//
//        Tiger tiger1 = new Tiger();
//        tiger1.setAnimalName("호이");
//        tiger1.setAnimalAge(2);
//        tiger1.move();
//        tiger1.hunt();
//        animal1.hunt();
//        오류발생 -> 부모클래스는 자식클래스의 필드 및 메서드에 접근 불가능
//        tiger1.setStriped(true);
//        animal1.setStripted(false);
//        오류 발생 -> 위의 이유와 동일

        Human human1 = new Human();
        human1.move();
        human1.setAnimalName("종보");
        human1.setAnimalAge(35);
        System.out.println(human1.getAnimalName());
        System.out.println(human1.getAnimalAge());
        human1.getAnimalAge();
        human1.read("자바의 기초");



    }
}
