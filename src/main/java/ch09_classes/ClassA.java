package ch09_classes;

public class ClassA {

    static String name;
    static int studentCode;
    static double studentScore;

    public static void displayProfile(){
        System.out.println("[ 실 행 결 과 ]");
        System.out.println(studentCode + "학번의 학생의 이름은 " + name
                + "이고, 학점은 " + studentScore + "입니다." );
    }
}
