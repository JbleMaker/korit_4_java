package ch08_methods;

import java.util.Scanner;

public class Method02 {

    // 한번에 자기 소개를 하는 메서드 정의

    public static void introduce(){
        // 내부에서 Scanner import
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>>");
        String name = scanner.nextLine();
        System.out.print("주소을 입력하세요 >>>");
        String address = scanner.nextLine();
        System.out.println("제 이름은 " + name + "입니다.");
        System.out.println(address + "에 살고 있습니다.");
    }

    /*
        출석부
        메서드 명 : registerStudent()
        return : void

        실행 : 예
        학번을 입력하세요 >>> ???
        이름을 입력하세요 >>> ???
        학번 : ???
        이름 : ???

        main단계에서 학생 수를 입력 받을 겁니다.
        실행 : 예
        몇 명의 학생을 등록하시겠습니까? >>> 3
        학번을 입력하세요 >>> 20250001
        이름을 입력하세요 >>> ???
        학번 :
        이름 :

        X 3

     */

    public static void registerStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("학번을 입력하세요 >>> ");
        int studentNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String studentName = scanner.nextLine();

        System.out.println("학번 : " + studentNum + "\n" + "이름 : " + studentName);
    }

    public static void registerStudent2(int student){
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        student = scanner.nextInt();

        for(int i = 0; i < student; i++){
            registerStudent();              // 메서드 내에 메서드를 호출하는 것이 가능.
                                            // 재사용성의 예시.
        }
    }

    public static void main(String[] args) {
        // 여기서 자기소개를 한번에 호출.

//      introduce();

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("몇 명의 학생을 등록하시겠습니까? >>>");
//        int student = scanner.nextInt();

//        for(int i = 0; i < student; i++){
//            registerStudent();
//        }

//        int i = 0;
//        while(i < student){
//            registerStudent();
//            i++;
//        }

        registerStudent2(3);

    }
}
