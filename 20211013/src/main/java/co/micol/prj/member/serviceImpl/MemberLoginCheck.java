package co.micol.prj.member.serviceImpl;

import java.util.Scanner;
import co.micol.prj.comm.GB;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;
import co.micol.prj.menu.Menu;

public class MemberLoginCheck {
	private Scanner scb = new Scanner(System.in);
	public void run() {
		MemberVO vo;
		boolean b = false;
		do {
			MemberService memberService = new MemberServiceImpl();
			vo = new MemberVO();
			System.out.println("===== 로그인 해주세요. ======");
			System.out.println("아이디를 입력하세요.");
			vo.setId(scb.nextLine());
			System.out.println("패스워드를 입력하세요.");
			vo.setPassword(scb.nextLine());
			vo = memberService.memberSelect(vo);
			if (vo != null) {
				GB.NAME = vo.getName();
				GB.AUTHOR = vo.getAuthor();
				b = true;
			} else {
				System.out.println("패스워드가 틀렸습니다.");
				}
			}while (!b);
		}
	}
