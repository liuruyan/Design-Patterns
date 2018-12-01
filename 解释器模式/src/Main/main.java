package Main;

import 演奏内容类.PlayContext;
import 表达式类.Expression;
import 音符类.Note;
import 音符类.Scale;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayContext context = new PlayContext();
		
		System.out.println("上海滩：");
		context.setPlayText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3");
		Expression expression = null;
		try {
			
			while(context.getPlayText().length()>0) {
				
				String str = context.getPlayText().substring(0, 1);
				switch(str) {
				
				case "O":
					expression = new Scale();
					break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":
				case "P":
					expression = new Note();
					break;
				}
				expression.Interpret(context);
			
			}
			
			
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
