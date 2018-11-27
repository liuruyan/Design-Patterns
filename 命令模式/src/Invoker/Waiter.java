package Invoker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import 抽象命名类.Command;

public class Waiter {

	private List<Command> orders = new LinkedList<Command>();
	
	SimpleDateFormat pd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	//设置订单
	public void SetOrder(Command command) {
		
		if(command.toString().equals("命令模式.烤鸡翅")) {
			
			
			
			System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
			
			
		}
		else {
			orders.add(command);
			System.out.println("增加订单："+command.toString()+"时间："+pd.format(new Date()));
			
		}
		
		
		
		
		
	}
	//取消订单
	public void CancelOrder(Command command) {
		
		orders.remove(command);
		System.out.println("取消订单："+command.toString()+"时间："+pd.format(new Date()));
		
		
	}
	//通知全部执行
	public void Notify() {
		
		for(Command cmd : orders) {
			
			cmd.ExcuteCommand();
			
		}
		
		
	}
	
	
}
