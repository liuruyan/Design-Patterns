package 状态类;

import 工作类.Work;
import 抽象状态类.State;

public class AfternoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		
		
		
		if(w.getHour()<17) {
			
			System.out.println("当前时间"+w.getHour()+"下午状态还不错，继续努力");
			
		}
		else {
			
			w.SetState(new EveningState());
			w.WriteProgram();
			
		}
		
	}

}
