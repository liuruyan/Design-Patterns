package main;

import po.Department;
import po.User;
import 工厂实例类.SqlServerFactory;
import 抽象工厂接口.IFactory;
import 用户接口.Idepartment;
import 用户接口.Iuser;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user =new User();
		Department dept=new Department();
		IFactory factory=new SqlServerFactory();  //若要更改成Access数据库，只需要将本句改成IFactory factory = new AccessUser（）
		Iuser iu=factory.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		
		Idepartment id =factory.CreateDepartment();
		id.Insert(dept);
		id.GetDepartment(1);

	}

}
