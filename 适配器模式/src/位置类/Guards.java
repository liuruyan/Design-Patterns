package 位置类;

import 球员类.Player;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("后卫"+name+"进攻！");
		
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("后卫"+name+"进攻！");
		
	}

}
