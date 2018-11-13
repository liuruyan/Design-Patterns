package Main;

import 发起人类.Originator;
import 管理者类.Caretaker;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Originator o =new Originator ();
		o.setState("On");
		o.show();
		
		Caretaker c =new Caretaker();
		c.setMemento(o.CreateMemento());
		
		o.setState("Off");
		o.show();
		
		o.SetMemento(c.getMemento());
		o.show();
		

	} 

}
