package ch07_loops;
/*

 */
public class Loop02 {
    public static void main(String[] args) {
        // 1일차 1교시입니다 ~ 1일차 3교시입니다. / 5일차 3교시입니다.

//        int day =1;
//        while(day < 6){
//            int lesson = 1;                 //반복문 내에 변수를 선언하고 초기화,
//            while(lesson < 4){
//                System.out.println(day + "일차 " + lesson + "교시입니다.");
//                lesson++;
//            }
//            day++;
//        }


        // 이상의 코드를 응용하여
        // 구구단 while문 작성

        int i = 2;
        while(i < 10){
            int j = 1;
            while(j < 10){
                System.out.println(i + " X " + j + " = " + (i*j));
                j++;
            }i++;
        }
    }
}
