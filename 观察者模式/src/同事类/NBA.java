package 同事类;

import 观察者.Observer;
import 通知者.Subject;

public class NBA extends Observer {

	public NBA(String name, Subject sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println(sub.p.getSubjectState()+','+name+"关闭NBA，继续工作!!");
	}

}
