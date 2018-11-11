package 工作类;

import 抽象状态类.State;
import 状态类.ForenoonState;

public class Work {
	
	private State current;
	
	public Work() {
		
		current=new ForenoonState();
		
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	private double hour;
	
	private boolean finish=false;

	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void SetState(State s) {
		
		current =s ;
		
	}
	
	public void WriteProgram() {
		
		current.WriteProgram(this);
	}

}
