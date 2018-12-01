package 安理会;

import 具体国家.Iraq;
import 具体国家.USA;
import 国家类.Country;
import 联合国机构类.UnitedNations;

public class UnitedNationsSecurityCouncil extends UnitedNations {

	
	private USA country1;
	private Iraq country2;
	

	public void setCountry1(USA country1) {
		this.country1 = country1;
	}

	public void setCountry2(Iraq country2) {
		this.country2 = country2;
	}




	@Override
	public void Declare(String message, Country colleague) {
		// TODO Auto-generated method stub
		
		if(colleague == country1) {
			
			country2.GetMessage(message);
		}
		
		else {
			
			country1.GetMessage(message);
		}
	}

}
