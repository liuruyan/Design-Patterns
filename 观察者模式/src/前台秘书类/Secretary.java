package 前台秘书类;

import java.util.ArrayList;

import 观察者.Observer;
import 通知者.Subject;

public class Secretary  implements Subject{

	
	//同事列表
	private ArrayList<Observer> observers=new ArrayList<Observer>();
	private String action;
	
	//增加
	public void Attach(Observer observer) {
		
		observers.add(observer);
		
		
	}
	
	//减少
	public void Detach(Observer observer) {
		
		observers.remove(observer);
		
	}
	
	//通知
	public void Notify() {
		
		for (Observer observer : observers) {
			observer.Update();
		}
		
		
	}
	
	//前台状态
	public String secretaryAction ;

	public String getSecretaryAction() {
		return Subject.p.getSubjectState();
	}

	public void setSecretaryAction(String secretaryAction) {
		Subject.p.setSubjectState(secretaryAction);
	}
	
	
}
