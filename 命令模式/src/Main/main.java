package Main;

import Invoker.Waiter;
import 具体命令类.BakeChickenWingCommand;
import 具体命令类.BakeMuttonCommand;
import 抽象命名类.Command;
import 接受者.Barbecuer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//开店前的准备
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command backChickenWingCommand1 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		
		//开门营业，顾客点菜
		girl.SetOrder(bakeMuttonCommand1);
		girl.SetOrder(bakeMuttonCommand2);
		girl.SetOrder(backChickenWingCommand1);
		
		//点菜完毕，通知厨房
		girl.Notify();
		
	}

}
