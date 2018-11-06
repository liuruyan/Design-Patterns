package 观察者;

import 前台秘书类.Secretary;
import 通知者.Subject;

public abstract class Observer {

	protected String name;
	protected /*Secretary*/ Subject sub;
	
	public Observer(String name,/*Secretary*/ Subject sub) {		//原来是前台现在改成抽象通知者类
		
		this.name=name;
		this.sub=sub;
		
	}
	public abstract void Update();
	
}
