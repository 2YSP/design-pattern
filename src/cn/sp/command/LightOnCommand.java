package cn.sp.command;

public class LightOnCommand implements Command {

	Light light ; 
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		//调用其方法
		light.on();
	}

}
