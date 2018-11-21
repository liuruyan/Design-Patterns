package Main;

import 具体聚集类.ConcreteAggregate;
import 具体迭代器类.ConcreteIterator;
import 迭代器抽象类.Iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate que = new ConcreteAggregate();
		
		que.add(0, "大鸟");
		que.add(1, "小菜");
		que.add(2, "行李");
		que.add(3, "老外");
		que.add(4, "公交内部员工");
		que.add(5, "小偷");
		
		Iterator i = new ConcreteIterator(que);
		//Object item=i.First();
		while(!i.IsDone()) {
			
			System.out.println(i.CurrentItem()+"请买票");
			i.Next();
			
		}
	}

}
