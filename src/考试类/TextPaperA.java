package 考试类;

import 模板类.TextPaper;

public class TextPaperA extends TextPaper{
/*	@Override
	public void TextQuestion1() {
		super.TextQuestion1();
		
		System.out.println("答案：b");
		
	}
	@Override
	public void TextQuestion2() {
		super.TextQuestion1();
		
		System.out.println("答案：b");
		
	}
	@Override													//原型模式不需要考虑卷面
	public void TextQuestion3() {
		super.TextQuestion1();
		
		System.out.println("答案：b");
		
	}*/

	@Override
	protected String Answer1() {
		// TODO Auto-generated method stub
		return "b";
	}
	@Override
	protected String Answer2() {
		// TODO Auto-generated method stub
		return "b";
	}
	@Override
	protected String Answer3() {
		// TODO Auto-generated method stub
		return "b";
	}
	
}
