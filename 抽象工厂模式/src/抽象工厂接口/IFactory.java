package 抽象工厂接口;

import 用户接口.Idepartment;
import 用户接口.Iuser;

public interface IFactory {

	Iuser CreateUser();
	
	Idepartment CreateDepartment();
	
}
