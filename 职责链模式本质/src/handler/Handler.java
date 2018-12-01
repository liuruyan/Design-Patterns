package handler;

public abstract class Handler {

	protected Handler successor;
	
	public void SetSuccess (Handler successor) {
		
		this.successor = successor;
		
	}
	
	public abstract void HandlerRequest(int request);
	
	
}
