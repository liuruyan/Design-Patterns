package main;

import ��ѧ������.UndergraduateFactory;
import �׷湤��.IFactory;
import �׷���.LeiFeng;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IFactory factory =new UndergraduateFactory();
		LeiFeng student =factory.CreateLeiFeng();
		
		student.BuyRice();
		student.Sweep();
		student.Wash();
		
	}

}
