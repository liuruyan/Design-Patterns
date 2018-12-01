package Main;

import 人具体类.Man;
import 人具体类.Woman;
import 对象结构.ObjectStructure;
import 状态具体类.Amativeness;
import 状态具体类.Failing;
import 状态具体类.Success;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ObjectStructure o = new ObjectStructure();
		o.Attach(new Man());
		o.Attach(new Woman());
		
		//成功时的反映
		Success v1 = new Success();
		o.Display(v1);
		//失败时的反映
		Failing v2 = new Failing();
		o.Display(v2);
		//恋爱时的反映
		Amativeness v3 = new Amativeness();
		o.Display(v3);
	}

}
