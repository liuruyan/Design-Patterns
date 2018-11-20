package Leaf;

import Component.Component;

public class Leaf extends Component {
	public char[] Depth=new char[100]  ;
	
	
	
	
	public Leaf(String name) {

		
		super(name);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Component c) {
		// TODO Auto-generated method stub
		
		System.out.println("Cannot add to leaf");
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove from a leaf");
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub

		System.out.println(new String(Depth,1,depth)+name );
	}

}
