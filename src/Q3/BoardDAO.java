package Q3;

import java.util.ArrayList;

public class BoardDAO {
	//field
	//DTO객체를 담는 ArrayList 주소를 참조변수 dtos에 부여하는 선언부
	//dtos는 BoardDTO 객체만 받게 강제
	private ArrayList<BoardDTO> dtos = new ArrayList<BoardDTO>();
	
	public BoardDAO() {}//default constructor

	//DTO 객체가 담긴 dtos를 ArrayList 형태로 리턴해주는 method
	public ArrayList<BoardDTO> getBoardList(){ 
		return dtos;
	}
	
	//insert method
	//title과 content를 파라미터로 받아 새로운 객체 DTO를 생성하고 dtos에 추가
	public void insert(String title, String content ) {
		dtos.add(new BoardDTO(title, content));
		System.out.printf("'%s'이 등록되었습니다\n",title);
	}
	
	//select method
	//입력한 index의 객체가 가진 title과 content를 출력
	public void select(int index) {
		System.out.printf("-----%s번게시글-----\n",index+1);
		System.out.print(this.getBoardList().get(index).getTitle()+"   -   ");
		System.out.print(this.getBoardList().get(index).getContent()+"\n");
	}
	public void select () {//override : index 지정 안할 경우 전체 출력 
		System.out.println("-----전체게시글-----");
		for (int i = 0; i < this.getBoardList().size(); i++) {
			System.out.print(this.getBoardList().get(i).getTitle()+"   -   ");
			System.out.print(this.getBoardList().get(i).getContent()+"\n");
		}
		System.out.println("------------------");
	}
	
	//update method
	//title과 content를 받아 같은 title을 가진 객체를 찾아 새로운 content로 수정 
	public void update(String title, String content) {
		for (int i = 0; i < this.getBoardList().size(); i++) {
			if (title.equals(this.getBoardList().get(i).getTitle())) {
				this.getBoardList().get(i).setContent(content);
				System.out.println("------------------");
				System.out.printf("'%s'이 수정되었습니다\n",title);
				return;
			} 
		}
		System.out.println("해당 제목의 글을 찾을 수 없습니다");
	}
	
	//delete method
	//title을 받아 dto 객체 중 같은 title을 가진 객체를 찾아 객체를 삭제
	public void delete(String title) {
		for (int j = 0; j < this.getBoardList().size(); j++) {
			if (title.equals(this.getBoardList().get(j).getTitle())) {
				this.getBoardList().remove(getBoardList().get(j));
				System.out.println("------------------");
				System.out.printf("'%s'이 삭제되었습니다\n",title);
				return;
			}
		}
		System.out.println("해당 제목의 글을 찾을 수 없습니다");
	}
	//위 DAO 코드는 중복되는 제목을 가진 글에 대해서 구현 못하는 한계
	//따라서 객체(게시글)마다 고유값(ID Primary key)을 부여함이 바람직 할것.
}
