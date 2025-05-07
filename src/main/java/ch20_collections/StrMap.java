package ch20_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();
        //Map에  Key - Value 쌍 삽입 -> .put(키, 값);
        strMap1.put("kor2025001", "kimone");
        strMap1.put("kor2025002", "kimtwo");
        strMap1.put("kor2025003", "kimthree");
        strMap1.put("kor2025004", "kimfour");
        strMap1.put("kor2025005", "kimfive");
        strMap1.put("kor2025006", "kimsix");

        System.out.println(strMap1);
        strMap1.put("kor2025005", "KimFive");
        System.out.println(strMap1);
        // Map의 특징중 하나로  하나의 key에는 하나의value만 가능.
        // 그래서 key값이 동일하다면 value값은 최신 것으로 덮어 쓰기가 된다.

        // List의 경우에 특정 인덱스를 조회하고 싶다면
        // 리스트명.get(인덱스넘버);의 형태로 확인할 수 있었다.
        // Map의 경우는 순서는 없는 대신 key가 있기 때문에

        // 특정 key의 value조회
        System.out.println(strMap1.get("kor2025005"));
        // 이상과 같은 방법으로 출력이 가능하다 -> value값만 나옴.

        // Java -> Map에서의 key-value pair를 entry라고 지칭한다.

        // 특정 키의 값 수정 #1 -> 아까 본 것처럼 .put(키)를 통해 덮어쓰기
        strMap1.put("kor2025001", "김일");
        System.out.println(strMap1.get("kor2025001"));

        // 특정 키의 값 수정 #2 -> .replace();
        strMap1.replace("kor2025002", "KimTwo");
        System.out.println(strMap1.get("kor2025002"));

        // 특정 키의 존재 여부 -> containsKey(); -> boolean
        boolean serchKeyFlag1 = strMap1.containsKey("kor2025007");
        System.out.println("kor2025007 존재여부 : " + serchKeyFlag1);

        // 특정 값 존재 여부 -> containsValue(); -> boolean
        boolean serchValueFlag1 = strMap1.containsValue("kimthree");
        System.out.println("kimthree의 존재 여부 : " + serchValueFlag1);

        System.out.println();
        // Map의 엔트리로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();         // 비어있는 Set생성
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();      // Map의 element를 Set에 삽입

        System.out.println(entrySet1);
        System.out.println(entrySet2);
        System.out.println(entrySet2.size());       // 6이 출력된다는 점에서 'key값-value값이 하나의 element로 잡힘.

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        List<Map<String, String>> entryList2 = new strMap1.entrySet();        // Map -> List 대입이 불가능하다는 걸 보여주는 예시
        // 결국 Map에서 List로의 형변환을 하고 싶다면 Set을 경우해야한다.
        entryList1.addAll(entrySet2);
        System.out.println(entryList1);
        // 그러면 sort가 가능

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

        // Value Set 출력
//        Set<String> valueSet = strMap1.values();      // 오류 발생 예시 -> 필요한 타입은 Set / 제공된 타입 Collection
        // 이상에서 문제가 발생하는 이유는 Key는 어차피 중복을 허용하지 않기 때문에 Set으로 형변환이 가능한 반면
        // 복수의 key에서 동일한 value가 존재할 수 있기 때문에 Set으로 생성하는 것이 불가능하다.
        Collection<String> values = strMap1.values();
        System.out.println(values);                     // 그 와중에 .sort() 할때 처럼 Collections가 아니라 Collection입니다.

    }
}
