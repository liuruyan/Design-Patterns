package main;

import 简单工厂.OperationFactory;
import 运算类接口.Operation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation oper;
		oper=OperationFactory.createOperate("+");
		oper.setNumber1(1);
		oper.setNumber2(2);
		double result=oper.GetResult();
		System.out.println(result);
		
	}

}
