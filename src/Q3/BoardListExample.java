package Q3;

public class BoardListExample {

	public static void main(String[] args) {
		//DAO 멤버 호출하기 위해 DAO 객체 생성
		BoardDAO dao = new BoardDAO();
		
		//DAO의 method 이용해서 제목, 내용을 받아 dtos 리스트에 DTO로 형태로 CRUD
		dao.insert("제목1", "내용1");//게시글 등록
		dao.insert("제목2", "내용2");
		dao.insert("제목3", "내용33");
		dao.insert("제목4", "내용4");
	
		dao.delete("제목4");	//게시글 삭제
		
		dao.update("제목3", "내용3");//게시글 수정
	
		dao.select();//게시글 조회
	}
}
