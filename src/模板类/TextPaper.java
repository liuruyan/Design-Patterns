package 模板类;

public abstract class TextPaper {

	public void TextQuestion1() {
		
		System.out.println("杨过得到，后来balabala");
		
		System.out.println("答案"+Answer1());
	}
	
	
	public void TextQuestion2() {
		
		System.out.println("杨过，程英，陆无双balabala");
		System.out.println("答案"+Answer2());
	}
	
	public void TextQuestion3() {
		
		System.out.println("蓝凤凰致使华山balabala");
		System.out.println("答案"+Answer3());
	}
	
	protected abstract String Answer1() ;
	protected abstract String Answer2() ;
	protected abstract String Answer3() ;
	

	
}
