package 状态类;

import 工作类.Work;
import 抽象状态类.State;

public class ForenoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		
		if(w.getHour()<12) {	//如果时间在12之前则认为是上午
			
			System.out.println("当前时间"+w.getHour()+"上午工作，精神百倍");
			
		}
		else {
			
			w.SetState(new NoonState());
			w.WriteProgram();
			
		}
		
		
	}

}
