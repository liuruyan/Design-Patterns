package 通知者;

import po.po;
import 观察者.Observer;

public interface Subject {

	void Attach (Observer observer);
	void Detach (Observer observer);
	void Notify();
	
	po p=new po();
	
}
