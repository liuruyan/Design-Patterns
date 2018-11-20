package 具体公司;

import java.util.ArrayList;
import java.util.List;

import 公司类.Company;

public class ConcreteCompany extends Company {

	public  char[] Depth = new char[100];
	private List<Company> children = new ArrayList <Company>();
	
	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void LyetyeineOfDuty() {
		// TODO Auto-generated method stub
		for(Company company : children) {
			
			company.LyetyeineOfDuty();
			
		}
		
		
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(new String(Depth,1,depth)+name);
		
		for(Company company : children) {
			
			company.Display(depth+2);
			
		}
	}

}
