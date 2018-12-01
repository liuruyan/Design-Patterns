package 表达式;

import Context.Context;
import 抽象表达式.AbstractExpression;

public  class TerminalExpression extends AbstractExpression {

	@Override
	public void Interpret(Context context) {
		// TODO Auto-generated method stub
		
		System.out.println("终端解释器");
		
	}
	
	
	
	
}
