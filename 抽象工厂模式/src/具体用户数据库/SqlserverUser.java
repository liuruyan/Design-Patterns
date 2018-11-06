package 具体用户数据库;

import po.User;
import 用户接口.Iuser;

public class SqlserverUser implements Iuser {

	public void Insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在SQL server中给User表增加一条记录");

	}

	public User GetUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQL server中根据id 得到User表的一条记录");
		
		return null;
	}

}
