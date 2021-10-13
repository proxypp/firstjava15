package co.micol.prj.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.micol.prj.board.serviceImpl.BoardDelete;
import co.micol.prj.board.serviceImpl.BoardInsert;
import co.micol.prj.board.serviceImpl.BoardList;
import co.micol.prj.board.serviceImpl.BoardSelect;
import co.micol.prj.board.serviceImpl.BoardUpdate;
import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;
import co.micol.prj.member.serviceImpl.MemberDelete;
import co.micol.prj.member.serviceImpl.MemberInsert;
import co.micol.prj.member.serviceImpl.MemberList;
import co.micol.prj.member.serviceImpl.MemberSelect;
import co.micol.prj.member.serviceImpl.MemberUpdate;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();

	public void init() {
		map.put("boardList", new BoardList());
		map.put("boardSelect", new BoardSelect());
		map.put("boardInsert", new BoardInsert());
		map.put("boardUpdate", new BoardUpdate());
		map.put("boardDelete", new BoardDelete());
		map.put("memberList", new MemberList());
		map.put("memberSelect", new MemberSelect());
		map.put("memberInsert", new MemberInsert());
		map.put("memberUpdate", new MemberUpdate());
		map.put("memberDelete", new MemberDelete());
	}

	public void MainMenu() {
		System.out.println("=====================");
		System.out.println("====1. 멤버 관리 =======");
		System.out.println("====2. 공지 관리 =======");
		System.out.println("====3. 종 료 ==========");
		System.out.println("=====================");
		System.out.println(" 원하는 작업을 선택하세요. ");
	}

	private void memberTitle() {
		System.out.println("=====================");
		System.out.println("====1.회원 목록 조회 ===");
		System.out.println("====2.회원 정보 조회 ====");
		System.out.println("====3.회원 정보 등록 ====");
		System.out.println("====4.회원 정보 수집  ===");
		System.out.println("====5.회원 정보 삭제 ====");
		System.out.println("====6.메인 메뉴 가기 ====");
		System.out.println("======================");
		System.out.println(" 원하는 작업을 선택하세요. ");

	}

	private void boardTitle() {
		System.out.println("=====================");
		System.out.println("====1.공지 사항 목록 ===");
		System.out.println("====2.공지 사항 조회 ====");
		System.out.println("====3.공지 사항 등록 ====");
		System.out.println("====4.공지 사항 수집  ===");
		System.out.println("====5.공지 사항 삭제 ====");
		System.out.println("====6.메인 메뉴 가기 ====");
		System.out.println("======================");
		System.out.println(" 원하는 작업을 선택하세요. ");
	}

	private void menu() {
		while(true) {
			MainMenu();
			int jobNo = GB.sc.nextInt();
			switch(jobNo) {
				case 1 :
					memberManagement();
					break;
				case 2 :
					boardManagement();
					break;
				case 3 :
					System.out.println("프로그램 완전히 종료합니다.");
					GB.sc.close();
					return;
				default :
					System.out.println("잘못된 키를 입력하였습니다.");
			}
		}
	}

	private void boardManagement() {
		boolean b = false;
		do {
			boardTitle();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("boardList");
				break;
			case 2:
				executeRun("boardSelect");
				break;
			case 3:
				executeRun("boardInsert");
				break;
			case 4:
				executeRun("boardUpdate");
				break;
			case 5:
				executeRun("boardDelete");
				break;
			case 6:
				b = true;
				break;
			}
		} while (!b);

	}

	private void memberManagement() {
		boolean b = false;
		do {
			memberTitle();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				executeRun("memberList");
				break;
			case 2:
				executeRun("memberSelect");
				break;
			case 3:
				executeRun("memberInsert");
				break;
			case 4:
				executeRun("memberUpdate");
				break;
			case 5:
				executeRun("memberDelete");
				break;
			case 6:
				b = true;
				break;
			}
		} while (!b);

	}

	private void executeRun(String string) {
		// 실행할 명령을 구현한다. 인터페이스는 자기자신을 선언할수 없다.
		Command command = map.get(string);
		command.execute();

	}

	public void run() {
		init();
		menu();

	}
}
