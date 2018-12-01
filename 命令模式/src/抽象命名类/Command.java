package 抽象命名类;

import 接受者.Barbecuer;

public abstract class Command {

	protected Barbecuer receiver;
	
	public Command (Barbecuer receiver) {
		
		this.receiver = receiver;
		
	}
	
	//执行命令
	abstract public void ExcuteCommand();
	
}
