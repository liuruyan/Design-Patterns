package ʵ����;

import proxy���ģʽ�ӿ�.GiveGift;
import ��׷����.SchoolGirl;

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
