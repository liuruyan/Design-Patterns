package Composite;
import java.util.ArrayList;
import java.util.List;

import Component.Component;
import Leaf.Leaf;

public class Composite extends Component {
	
	
	private List<Component> children =new ArrayList<Component>();
	private Leaf lf = new Leaf(name);
	
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
		
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(new String(lf.Depth,1,depth)+name);
		
		for ( Component component : children){
			
			component.Display(depth+2);
			
		}
		
	}

}
