package Abstraction;

import Implementor.Implementor;

public abstract class Abstraction {

	protected Implementor implementor;
	
	public void SetImplementor(Implementor implementor) {
		
		this.implementor = implementor;
	}
	
	public abstract void Operation();
	
}
