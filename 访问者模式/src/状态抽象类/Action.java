package 状态抽象类;

import 人具体类.Man;
import 人具体类.Woman;

public abstract class Action {

	//得到男人结论或反映
	public abstract void GetManConclustion(Man concreteElementA);
	
	//得到女人的结论或反映
	public abstract void GetWomanConclustion(Woman concreteElementB);
	
	
	
	
}
