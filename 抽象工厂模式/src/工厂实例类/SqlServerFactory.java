package 工厂实例类;

import 具体用户数据库.SqlserverDepartment;
import 具体用户数据库.SqlserverUser;
import 抽象工厂接口.IFactory;
import 用户接口.Idepartment;
import 用户接口.Iuser;

public class SqlServerFactory implements IFactory{


	public Iuser CreateUser() {
		// TODO Auto-generated method stub
		
		
		return new SqlserverUser();
	}


	public Idepartment CreateDepartment() {
		// TODO Auto-generated method stub
		return new SqlserverDepartment();
	}

	
	
}
