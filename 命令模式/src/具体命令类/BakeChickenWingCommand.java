package 具体命令类;

import 抽象命名类.Command;
import 接受者.Barbecuer;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		
		receiver.BakeChickenWing();
		
	}
	@Override
	public String toString() {
		
		
		return "命令模式.烤鸡翅";
		
		
		
	}
}
