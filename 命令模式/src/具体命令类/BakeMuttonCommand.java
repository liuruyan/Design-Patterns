package 具体命令类;

import 抽象命名类.Command;
import 接受者.Barbecuer;

public class BakeMuttonCommand extends Command {
	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		receiver.BakeMutton();
		
	}
	@Override
	public String toString() {
		
		
		return "命令模式.烤羊肉串";
		
		
		
	}
}
