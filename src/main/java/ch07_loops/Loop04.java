package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우에 명확한 횟수가 고정되어 있을 때 사용하는 반복문

    형식 :
    for(시작값; 종료값; 증감값) {
        반복실행문
    }
 */
public class Loop04 {
    public static void main(String[] args) {

//        int sum = 0;
//        for (int i = 0; i < 101; i++){
//            sum +=i;
//        }
//        System.out.println(sum);

        // 1부터 100까지 중 홀수 합을 구하는 for문을 작성
        // 즉, for문 내에 if가 중첩가능

//        int sum1 = 0;
//        for(int j = 0; j<101; j++){
//            if(j%2==1){
//                sum1 +=j;
//            }
//        }
//        System.out.println(sum1);

//        int sum2 = 0;
//        for(int k = 1; k < 101; k+=2){
//            sum2 +=k;
//        }
//        System.out.println(sum2);

        /*
            숫자를 입력받아서 1부터 n까지 더하는 반복문을 작성
            실행 예
            1부터 몇까지 더하시겠습니까 >>> 10
            1부터 10까지의 합은 55입니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까 >>> ");

        int n = scanner.nextInt();
        int sumN = 0;

        for (int i = 1; i <= n; i++){
            sumN += i;
        }
        System.out.println(sumN);

    }
}
