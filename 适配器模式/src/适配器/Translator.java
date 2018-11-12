package 适配器;

import 位置类.ForeginCenter;
import 球员类.Player;

public class Translator extends Player {		//适配器继承用户接口
	
	private ForeginCenter wjzf = new ForeginCenter();		

	public Translator(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		wjzf.setName(name);
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		wjzf.进攻a();
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		wjzf.防守d();
		
	}

}
