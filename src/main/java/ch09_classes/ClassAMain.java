package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // 객체 생성
        ClassA classA1 = new ClassA();
        // 이상에서 볼 수 있듯이
        // 사실 여태까지 Scanner 클래스를 import 한다고 했지만
        // Scanner 클래스의 인스턴스를 생성하고 있었습니다.

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();

        //객체의 속성 접근 방법
        //객체명.속성명
//        classA1.num = 100;
//        classA1.name = "종보";

        // classA2 객체를 생성하고,
        // num에 200;
        // namedp 김이를 대입한 후
        // sout을 적용하여
        // 김이의 번호는 200번입니다. 를 출력하시오.

//        ClassA classA2 = new ClassA();
//        classA2.num = 200;
//        classA2.name = "김이";
//        System.out.println(classA2.name + "의 번호는 " + classA2.num + "번 입니다.");

        //메서드 호출 방법 -> 이미 설명
        // 객체명.메서드명();

//        classA1.callName();
//        classA2.callName();
        // 이상의 두 method 호출 결과는
        // 서로 '다르다'고 말해야 된다.

        /*
            Scanner의 인스턴스를 생성하고,
            ClassA의 인스턴스인  classA3을 생성한 다음,
            다음과 같이 실행될 수 있도록 작성하시오.

            이름을 입력하세요 >>> 김삼
            번호를 입력하세요 >>> 20205003
            점수를 입력하세요 >>> 4.5           -> Field정의가 필요.

            그리고 call1() 유형으로
            displayProfile()을 ClassA에 정의 한 후에
            classA3.displayProfile()을 호출했을 떄
            [실행 결과]
            20205003학번의 학생의 이름은 김삼이고, 학점은 4.5입니다.
            가 출력될 수 있도록 작성.
         */

        Scanner scanner = new Scanner(System.in);
        ClassA classA3 = new ClassA();

        System.out.print("이름을 입력하세요 >>> ");
        classA3.name = scanner.next();
        System.out.print("번호를 입력하세요 >>> ");
        classA3.studentCode = scanner.nextInt();
        System.out.print("학점을 입력하세요 >>> ");
        classA3.studentScore = scanner.nextDouble();

        classA3.displayProfile();

        ClassA.displayProfile();


    }
}
