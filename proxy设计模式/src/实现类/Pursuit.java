package ʵ����;

import proxy���ģʽ�ӿ�.GiveGift;
import ��׷����.SchoolGirl;
import ʵ����.Pursuit;

public class Pursuit implements GiveGift {
	SchoolGirl mm;
	public Pursuit(SchoolGirl mm) {
		this.mm=mm;
		
	}
	
	
	public void GiveDolls() {
	
		System.out.println(mm.getName()+"����������");

	}

	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"�����ʻ�");
	}

	public void GiveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"�����ɿ���");
	}

}
