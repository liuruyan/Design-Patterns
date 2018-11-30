package Main;

import 具体国家.Iraq;
import 具体国家.USA;
import 安理会.UnitedNationsSecurityCouncil;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
		
		USA country1 = new USA(UNSC);
		Iraq country2 = new Iraq(UNSC);
		
		UNSC.setCountry1(country1);
		UNSC.setCountry2(country2);
		
		country1.Declare("不准许研制核武器，否则要发动战争！");
		country2.Declare("我们没有核武器，也不怕侵略。");
		
		
	}

}
