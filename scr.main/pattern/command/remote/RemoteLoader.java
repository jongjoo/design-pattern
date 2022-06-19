package pattern.command.remote;

import pattern.command.simpleremote.Light;
import pattern.command.simpleremote.LightOnCommand;

public class RemoteLoader {

    public RemoteLoader() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        // 조명용.. 커맨드 객체
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // 선풍기.. 커맨드 객체

        // 차고 문.. 커맨드 객체

        // 오디오 .. 커맨드 객체

        remoteControl.setCommands(0, livingRoomLightOn, lightOffCommand);
        remoteControl.setCommands(1, kitchenLightOn, kitchenLightOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}

