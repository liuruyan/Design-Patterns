package 人抽象类;

import 状态抽象类.Action;

public abstract class Person {

	//接收
	public abstract void Accept(Action visitor);
	
}
