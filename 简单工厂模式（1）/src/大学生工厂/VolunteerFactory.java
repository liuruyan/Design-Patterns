package ��ѧ������;

import �׷湤��.IFactory;
import �׷���.LeiFeng;
import �׷���.Volunteer;

public class VolunteerFactory implements IFactory {

	
	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
