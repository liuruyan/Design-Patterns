package 工厂实例类;

import 具体用户数据库.AccessDepartment;
import 具体用户数据库.AccessUser;
import 抽象工厂接口.IFactory;
import 用户接口.Idepartment;
import 用户接口.Iuser;

public class AccessFactory implements IFactory{

	public Iuser CreateUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}

	public Idepartment CreateDepartment() {
		// TODO Auto-generated method stub
		return new AccessDepartment();
	}

}
