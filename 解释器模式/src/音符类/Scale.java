package 音符类;

import 表达式类.Expression;

public class Scale extends Expression {

	
	
	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		
		String scale="";
		switch(new Double(value).intValue()) {
		
		case 1 :scale = "低音"; break;
		case 2 :scale = "中音"; break;
		case 3 :scale = "高音"; break;
	
	
		}
		System.out.println(scale+" ");
	}

}
