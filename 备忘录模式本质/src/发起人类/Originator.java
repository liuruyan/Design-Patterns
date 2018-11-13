package 发起人类;

import 备忘录类.Memento;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento CreateMemento() {
		
		return (new Memento (state));
		
	}
	
	public void SetMemento(Memento memento) {
		
		state=memento.getState();
		
	}
	
	public void show () {
		
		System.out.println("State="+state);
		
	}
	
}
