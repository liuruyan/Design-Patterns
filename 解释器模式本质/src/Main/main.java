package Main;


import java.util.LinkedList;
import java.util.List;

import Context.Context;
import 抽象表达式.AbstractExpression;
import 表达式.NonterminalExpression;
import 表达式.TerminalExpression;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context context = new Context();
		List<AbstractExpression> list = new LinkedList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		
		
		
		for(AbstractExpression exp : list) {
			
			exp.Interpret(context);
		}
		
	}

	
	
}
