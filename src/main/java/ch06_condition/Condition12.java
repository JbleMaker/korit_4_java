package ch06_condition;

import java.util.Scanner;

/*
    Condition07 파일을 학인.
    점수를 입력받아서 등급을 산출.
    이를 응용하여 정첩 if문 + switch문 형태로 프로그램을 작성.

    지시 사항
    사용자에게 score를 입력 받아서 다음과 같은 조건을 만족시킬 것.
    score가 0미만 이거나 100 초과라면 grade = X

    changedScore = 9 ~ 10, grade = A
    changedScore = 8, grade = B
    changedScore = 7, grade = C
    changedScore = 6, grade = D
    changedScore = 5~1, grade = F

    실행 예
    점수를 입력하세요 >>> 100
    점수는 100점이고, 학점은 A학점입니다.
 */
public class Condition12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력해주세요 >>> ");
        int score = scanner.nextInt();
        int changedScore = score/10;
        String grade ="";

        if(score < 0 || score > 100){
            System.out.println("잘못된 점수입니다.");
        } else {
            switch(changedScore) {
                case 9,10 :
                    grade = "A";
                    break;
                case 8 :
                    grade = "B";
                    break;
                case 7 :
                    grade = "C";
                    break;
                case 6 :
                    grade = "D";
                    break;
                default :
                    grade ="F";
            }
            System.out.println("점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
        }

    }
}
