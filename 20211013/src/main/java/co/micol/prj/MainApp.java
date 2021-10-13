package co.micol.prj;

import co.micol.prj.comm.GB;
import co.micol.prj.member.serviceImpl.MemberLoginCheck;
import co.micol.prj.menu.Menu;

public class MainApp {
	
	public static void main(String[] args) {
		MemberLoginCheck login = new MemberLoginCheck();
		Menu menu = new Menu();
		login.run();
		menu.run();
		GB.sc.close();
	}
}	
