import 实现类.Proxy;
import 被追求类.SchoolGirl;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolGirl jiaojiao=new SchoolGirl();
		jiaojiao.setName("李娇娇");
		
		Proxy daili= new Proxy(jiaojiao);
		
		daili.GiveDolls();
		daili.GiveFlowers();
		daili.GiveChocolate();
		
		
	}

}
