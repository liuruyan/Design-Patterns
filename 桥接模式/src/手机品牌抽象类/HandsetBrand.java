package 手机品牌抽象类;

import 手机软件抽象类.HandsetSoft;

public abstract class HandsetBrand {

	protected HandsetSoft soft;
	
	public void SetHandsetSoft (HandsetSoft soft) {
		
		this.soft = soft;
	}
	
	public abstract void Run();
	
}
