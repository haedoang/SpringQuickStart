package kr.co.haedoang.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		//1.Spring container 구동하기.
		AbstractApplicationContext factory 
			= new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 BoardServiceImple 객체를 lookup한다.
		BoardService boardService = (BoardService)factory.getBean("boardService");
		
		//3. 글 등록 기능 테스트..
		BoardVO vo = new BoardVO();
//		vo.setTitle("임시 제목");
//		vo.setWriter("홍길동");
//		vo.setContent("임시내용입니다...");
//		boardService.insertBoard(vo);
		
		//4. 글 목록 검색 테스트..
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		for(BoardVO b : boardList) {
			System.out.println(b.toString());
		}
		
		//5. container 종료
		factory.close();
	}
}
