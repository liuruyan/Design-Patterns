package 大学生工厂;

import 雷锋工厂.IFactory;
import 雷锋类.LeiFeng;
import 雷锋类.Volunteer;

public class VolunteerFactory implements IFactory {

	
	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
