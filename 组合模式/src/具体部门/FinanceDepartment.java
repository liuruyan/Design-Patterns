package 具体部门;

import 公司类.Company;
import 具体公司.ConcreteCompany;

public class FinanceDepartment extends Company {
	private ConcreteCompany cp = new ConcreteCompany(name);
	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(new String(cp.Depth,1,depth)+name);
		
		
	}

	@Override
	public void LyetyeineOfDuty() {
		// TODO Auto-generated method stub
		
		System.out.println(name+"公司财务收支管理");
		
	}

}
