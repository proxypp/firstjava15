package co.micol.prj.comm;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;


public interface Command {
	public BoardService boardService = new BoardServiceImpl();
	public MemberService memberService = new MemberServiceImpl();
	
	public void execute();
}
