package co.micol.prj.board.service;

import java.util.List;

public interface BoardMapper {
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	int updateHit(int id);
	int boardHitUpdate(int id); //조회시 카운트 증가
}
