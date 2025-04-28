package ch13_inheritance;
/*
    1. Animal클래스를 상속
    2. 기본 생성자를 이용하여 main에서 human1 객체를 생성. -> 재정의 요구
        - 기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다 << 출력
    3. setter를 활용하여 animalName에 여러분 이름 / anumalAge에 여러분 나이를 작성.
    4. getter를 재정의하여 getAnimalName()을 호출 했을때,
        안녕하세요. 제 이름은 ???입니다. <<< 출력
    5. getter를 재정의하여 getAnimalAge();를 호출 했을때,
        올해 제 나이는 n살입니다. 내년에는 n+1살이 됩니다. <<< 출력
    6. move() 메서드를 재정의하여
        사람이 두 발로 걷습니다. <<< 출력
    7. Human 클래스의 고유 메서드은 read() 메서드를 call2() 유형으로 정의
        human1.read("자바의 기초") 라고 출력시
        여러분 '이름'은 자바의 기초를 읽는 중입니다. <<< 출력

    실행 예
    기본생성자를 통해 인스턴스 생성 <<<
    사람이 두발로 걷습니다.
    안녕하세요, 제 이름은 ?? 입니다.
    올해 제 나이는 ??살 입니다. 내년에는 ??+1 살이 됩니다.
    ???은 자바의 기초를 읽는 중입니다.
 */
public class Human extends Animal{
    public Human() {
        System.out.println("기본 생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다.");
    }

    @Override
    public String getAnimalName() {
        return "안녕하세요, 제 이름은 " + super.getAnimalName() + "입니다.";
    }

    @Override
    public int getAnimalAge() {
        System.out.println("올해 제 나이는 " + super.getAnimalAge() + "살 입니다. "
                + "내년에는 " + (super.getAnimalAge() + 1) + "입니다");
        return super.getAnimalAge();
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String book){
        System.out.println(super.getAnimalName() + "은 " + book + "를 읽는 중입니다.");
    }

}
