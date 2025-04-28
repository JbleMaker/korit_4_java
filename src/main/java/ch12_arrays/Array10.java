package ch12_arrays;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        // 이상의 2차 배열에 1 ~ 100까지 값을 집어넣으시오.

        //Arrays.deepToString(nums);를 통해 출력하시오.
        //실행 예

        int num = 0;

        for (int i = 0; i < nums.length; i++){                  //nums.length == 20
            for(int j = 0; j < nums[i].length; j++){            //nums[i].length == 5
                nums[i][j] = ++num;
//                System.out.print(nums[i][j] + " ");
            }
        }
        //출력
        System.out.println(Arrays.deepToString(nums));

        // 향상된 for문으로 출력
        for(int[] numbers : nums ){
            for(int number : numbers){
                number = ++num;
            }
        }


    }
}
