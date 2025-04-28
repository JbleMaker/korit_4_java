package ch12_arrays;

public class Array05 {
    /*
    String[] score = {"A", "B", "C", "D", "F"};
    을 선언하고 반복문을 작성해서
    scores 배열의 결과가 {"A+", "B+", "C+", "D+", "F+"};
    가 되도록 한 후,
    실행 예
    점수 : A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.
     */
    public static void main(String[] args) {
        String[] scores = {"F","A", "B", "C", "D", "F"};
        for(int i = 0; i < scores.length; i++){
            if(scores[i] != "F"){
                scores[i] += "+";
            }
            System.out.print(scores[i] + " ");
        }

        // Array06EnhancedFor -> main // method ovderloading / 향상된 for문

    }
}
