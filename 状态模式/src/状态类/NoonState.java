package 状态类;

import 工作类.Work;
import 抽象状态类.State;

public class NoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<13) {
			
			System.out.println("当前时间"+w.getHour()+"饿了，午饭，犯困，午休");
			
		}
		else {
			
			w.SetState(new AfternoonState());
			w.WriteProgram();
			
		}
		
		
		
		
	}

}
