package Main;

import 手机品牌实现类.HandsetBrandM;
import 手机品牌实现类.HandsetBrandN;
import 手机品牌抽象类.HandsetBrand;
import 手机软件实现类.HandsetAddressList;
import 手机软件实现类.HandsetGame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandsetBrand ab;
		
		ab = new HandsetBrandN();
		
		ab.SetHandsetSoft(new HandsetGame());
		ab.Run();
		
		ab.SetHandsetSoft(new HandsetAddressList());
		ab.Run();
		
		ab = new HandsetBrandM();

		ab.SetHandsetSoft(new HandsetGame());
		ab.Run();
		
		ab.SetHandsetSoft(new HandsetAddressList());
		ab.Run();
		
		
	}

}
