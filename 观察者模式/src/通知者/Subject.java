package 通知者;

import po.po;
import 观察者.Observer;

public abstract class Subject {//通知者接口,如果使用接口，则po为接口内对象，每一个继承的接口的对象共用同一个po对象，任意实现类的对象修改po，则其他类也会受到影响
	//如果使用抽象类，则每一个继承它的子类各自拥有po对象，修改一个对其他类并不影响

	public abstract void Attach (Observer observer);
	public abstract void Detach (Observer observer);
	public abstract void Notify();
	
	public po p=new po();
	
	
}
