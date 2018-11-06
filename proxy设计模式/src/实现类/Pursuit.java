package 实现类;

import proxy设计模式接口.GiveGift;
import 被追求类.SchoolGirl;
import 实现类.Pursuit;

public class Pursuit implements GiveGift {
	SchoolGirl mm;
	public Pursuit(SchoolGirl mm) {
		this.mm=mm;
		
	}
	
	
	public void GiveDolls() {
	
		System.out.println(mm.getName()+"送你洋娃娃");

	}

	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"送你鲜花");
	}

	public void GiveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"送你巧克力");
	}

}
