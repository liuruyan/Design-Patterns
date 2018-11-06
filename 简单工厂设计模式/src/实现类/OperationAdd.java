package 实现类;

import 运算类接口.Operation;

public class OperationAdd extends Operation {


@Override
public double GetResult() {
	
	double result =0;
	result=getNumber1()+getNumber2();
	return result;
	
}

}
