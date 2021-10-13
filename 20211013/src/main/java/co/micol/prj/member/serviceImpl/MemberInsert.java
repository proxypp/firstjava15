package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;
import co.micol.prj.member.service.MemberVO;

public class MemberInsert implements Command {
	private Scanner scb = new Scanner(System.in);

	@Override
	public void execute() {
		if(GB.AUTHOR.equals("ADMIN")) {
		MemberVO vo = new MemberVO();
		System.out.println("======================");
		System.out.println("아이디를 입력하세요? \n");
		vo.setId(scb.nextLine());
		System.out.println("이름을 입력하세요? \n");
		vo.setName(scb.nextLine());
		System.out.println("패스워드를 입력하세요? \n");
		vo.setPassword(scb.nextLine());
		System.out.println("전화번호를 입력하세요? \n");
		vo.setTel(scb.nextLine());
		System.out.println("주소를 입력하세요");
		vo.setAddress(scb.nextLine());
		int n = memberService.memberInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록이 실패되었습니다.");
		}
	}else {
		System.out.println("관리자 권한이 없습니다.");
		System.out.println("관리자 권한이 필요합니다.^^");
	}
	}
}
