package cn.sp.command;
/**
 * 简单的遥控器类
 * @author 2YSP
 *
 */
public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {
	}
	
	public void setCommand(Command command){
		this.slot = command;
	}
	//按下按钮调用执行方法
	public void buttonWasPressed(){
		slot.execute();
	}
}
