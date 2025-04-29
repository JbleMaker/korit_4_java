package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()
        );

        //별개의 PowerButton 객체를 생성해서 메서드 호출이 가능한가?
        PowerButton powerButton = new PowerButton(); // 가능
        powerButton.onPressed(); // status가 서로 다른 메모리에 저장되기 때문에 결과값이 별개로 처리됨.

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();

        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();

        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();

        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();

    }
}
