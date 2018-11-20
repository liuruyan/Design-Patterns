package 公司类;

public abstract class Company {

	
	protected String name;
	
	public Company(String name) {
		
		this.name= name;
	}
	
	public abstract void Add (Company c);//增加
	public abstract void Remove (Company c);//移除
	public abstract void Display(int depth);
	public abstract void LyetyeineOfDuty ();//履行职责
	
}
