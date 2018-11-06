package 简单工厂;

import 实现类.*;
import 运算类接口.Operation;

public class OperationFactory {

	public static Operation createOperate(String operate) {
		
		Operation oper=null;
		switch (operate) {
		case "+":
			oper =new OperationAdd();
			break;
		case "-":
			oper =new OperationSub();
			break;
			
		}
	
		return oper;
		
	}
	
	
}
