package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;
import co.micol.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private Scanner scb = new Scanner(System.in);

	@Override
	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			MemberVO vo = new MemberVO();
			System.out.println("==============");
			System.out.println("삭제할 아이디를 입력하세요.");
			vo.setId(scb.nextLine());
			int n = memberService.memberDelete(vo);
			if (n != 0) {
				System.out.println("정상적으로 삭제 되었습니다.");
			} else {
				System.out.println("게시글 삭제 실패입니다.");
			}
		} else {
			System.out.println("ADMIN 계정으로 접속해야 사용할 수 있습니다.");
		}
	}
}
