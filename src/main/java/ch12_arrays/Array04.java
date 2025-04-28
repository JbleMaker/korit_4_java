package ch12_arrays;

import java.util.Scanner;

public class Array04 {

    public void  printNames(String[] names){
        // 메서드가 Scanner를 사용하기 때문에 추가적으로 method내에서 객체를 생성할 필요.
        Scanner scanner = new Scanner(System.in);
        // element 입력을 위한 반복문 작성
        for(int i = 0; i < names.length; i++){
            System.out.println(i+1 + "번째 학생의 이름 : ");
            names[i] = scanner.nextLine();
        }
    }

    public void printNames(int[] names){
        for(int i = 0; i < names.length; i ++){
            System.out.print    (names[i] + " / ");
        }
    }

    public static void main(String[] args) {
        // 객체 생성
        Scanner scanner = new Scanner(System.in);
        Array04 array04 = new Array04();
        // 사용할 변수 목록도 선언
        int numOfStudents = 0;

        System.out.print("몇 명의 학생을 입력하시겠습니까? >>> ");
        numOfStudents = scanner.nextInt();
        // 빈 배열을 선언 -> sscanner로 입력받은 크기만큼의
        String[] names = new String[numOfStudents];
        // 해당 빈 배열에 입력을 하는 메서드 호출
//        array04.writeNames(names);

//        for(int i = 0; i < names.length; i ++){
//            System.out.print    (names[i] + " / ");
//        }

        // 이상의 코드를 참조하여 printNames() 메서드를 call2() 유형으로 작성하시오.
//        array04.printNames(names);

        int[] intArr01 = {1,2,3,4,5,6,7,8,9,10};
        array04.printNames(intArr01);


    }
}
