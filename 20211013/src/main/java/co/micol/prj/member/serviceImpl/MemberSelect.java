package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		MemberVO members = new MemberVO();
		System.out.println("==================");
		System.out.println("조회할 아이디를 입력하세요.");
		members.setId(scb.nextLine());
		members = memberService.memberSelect(members);
		
		System.out.print(members.getId() + " : ");
		System.out.print(members.getName() + " : ");
		System.out.print(members.getPassword() + " : ");
		System.out.print(members.getTel() + " : ");
		System.out.print(members.getAddress() + " : ");
		System.out.println(members.getAuthor());

	}

}
