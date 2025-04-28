package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 비어있는 String 배열 10개짜리를 만들겁니다.
        
        // 0번지에 김영 1번지에 김일 ... 3번지까지
        // Scanner로 입력할 수 있도록 작성.

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];
        
        //주소지에 값을 대입하기 위한 반복문 작성
        for(int i = 0; i < names.length; i++){
            System.out.print("이름을 입력해주세요 >>> ");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
