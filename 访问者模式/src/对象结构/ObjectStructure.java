package 对象结构;

import java.util.LinkedList;
import java.util.List;

import 人抽象类.Person;
import 状态抽象类.Action;

public class ObjectStructure {

	private List<Person> elements = new LinkedList<Person>();
	//增加
	public void Attach(Person element) {
		
		elements.add(element);
	}
	
	//移除
	public void Detach(Person element) {
		
		elements.remove(element);
	}
	//查看显示
	
	public void Display(Action visitor) {
		
		for(Person e : elements) {
			
			e.Accept(visitor);
			
		}
		
		
	}
	
}
