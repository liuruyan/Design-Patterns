package handler具体实现;

import handler.Handler;

public class ConcreteHandler3 extends Handler {

	@Override
	public void HandlerRequest(int request) {
		// TODO Auto-generated method stub
		
		if(request >= 20 && request<30) {
			
			System.out.println(this.getClass().getName()+"处理请求"+request);
		
			
		}
		else if( successor !=null){
			
			successor.HandlerRequest(request);			//转交下一位
				
		}
		
		
	}

}
