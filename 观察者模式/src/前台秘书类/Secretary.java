package 前台秘书类;

import java.util.ArrayList;

import 观察者.Observer;

public class Secretary {

	
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
		return secretaryAction;
	}

	public void setSecretaryAction(String secretaryAction) {
		this.secretaryAction = secretaryAction;
	}
	
	
}
