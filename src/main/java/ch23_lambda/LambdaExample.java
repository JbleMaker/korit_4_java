package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello, Java");
//            }
//        };
//        runnable.run();
//        Runnable lambdaRunnable = () -> System.out.println("Hello, Java");
//        lambdaRunnable.run();

        // 1. Supplier -> call2() 유형의 함수형 인터페이스, 추상메서드가 하나인 메서드
        Supplier<String> stringSupplier = () -> "Hello, Functional Interface and Lambda";
        System.out.println(stringSupplier.toString());

        // 2. Consumer -> call3() 유형의 함수형 인터페이스
        Consumer<String> stringConsumer = (message) -> System.out.println("메시지 : " + message);

        // 3. Supplier로부터 값을 생성하고나서 Consumer를 통해서 출력
        String message = stringSupplier.get();
        // message 변수에 "Hello, Functional Interface and Lambda" String 데이터가 대입
        stringConsumer.accept(message);


    }
}
