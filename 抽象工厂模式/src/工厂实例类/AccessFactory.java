package ����ʵ����;

import �����û����ݿ�.AccessDepartment;
import �����û����ݿ�.AccessUser;
import ���󹤳��ӿ�.IFactory;
import �û��ӿ�.Idepartment;
import �û��ӿ�.Iuser;

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
