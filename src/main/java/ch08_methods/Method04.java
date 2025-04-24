package ch08_methods;

import java.util.Scanner;

/*
    bmi 계산기 method를 정의하고 실행
    메서드명 calculateBmi()
    return type : void
    매개변수 유무 : 없음
    몸무게(kg)를 키의 제곱(m)으로 나눈 값
    BMI 
    18.5 - 미만 저체중
      23 - 정상
        25.00 - 과체중
 */
public class Method04 {

    public static void calculateBmi(){
        double height = 0;
        double weight = 0;
        double bmi = 0;
        String health = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("키(cm)를 입력하세요 >>> ");
        height = scanner.nextDouble() / 100;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();

        bmi = Math.round(weight / (height * height));

        if(bmi <= 18.5){
            health = "저체중";
        } else if(bmi <= 23){
            health = "정상";
        } else if(bmi <= 25){
            health = "과체중";
        } else {
            health = "비만";
        }
        System.out.println("당신의 BMI 지수는 " + bmi + "이고, "+ health +"입니다.");
    }

    public static void main(String[] args) {
        calculateBmi();
        /*
            실행 : 예
            키(cm)를 입력하세요 >>>
            몸무게(kg)를 입력하세요 >>>
            당신의 BMI지수는 ??? 이고, ???입니다.
         */
    }
}
