package 角色状态存储类;

public class RoleStateMemento {

	private int vit;
	private int atk;
	private int def;
	public int getVitality() {
		return vit;
	}
	public void setVitality(int vit) {
		this.vit = vit;
	}
	public int getAttack() {
		return atk;
	}
	public void setAttack(int atk) {
		this.atk = atk;
	}
	public int getDefence() {
		return def;
	}
	public void setDefence(int def) {
		this.def = def;
	}
	
	//将生命力，攻击力，防御力存到状态存储对象里
	public RoleStateMemento (int vit,int atk,int def) {
		
		this.vit=vit;
		this.atk=atk;
		this.def=def;
		
	}
	
	
	
}
