package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;

public class BoardUpdate implements Command {
	private Scanner scb = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("==================");
		System.out.println("변경할 글의 번호를 입력하세요.");
		vo.setBId(scb.nextInt());scb.nextLine();
		vo  = boardService.boardSelect(vo);
		if(vo != null) {
			if(vo.getBWriter().equals(GB.NAME)) {
				vo.toString();
				System.out.println("====================");
				System.out.println("수정할 내용을 입력하세요.");
				vo.setBContents(GB.sc.nextLine());
				int n = boardService.boardUpdate(vo);
				String message = (n != 0)? "수정 성공" : "수정 실패";  //조건 연산자
				System.out.println(message);
			}else {
				System.out.println("작성자만 수정이 가능합니다.");
			}
		}else {
			System.out.println("존재하지 않는 게시글 입니다.");
		}
		System.out.println("===================");

	}
}
