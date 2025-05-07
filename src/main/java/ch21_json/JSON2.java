package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
@AllArgsConstructor
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();     // 아까랑 다르게 Gson인스턴스로 생성
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 아까와 동일하게 gsonBuilder를 통해서 prettyPrinting이 적용되로록 인스턴스 생성.

        // 사용할 변수 선언.
        String userJson = null;

        // 1. Java Object -> json으로 변환
        // user1 객체를 생성하고, "kim1", "9876", "a@test.com", "김일", "20"로 입력하시오.
        // 1-1 setter 정의로 입력
        // 1-2 @setter 사용.
        // 1-3 속성값입력을 원할 시 @AllArgsConstructor 사용

        User user1 = new User("kim1","9876", "a@test.com", "김일", "20");
        // 그럼 생성된 user1 인스턴스를 가지고 Json 데이터로 바꿈
        userJson = gson.toJson(user1);
        System.out.println("gson 사용 결과값 : " + userJson);
        userJson = gsonBuilder.toJson(user1);
        System.out.println("gsonBuilder 사용 결과값 : "  + userJson);

        // 2. JsonObject -> json으로 변환 근데 JSON1에서 했던것.
        // JsonObject를 활용 studentCode 2025001 /studentName 김이 / studentYear 2 / score 96.7인 객체 생성.
        // key value 다 String
        // JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode", "2025001");
        jsonObject1.addProperty("studentName", "김이");
        jsonObject1.addProperty("studentYear", "2");
        jsonObject1.addProperty("score", "96.7");

        String studentJson = studentJson = gson.toJson(jsonObject1);
        // gson 밒 gsonBuilder를 이용하여 studentJson을 두 번 출력한 결과값을 콘솔창에 띄울 수 있도록 하시오.
        System.out.println(studentJson);
        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println(studentJson);
        System.out.println();


        // 3. Map -> Json 데이터로.
        /*
            Map을 활용하여 key String / value String으로 선언하고, 객체명을 map1으로 한 빈 map을 생성.
            map에 productCode NT960XHA-KD72G
            productName 삼성 갤럭시북 프로 5
            라는 Entry(key-value pair)를 입력하시오.

            gson 및 gsonBuilder를 활용하여 json 데이터로 변경(조금 다름)
         */

        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960XHA-KD72G");
        map1.put("productName","삼성 갤럭시북 프로 5");
        System.out.println(map1);
        System.out.println();

        System.out.println("gson 사용 사례 : " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 사례 : " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);
        // Json데이터들의 자료형이 전부 String인것을 주목.

        // 그렇다면 json -> Map / Java 자료형으로 바꾸려면 어떻게 해야 할까요.
        // 즉 json 데이터를 user 객체로 다시 바꾸는 것과 json 데이터를 map2 형태로 작성하는 것을 의미
        // 형식 :
        // gson.fromJson(JsonData,  바꾸고자하는_클래스명.class);

        // json -> map

        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        // productJson ==> gsonBuilder.toJson(map1) 이나 gson.toJson(map1) 상관없음
        System.out.println(map2);                       // Java Map형태로 출력이 가능
        // json -> User 클래스의 인스턴스로 바꾸는 방법.

        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        // json -> jsonObject : 이게 의미하는 바는 json데이터 =/= JsonObject입니다.
        // studentJson의 자료형은 String이고, jsonObject의 자료형은 JsonObject.

        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);


    }
}
