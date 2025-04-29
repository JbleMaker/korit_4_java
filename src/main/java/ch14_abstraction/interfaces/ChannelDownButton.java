package ch14_abstraction.interfaces;

public class ChannelDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("채널을 계속 내립니다.");
    }
}

//ChannelUpButton을 생성, 동일한 방식 작성
