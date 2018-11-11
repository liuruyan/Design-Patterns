package 状态类;

import 工作类.Work;
import 抽象状态类.State;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		
		System.out.println("当前时间"+w.getHour()+"不行了，睡着了");
		
	}

	
	
}
