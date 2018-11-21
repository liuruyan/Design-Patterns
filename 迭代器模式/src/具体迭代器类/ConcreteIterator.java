package 具体迭代器类;

import 具体聚集类.ConcreteAggregate;
import 迭代器抽象类.Iterator;

public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		
		this.aggregate=aggregate;
		
	}
	
	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return aggregate.get(0);
	}

	@Override
	public Object Next() {
		// TODO Auto-generated method stub
		Object ret = null;
		current++;
		if(current<aggregate.getCount()) {
			
			ret = aggregate.get(current);
			
		}
		
		
		
		return ret;
	}

	@Override
	public boolean IsDone() {
		// TODO Auto-generated method stub
		return current>=aggregate.getCount()? true:false;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return aggregate.get(current);
	}

}
