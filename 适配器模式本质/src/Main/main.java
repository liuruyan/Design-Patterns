package Main;

import 用户接口.Target;
import 适配器类.Adapter;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Target target = new Adapter();		//通过适配器来新建对象
		target.Request();					//通过适配器来调用方法
		
		

	}

}
