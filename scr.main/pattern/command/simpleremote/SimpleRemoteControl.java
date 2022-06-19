package pattern.command.simpleremote;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    /*
    * 슬롯을 가지고 제어할 명령을 설정하는 메소드
    * */
    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
