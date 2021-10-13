package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;

public class BoardInsert implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {

		BoardVO vo = new BoardVO(); 
		System.out.println("======================");
		System.out.println("작성자를 입력하세요? \n");
		vo.setBWriter(scb.nextLine());
		System.out.println("제목을 입력하세요? \n");
		vo.setBTitle(scb.nextLine());
		System.out.println("내용을 입력하세요? \n");
		vo.setBContents(scb.nextLine());
			
		int n = boardService.boardInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		}else {
			System.out.println("등록이 실패되었습니다.");
		}

	}

}
