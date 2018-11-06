package 用户接口;

import po.User;

public interface Iuser {

	void Insert (User user);
	
	User GetUser(int id);
	
}
