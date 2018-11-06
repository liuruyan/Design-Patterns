package 实现类;

import proxy设计模式接口.GiveGift;
import 被追求类.SchoolGirl;

public class Proxy implements GiveGift {
	
	Pursuit gg;
	public Proxy (SchoolGirl mm) {
		gg=new Pursuit(mm);
	}
	public void GiveDolls() {
		// TODO Auto-generated method stub
		gg.GiveDolls();

	}

	public void GiveFlowers() {
		// TODO Auto-generated method stub
		gg.GiveFlowers();

	}

	public void GiveChocolate() {
		// TODO Auto-generated method stub
		gg.GiveChocolate();
	}

}
