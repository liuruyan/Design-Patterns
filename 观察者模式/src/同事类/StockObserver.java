package 同事类;

import 观察者.Observer;
import 通知者.Subject;

public class StockObserver extends Observer {

	

	public StockObserver(String name, Subject sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void Update() {
		System.out.println(sub.p.getSubjectState()+','+name+"关闭股票行情，继续工作!!");
		
	}
	

}
