import ʵ����.Proxy;
import ��׷����.SchoolGirl;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolGirl jiaojiao=new SchoolGirl();
		jiaojiao.setName("���");
		
		Proxy daili= new Proxy(jiaojiao);
		
		daili.GiveDolls();
		daili.GiveFlowers();
		daili.GiveChocolate();
		
		
	}

}
