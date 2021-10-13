package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("==================");
		System.out.println("조회할 글 번호를 입력하세요.");
		board.setBId(scb.nextInt());
		board = boardService.boardSelect(board);
		boardService.boardHitUpdate(board.getBId());
		
		if(board != null) {
			board.toString();
		}
		System.out.println("=======================");
	}

}
