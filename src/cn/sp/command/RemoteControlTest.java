package cn.sp.command;
/**
 * 设计模式之命令模式
 * @author 2YSP
 *
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		//命令还是得靠 电灯自己完成
		LightOnCommand lightOn = new LightOnCommand(light);
		//设置命令
		simpleRemoteControl.setCommand(lightOn);
		//执行
		simpleRemoteControl.buttonWasPressed();
	}

}
