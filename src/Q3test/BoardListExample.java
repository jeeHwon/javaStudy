package Q3test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoardListExample {

	public static void main(String[] args) {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		Iterator<BoardDTO> it;
		BoardDAO dao = new BoardDAO();

		dao.setBoardDTO("[공지] 마스크 착용", "마스크 착용을 생활화 하세요!");
		dao.setBoardDTO("[공지] 수업예절", "수업중에 핸드폰은 무음이나 진동으로 해주세요!");
		dao.setBoardDTO("[공지] 출석체크", "입실 퇴실시 QR코드를 이요하세요!");

		list = dao.getBoardList();
		it = list.iterator();

		while(it.hasNext()) {
			BoardDTO dto = it.next();
			System.out.printf("%s - %s\n", dto.getTitle(), dto.getContent());
		}
	}

}