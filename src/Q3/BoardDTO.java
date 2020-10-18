package Q3;

public class BoardDTO {
	//title과 content 선언 field
	//private 써서 다른 클래스에서 접근 못하게 방어!
	private String title;
	private String content;
	
	//constructor에서 title, content받아 객체 생성하게끔 강제
	public BoardDTO(String title, String content){
		this.title = title;
		this.content = content;
	}
	
	//setter/getter method 구성
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	//클래스값의 로그 등을 확인할 때 필요하다고 한다.
	//아직 잘 와닿지는 않는다!
	@Override
	public String toString() {
		return "BoardDTO [title=" + title + ", content=" + content + "]";
	}
}
