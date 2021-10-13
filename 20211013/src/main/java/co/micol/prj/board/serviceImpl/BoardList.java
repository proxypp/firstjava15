package co.micol.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardList implements Command {

	@Override
	public void execute() {
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = boardService.boardSelectList();
		
		System.out.println("=====공지사항 목록======");
		for(BoardVO board : boards) {
			board.toListString();
		}
		System.out.println("=====공지사항 목록 끝======");
	}

}
