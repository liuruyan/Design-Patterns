package 音符类;

import 表达式类.Expression;

public class Note extends Expression {

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		
		String note ="";
		switch(key) {
		
			case "C" :note = "1"; break;
			case "D" :note = "2"; break;
			case "E" :note = "3"; break;
			case "F" :note = "4"; break;
			case "G" :note = "5"; break;
			case "A" :note = "6"; break;
			case "B" :note = "7"; break;
		
		
		}
		System.out.println(note+" ");
		
	}

}
