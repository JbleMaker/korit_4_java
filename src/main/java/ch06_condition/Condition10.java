package ch06_condition;

import java.util.Scanner;

/*


 */
public class Condition10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int max;
        int max2;
        // a > b라면 max에 a를 대입 / 아니라면 max에 b를 대입

        max = (a>b) ? a : b;
        System.out.println(max);

        //이상의 삼항 연산자를 if - else문으로 풀어 쓴다면
        if(a>b){
            max2 = a;
        }else{
            max2 = b;
        }
        System.out.println("max에 저장된 값은? : " + max2);

        //이상의 삼항연산자 개념을 윤년에 응용하기.
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();

        //boolean 자료형의 변수명은 is로 시작하는 일이 많습니다.
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        String result = isLeapYear ? "윤년입니다." : "윤년이 아닙니다.";
        System.out.println(year + "년은 " + result);

        // 음수 연도를 걸러내기 위해서는
        String result2 = "";
        if (year < 0){
            result2 = "불가능한 연도 입력입니다.";
        } else { // 그려면 얘는 0 이상
            //여기에 삼항 연산자를 사용
            result2 = isLeapYear ? "윤년입니다." : "윤년이 아닙니다.";
        }
        System.out.println(year + "년은 " + result2);
    }
}
