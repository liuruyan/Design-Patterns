package 管理者;

import 申请.Request;

public abstract class Manager {

	protected String name; 
	
	protected Manager superior;//管理者的上级
	
	
	public Manager(String name) {
		
		this.name= name;
		
	}
	public void SetSuperior(Manager superior) {
		
		this.superior = superior;
		
	}
	
	abstract public void RequestApplications(Request request);
	
}
  