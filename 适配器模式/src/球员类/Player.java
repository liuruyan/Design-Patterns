package 球员类;

public abstract class Player {

	protected String name;
	public Player (String name) {
		
		this.name=name;
	}
	public abstract void Attack();			//进攻方法
	public abstract void Defense();			//防守方法
	
}
