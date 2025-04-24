package ch08_methods;

import java.util.Scanner;

public class Method03 {

    public static void main(String[] args) {
        /*
            실행 : 예
            몇 과목의 점수를 입력하시겠습니까? >>>
            1 과목의 점수를 입력하시요 >>> 100
            2 과목의 점수를 입력하세요 >>> 90
            3 과목의 점수를 입력하세요 >>> 88
            총합은 ??? 이며, 몇균점수는 ???입니다.
         */
        calulateAvgScore(3);
    }

    public static void calulateAvgScore(int numOfSubs){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avgScore = 0;

        System.out.print("과목의 갯수를 입력해주세요 >>> ");
        numOfSubs = scanner.nextInt();

        for (int i = 1; i < numOfSubs + 1; i++){
            System.out.print(i + "과목의 점수를 입력해주세요 >>> ");
            sum += scanner.nextInt();
        }

        avgScore = sum/numOfSubs;
        System.out.println("총합은 " + sum + "점 이며, 평균 점수는 " + avgScore + "점 입니다.");
    }


}
