package pattern.command.simpleremote;

public class RemoteControlTest {

    public RemoteControlTest() {

        // remote 변수가 인보커 (Invoker) 역할을 한다.
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        // 커맨드 객체를 생성.
        LightOnCommand lightOn = new LightOnCommand(light);

        // 커맨드 객체를 인버커에 전달.
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
