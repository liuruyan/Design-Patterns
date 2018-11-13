package 游戏角色类;

import 角色状态存储类.RoleStateMemento;

public class Gameplayer {
	private int vit;
	private int atk;
	private int def;
	//保存角色状态
	
	public RoleStateMemento SaveState() {
		
		return (new RoleStateMemento(vit,atk,def));
	}
	
	//恢复角色状态
	public void RecoveryState(RoleStateMemento memento) {
		
		this.vit=memento.getVitality();
		this.atk=memento.getAttack();
		this.def=memento.getDefence();
	}
	//状态显示
	public void StateDisplay() {
		
		System.out.println("角色当前状态：");
		System.out.println("体力："+vit);
		System.out.println("攻击："+atk);
		System.out.println("防御："+def);
		System.out.println("");
	}
	
	//获得初始状态
	public void GenInitState() {
		
		vit=100;
		atk=100;
		def=100;
		
	}
	
	//战斗
	public void Fight() {
		
		vit=0;
		atk=0;
		def=0;
		
	}
	
	
	
	
}
