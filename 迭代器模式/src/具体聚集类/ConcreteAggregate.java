package 具体聚集类;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import 具体迭代器类.ConcreteIterator;
import 聚集抽象类.Aggregate;
import 迭代器抽象类.Iterator;

public class ConcreteAggregate extends Aggregate {

	private List<Object> items = new LinkedList<Object>();
	private int count;
	public int getCount() {
		return items.size();
	}


	public void add(int index,Object item) {
		
		items.add(index, item);
	
	}
	
	public Object get(int index) {
		
		return items.get(index);
		
	}

	
	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

	
	
	
}
