package main;

import po.Department;
import po.User;
import ����ʵ����.SqlServerFactory;
import ���󹤳��ӿ�.IFactory;
import �û��ӿ�.Idepartment;
import �û��ӿ�.Iuser;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user =new User();
		Department dept=new Department();
		IFactory factory=new SqlServerFactory();  //��Ҫ���ĳ�Access���ݿ⣬ֻ��Ҫ������ĳ�IFactory factory = new AccessUser����
		Iuser iu=factory.CreateUser();
		iu.Insert(user);
		iu.GetUser(1);
		
		Idepartment id =factory.CreateDepartment();
		id.Insert(dept);
		id.GetDepartment(1);

	}

}
