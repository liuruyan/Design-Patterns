package ����ʵ����;

import �����û����ݿ�.SqlserverDepartment;
import �����û����ݿ�.SqlserverUser;
import ���󹤳��ӿ�.IFactory;
import �û��ӿ�.Idepartment;
import �û��ӿ�.Iuser;

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
