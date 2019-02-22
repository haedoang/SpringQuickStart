package kr.co.haedoang.board;

import java.util.List;

public interface BoardService {
	
	//CRUD 기능 메소드 구현..
	//insert
	void insertBoard(BoardVO vo);
	//update
	void updateBoard(BoardVO vo);
	//delete
	void deleteBoard(BoardVO vo);
	//detail
	BoardVO getBoard(BoardVO vo);
	//list
	List<BoardVO> getBoardList(BoardVO vo);
}
