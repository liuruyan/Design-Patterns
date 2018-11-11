package 状态类;

import 工作类.Work;
import 抽象状态类.State;

public class EveningState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.isFinish()) {
			
			w.SetState(new RestState());
			w.WriteProgram();
			
		}
		else {
			
			if(w.getHour()<21) {
				
				System.out.println("当前时间"+w.getHour()+"加班哦，疲惫至极");
			}
			else {
				w.SetState(new SleepingState());
				w.WriteProgram();
			}
			
		}
		
		
		
		
		
	}

}
