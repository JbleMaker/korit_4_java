package ch24_stream;
// Stream API에 딸려있는 주요 메서드 예제 설명

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영","김일","김이","김삼","김사", "최오", "최육", "최칠");

        // filter()
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();              //to-- 메서드가 실행되었다는 말은 이전의 자료형이 절대 List가 아니라는 점.
        System.out.println(names);
        System.out.println(namesWithKim);
        // filter는 그 자체로 쓰이기보다는 합쳐서 많이 사용된다.
        // filter / map / sorted / collect

        List<String> englishNames = Arrays.asList("alice", "anna", "john", "camel", "pascal","yor", "spy", "family");
        List<String> result = englishNames.stream()
        // .여기 사이에 다양한 메서드들을 쓰라는 의미(builder패턴 사용때 .build()가 자동생성되었던것 처럼
                .filter(name -> name.startsWith("a"))           // a로 시작하는 element 추출
                .map(String::toUpperCase)                              // 이상의 결과값으로 "a"로 시작하는걸 뽑은것을 대문자로 변환.
                .sorted()                                              // 정렬입니다.
                .toList();

        System.out.println(englishNames);
        System.out.println(result);

        // count()
        int count1 = englishNames.size();       // element의 전체 개수를 세는 것만 가능.
        System.out.println(count1);

        long count2 = englishNames.stream().filter(name -> name.length() > 3 ).count();
        System.out.println(count2);

        // 일반 for / 향상된 for문
        int count3 = 0;

        for(int i = 0; i < englishNames.size(); i++){
            // 각 element의 String 길이가 3초과인지 확인
            if(englishNames.get(i).length() > 3){
                count3++;
            }
        }
        System.out.println(count3);



    }
}
