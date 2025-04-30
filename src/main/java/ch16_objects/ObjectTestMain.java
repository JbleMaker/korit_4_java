package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("부산시","김종보");
        objectTest.displayInfo();
        System.out.println();
        System.out.println(objectTest);

        System.out.println();

        Teacher teacher = new Teacher("김종보", "중");
        System.out.println(teacher);

        System.out.println(teacher.equals(teacher));

    }
}
