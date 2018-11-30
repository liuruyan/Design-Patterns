package Main;

import 总监.Majordomo;
import 总经理.GeneralManger;
import 申请.Request;
import 经理.CommomManager;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommomManager jingli = new CommomManager("经理");
		Majordomo zongjian = new Majordomo("总监");
		GeneralManger zongjingli = new GeneralManger("总经理");
		jingli.SetSuperior(zongjian);
		zongjian.SetSuperior(zongjingli);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		jingli.RequestApplications(request);
		
		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(4);
		jingli.RequestApplications(request2);
		
		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜请求加薪");
		request3.setNumber(500);
		jingli.RequestApplications(request3);
		
		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜请求加薪");
		request4.setNumber(1000);
		jingli.RequestApplications(request4);
	}

}
