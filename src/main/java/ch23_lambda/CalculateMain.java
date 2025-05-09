package ch23_lambda;

public class CalculateMain {
    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {

        return c.calculate(a,b);
    }

    public static void main(String[] args) {
        // interface인 Calculator를 활용하여 작성할 예정.
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;           // y가 0이면 예외 발생.

        // 정적메서드 호출
        System.out.println("2 + 3 = " + operate(2, 3, add));
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("2 / 3 = " + operate(2, 3, div));

        Calculator div2 = (x, y ) -> {
            if(y == 0){
                System.out.println("0으로 나눌 수 없습니다.");
                // 위 라인만 작성하면 오류가 발생.
                return 0;
            }else {
                return x/y;
            }
        };

//        System.out.println("4 / 0 = " + operate(4,0,div));
        System.out.println("4 / 2 = " + operate(4,2,div2));
    }
}
