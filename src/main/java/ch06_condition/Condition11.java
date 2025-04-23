package ch06_condition;

import java.util.Scanner;

/*
    switch문
    형식 :
    switch(변수명)
        case 조건1:
            실행문1
            break;
        case 조건2:
            실행문2
            break;
        case 조건3:
            실행문3
            break;
        case 조건4:
            실행문4
            break;
        default:
            실행문5;
 */
public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedNum;
        String selectedChar;

        System.out.println("[ 메 뉴 선 택 ]");
        System.out.println("1. 1번 메뉴");
        System.out.println("2. 2번 메뉴");
        System.out.println("3. 3번 메뉴");
        System.out.println("4. 4번 메뉴");
        System.out.println("5. 5번 메뉴");
        System.out.println("메뉴를 선택하세요 >>> ");
        selectedNum = scanner.nextInt();
        selectedChar = scanner.nextLine();

        // if문으로 메뉴를 선택한다고 가정했을 경우

//        switch(selectedNum){
//            case 1:
//                System.out.println("메뉴 1을 선택하셨습니다.");
//                break;          // 조건문을 탈출한다는 의미;
//            case 2:
//                System.out.println("메뉴 2을 선택하셨습니다.");
//                break;
//            case 3:
//                System.out.println("메뉴 3을 선택하셨습니다.");
//                break;
//            case 4:
//                System.out.println("메뉴 4을 선택하셨습니다.");
//                break;
//            case 5:
//                System.out.println("메뉴 5을 선택하셨습니다.");
//                break;
//            default:                    //selectedNum이 case에 속하지 않을때 실행.
//                System.out.println("잘못 선택하셨습니다.");
//        }


        switch(selectedChar){
            case "a":
                System.out.println("메뉴 1을 선택하셨습니다.");
                break;          // 조건문을 탈출한다는 의미;
            case "b":
                System.out.println("메뉴 2을 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴 3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴 4을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴 5을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }

    }
}
