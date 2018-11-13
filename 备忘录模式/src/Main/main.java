package Main;

import 游戏角色类.Gameplayer;
import 角色状态管理者.RoleStateCaretaker;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//大战Boss前
		Gameplayer ln = new Gameplayer();
		ln.GenInitState();
		ln.StateDisplay();
		
		//保存进度
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(ln.SaveState());
		
		//大战Boss后,损耗严重
		ln.Fight();
		ln.StateDisplay();
		
		
		//恢复之前状态
		ln.RecoveryState(stateAdmin.getMemento());
		ln.StateDisplay();
		
		
		
	}

}
