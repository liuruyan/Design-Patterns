package 具体用户数据库;

import po.User;
import 用户接口.Iuser;

public class AccessUser implements Iuser {


	public void Insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在Access中给User表增加一条记录");
	}


	public User GetUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access中根据ID得到User表的一条记录");
		
		return null;
	}

}
