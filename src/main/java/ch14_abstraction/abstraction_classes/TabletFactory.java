package ch14_abstraction.abstraction_classes;
/*
    지시 사항
    1. Factory 클래스를 상속 받을 것
    2. 그러면 오류들이 생성, 오류 처리
    3. TabletFactory의 고유 method인 upgrade(String model)을 call2() 유형으로 정의
        객체명.upgrade("아이패드 프로 13인치 8세대);로 호출하면
            아이패드 프로 13인치 8세대로 업그레이드합니다. 라고 콘솔 출력

    4. Main으로 이동해서
        tabletFactory1 객체를 생성하고, 애플 태블릿 공장으로 이름 붙일 것.
    5. produce() / manage() 메서드를 태블릿 공장에 맞게 적절히 수정할 것 (PhoneFactory 참조)
    6. produce() 호출
    7. manage() 호출
    8. upgrade("아이패드 미니 7세대) 호출
 */
public class TabletFactory extends Factory{
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("애플 태블릿 공장을 관리합니다.");
    }

    // 고유 메서드 작성
    public void upgrade(String model){
        System.out.println(model + "로 업그레이드 합니다.");
    }
}
