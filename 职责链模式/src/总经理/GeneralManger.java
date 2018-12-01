package 总经理;

import 申请.Request;
import 管理者.Manager;

public class GeneralManger extends Manager {

	public GeneralManger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestApplications(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType().equals("请假")) {
			
			System.out.println(name+":"+request.getRequestContent()+"天数"+request.getNumber()+"被批准");				
		}
		
		else if(request.getRequestType().equals("加薪")&&request.getNumber()<=500) {
			
			System.out.println(name+":"+request.getRequestContent()+"金额"+request.getNumber()+"被批准");
				
		}
		else if(request.getRequestType().equals("加薪")&&request.getNumber()>500) {
			
			System.out.println(name+":"+request.getRequestContent()+"金额"+request.getNumber()+"再说吧");
			
		}
	}
		
		
}


