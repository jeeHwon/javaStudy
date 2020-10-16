package Q3test;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	private List<BoardDTO> list = new ArrayList<BoardDTO>();

	public BoardDAO() {
		if (list == null)
			list = new ArrayList<BoardDTO>();
	}

	public List<BoardDTO> getBoardList() {
		return list;
	}

	public void setBoardDTO(String title, String content) {
		list.add(new BoardDTO(title, content));
	}

}