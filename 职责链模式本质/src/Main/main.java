package Main;

import handler.Handler;
import handler具体实现.ConcreteHandler1;
import handler具体实现.ConcreteHandler2;
import handler具体实现.ConcreteHandler3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		h1.SetSuccess(h2);
		h2.SetSuccess(h3);
		
		int []requests = {2, 5, 14 ,22, 18 ,3, 27, 20};
		
		for(int request:requests) {
			
			h1.HandlerRequest(request);
			
		}
		
	}

}
