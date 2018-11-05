package 简历类;

import java.text.Format;

public class Resume extends ICloneable{

	private String name;
	private String sex;
	
	private String age;
	private String timeArea;
	private String company;
	
	
	public Resume(String name) {
		
		this.name=name;
		
		
	}
	//设置个人信息
	public void SetPersonalInfo(String sex,String age) {
		this.sex=sex;
		this.age=age;
		
	}
	
	//设置工作经历
	
	public void SetWorkExperence(String timeArea, String company) {
		
		this.timeArea=timeArea;
		this.company=company;
		
		
	}
	
	//显示
	public void Display() {
		System.out.format("%s,%s,%s",name,sex,age);
		
		System.out.format("工作经历：%s,%s", timeArea,company);
		
		
	}
	public Object clone() {
		
		
		return (Object) this.MemberwiseClone();
		
		
	}
	
	
	
	
}
