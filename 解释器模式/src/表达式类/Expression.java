package 表达式类;

import 演奏内容类.PlayContext;

public abstract class Expression {

	public void Interpret(PlayContext context) {
		
		if(context.getPlayText().length()==0) {
			
			return;
			
		}
		else {
			
			//例如O 3 E 0.5
			//则playKey为O;playalue为3
			
			String playKey = context.getPlayText().substring(0, 1);
			context.setPlayText(context.getPlayText().substring(2));
			double playValue =Double.parseDouble(context.getPlayText().substring(0, context.getPlayText().indexOf(" ")));
			context.setPlayText(context.getPlayText().substring(context.getPlayText().indexOf(" ")+1));
			
		
			Excute(playKey,playValue);
		}
		
		
		
	}
	//执行
	public abstract void Excute(String key,double value);
}
