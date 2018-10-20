package 大学生工厂;

import 雷锋工厂.IFactory;
import 雷锋类.LeiFeng;
import 雷锋类.Undergraduate;

public class UndergraduateFactory implements IFactory {


	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
	
			return new Undergraduate();
			
		
		
	}

}
