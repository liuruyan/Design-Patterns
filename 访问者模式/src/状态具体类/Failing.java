package 状态具体类;

import 人具体类.Man;
import 人具体类.Woman;
import 状态抽象类.Action;

public class Failing extends Action {

	@Override
	public void GetManConclustion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getClass().getName()+this.getClass().getName()+"时，背后多半有一个伟大的女人。");
	}

	@Override
	public void GetWomanConclustion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementB.getClass().getName()+this.getClass().getName()+"时，背后大多有一个不成功的男人。");
	}

}
