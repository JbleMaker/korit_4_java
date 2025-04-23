package ch06_condition;

/*
    사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
    score가 90점 이상이라면 grade는 A
    score가 80점 이상이라면 grade는 B
    score가 70점 이상이라면 grade는 C
    score가 60점 이상이라면 grade는 D
    59점 이하라면 grade F

    실행 예
    점수를 입력하세요 >>> 68
    당신의 점수는 68점이고, 학점은 D입니다.
 */

import java.util.Scanner;
public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String Grade;

        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        if(score >= 90){
            Grade = "A";
        } else if(score >= 80){
            Grade = "B";
        } else if(score >= 70){
            Grade = "C";
        } else if(score >= 60){
            Grade = "D";
        } else {
            Grade = "F";
        }
        System.out.println("당신의 점수는 " + score + "이고, 학점은 " + Grade + "입니다.");
    }
}
