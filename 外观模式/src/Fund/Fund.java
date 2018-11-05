package Fund;

import 股票类.Stock1;
import 股票类.Stock2;
import 股票类.Stock3;

public class Fund {

	Stock1 gu1;
	Stock2 gu2;
	Stock3 gu3;
	
	public Fund() {
		gu1=new Stock1();
		gu2=new Stock2();
		gu3=new Stock3();
		
		
	}
	
	public void BuyFund() {
		
		gu1.Buy();
		gu2.Buy();
		gu3.Buy();
	}
	public void SellFund() {
		
		gu1.Sell();
		gu2.Sell();
		gu3.Sell();
	}
	
	
	
}
