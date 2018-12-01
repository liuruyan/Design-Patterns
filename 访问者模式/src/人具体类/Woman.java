package 人具体类;

import 人抽象类.Person;
import 状态抽象类.Action;

public class Woman extends Person {

	@Override
	public void Accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.GetWomanConclustion(this);
	}

}
