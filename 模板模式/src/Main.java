import 模板类.TextPaper;
import 考试类.TextPaperA;
import 考试类.TextPaperB;

public class Main {

	public static void main(String [] args) {
		System.out.println("学生甲抄的试卷：");
		TextPaper StudentA =new TextPaperA();
		StudentA.TextQuestion1();
		StudentA.TextQuestion2();
		StudentA.TextQuestion3();
		System.out.println("学生乙抄的试卷：");
		TextPaper StudentB =new TextPaperB();
		StudentB.TextQuestion1();
		StudentB.TextQuestion2();
		StudentB.TextQuestion3();
		
		
		
		
		
	}
	
	
}
