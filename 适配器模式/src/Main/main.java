package Main;

import 位置类.Forwards;
import 位置类.Guards;
import 球员类.Player;
import 适配器.Translator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player b= new Forwards("巴蒂尔");
		
		Player m= new Guards("麦克格雷迪");
		
		Player ym= new Translator("姚明");
		
		b.Attack();
		m.Attack();
		
		ym.Attack();
		ym.Defense();
	}

}
