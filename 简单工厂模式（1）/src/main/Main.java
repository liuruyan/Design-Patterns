package main;

import 大学生工厂.UndergraduateFactory;
import 雷锋工厂.IFactory;
import 雷锋类.LeiFeng;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IFactory factory =new UndergraduateFactory();
		LeiFeng student =factory.CreateLeiFeng();
		System.out.println("asdasd");
		student.BuyRice();
		student.Sweep();
		student.Wash();
		
	}

}
