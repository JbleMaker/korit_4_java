package ch07_loops;
/*

    while문
    형식 :
    while(조건식) {
        반복실행문
    }
    while 뒤에 나오는 (조건식)을 봤을때 if(조건식) 형태와 유사
    즉, while() 내의 조건식이 true일 때, {} 내의 실행문이 '반복적으로' 실행.

    그래서 주의할 점이 잇는데
    while 내부의 조건식이 특정 시점에 false가 되도록 미리 지정해두어야 됩니다.

    false가 되는 시점을 지정해두지 않는다면 무한히 반복되어 실행되는데 이를
    무한 루프(infinite loops)라고 합니다.

 */
public class Loop01 {
    public static void main(String[] args) {
//        int i = 0;
//        while(i<100) {
//            i++;
//            System.out.println(i);
//        }
//        int j = 1;
//        while(j<101){
//            System.out.println(j);
//            j++;
//        }

        //while문도 중첩이 일어날 수 있습니다.
        /*
            while(조건식1) {
                반복실행문1a
                while(조건식2){
                    반복실행문2a
                }
                반복실행문1b
            }

            그러다보니 while과 if를 섞어 쓸수도 있습니다.
         */

        int sum = 0;
        int k = 1;
        //예를 들어 1부터 100까지 더하기
        while(k < 101) {
            sum += k;
            k++;
        } System.out.println(sum);

        // #1 응용 -> 1부터 100까지 중 짝수합만 구하는 while 반복문을 적성.

//        int sum1 = 0;
//        int i = 1;
//
//        while(i < 101){
//            i++;
//            if(i%2 == 0){
//                sum1+=i;
//            }
//            System.out.println(sum1);
//        }

        // #2 +=2를 활용한 짝수합 구하기

        int sum2 = 0;
        int i2 = 2;
        while(i2 < 101){
            sum2 += i2;
            i2 += 2;
        }
        System.out.println(sum2);
    }
}
