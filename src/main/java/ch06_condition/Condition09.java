package ch06_condition;

import java.util.Scanner;

/*

 */
public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        //변수 선언 및 초기화
        int year = scanner.nextInt();
        String leapYear = "";

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            leapYear = "윤년입니다.";
        } else {        // 4로 나누어 떨어지지 않거나 100으로 나누어 지거나 //
            leapYear = "윤년이 아닙니다.";
        }
        System.out.println(year + "연도는 " + leapYear);
    }
}
