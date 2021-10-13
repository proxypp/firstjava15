package co.micol.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;
import co.micol.prj.member.service.MemberVO;

public class MemberList implements Command {

	@Override
	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			List<MemberVO> vo = new ArrayList<MemberVO>();
			vo = memberService.memberSelectList();

			if (vo != null) {
				for (MemberVO member : vo) {
					member.toListString();
				}
			} else {
				System.out.println("등록된 회원이 없습니다.");
			}
		} else {
			System.out.println("ADMIN 계정으로 접속해야 사용할 수 있습니다.");
		}
	}
}
