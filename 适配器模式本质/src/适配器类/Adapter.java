package 适配器类;

import 用户接口.Target;
import 被适配类接口.Adaptee;

public class Adapter extends Target {

	private Adaptee adaptee =new Adaptee();		//新建私有目标对象
	
	@Override
	public void Request() {			//重写接口方法
		
		adaptee.SpecificRequest();
		
	}
	
}
