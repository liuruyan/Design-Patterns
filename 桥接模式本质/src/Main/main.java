package Main;

import Abstraction.Abstraction;
import Abstraction派生类.RefinedAbstraction;
import Implementor派生类.ComcreteImplementorA;
import Implementor派生类.ConcreteImplementorB;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstraction ab = new RefinedAbstraction();
		
		ab.SetImplementor(new ComcreteImplementorA());
		ab.Operation();
		
		ab.SetImplementor(new ConcreteImplementorB());
		ab.Operation();
	}

}
