package 具体国家;

import 国家类.Country;
import 联合国机构类.UnitedNations;

public class USA extends Country {

	public USA(UnitedNations un) {
		super(un);
		// TODO Auto-generated constructor stub
	}
	//声明
	public void Declare (String message ) {
		
		un.Declare(message, this);
		
	}
	//获得消息
	public void GetMessage(String message) {
		
		System.out.println("美国获得对方信息："+message);
		
	}

}
