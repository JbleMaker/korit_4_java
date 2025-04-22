package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
         .next() : String 데이터를 받을 때 띄어쓰기를 인정하지 않음.
         .nextLine() : String 데이터를 받을 때 띄어쓰기 인정하고, enter 키 기준으로 데이터가 입력됨.

         실행 예
         이름을 입력하세요 >>> 이름
         나이를 입력하세요 >>> 나이
         주소를 입력하세요 >>> 주소

         안녕하세요. 제 이름은 (이름) 입니다. (주소)에 살고 있습니다.
         10년 후 나이는 (나이) + 10살입니다.
         */

        Scanner scanner = new Scanner(System.in);
        // Ctrl + Space

        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("주소를 입력하세요 >>> ");
        String address = scanner.nextLine();
        System.out.print("나이를 입력 하세요 >>> ");
        int age10 = scanner.nextInt();
        age10 += 10;

        System.out.println("안녕하세요. 제 이름은 " + name + "입니다." + address + "에 살고 있습니다.");
        System.out.println("10년 후 나이는 " + age10 + "살입니다.");

    }
}
