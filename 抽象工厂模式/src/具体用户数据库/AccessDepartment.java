package 具体用户数据库;

import po.Department;
import 用户接口.Idepartment;

public class AccessDepartment implements Idepartment {


	public void Insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("在Access中给User表增加一条记录");

	}


	public Department GetDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access中根据id得到Department表的一条记录");
		return null;
	}

}
