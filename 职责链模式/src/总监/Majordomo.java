package 总监;

import 申请.Request;
import 管理者.Manager;

public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestApplications(Request request) {
		// TODO Auto-generated method stub
		
		if(request.getRequestType().equals("请假")&&request.getNumber()<=5) {
			
			System.out.println(name+":"+request.getRequestContent()+"天数"+request.getNumber()+"被批准");
			
		}
		else {
		
			if(superior !=null) {
				
				superior.RequestApplications(request);
			}
			
		}
		
		
	}

}
