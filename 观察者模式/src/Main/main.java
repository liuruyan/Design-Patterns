package Main;

import 前台秘书类.Secretary;
import 同事类.NBA;
import 同事类.StockObserver;
import 老板.Boss;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boss ln =new Boss();
		StockObserver tongshi1=new StockObserver("a",ln);
		NBA tongshi2=new NBA("b",ln);
		ln.Attach(tongshi1);
		ln.Attach(tongshi2);
		//ln.Detach(tongshi1);
		//老板回来
		ln.setSubjectState("我ln回来了！");
		
		//发出通知
		ln.Notify();
		
		Secretary mishu=new Secretary();
		StockObserver tongshi3=new StockObserver("c",mishu);
		NBA tongshi4=new NBA("d",mishu);
		mishu.Attach(tongshi3);
		mishu.Attach(tongshi4);
		
		mishu.setSecretaryAction("老板回来了！");
		
		mishu.Notify();
		ln.Notify();
	}

}
