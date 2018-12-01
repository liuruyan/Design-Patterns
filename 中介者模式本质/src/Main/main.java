package Main;

import ConcreteColleague.ConcreteColleague1;
import ConcreteColleague.ConcreteColleague2;
import ConcreteMediator.ConcreteMediator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConcreteMediator m = new ConcreteMediator();
		ConcreteColleague1 c1 = new ConcreteColleague1(m);//各个被调节者知道中介
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		m.setColleague1(c1);//中介知道各个被调节者
		m.setColleague2(c2);
		c1.Send("吃饭了吗？");
		c2.Send("没有呢，你打算请客？");
	}

}
