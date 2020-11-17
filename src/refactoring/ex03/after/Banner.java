package refactoring.ex03.after;

//리팩토링 기준 : 메서드 추출
//문제 : 하나의 메서드가 너무 길다
//방법 : 기존의 메서드에서 묶을 수 있는 코드를 추출해서 별도의 메서드 작성
//단점 : 메서드의 개수가 증가한다. 각 메서드의 길이는 짧아진다
//주의 : 오버라이딩 메서드는 제외

//단계 1 : 새로운 메서드에 적절한 이름 붙이기. 동사+명사 형식 선호, 무엇을 하는지 표현
//단계 2 : 기존메서드에서 새로운 메서드로 코드 복사
//단계 3 : 메서드 내부의 지역변수 검토
//단계 4 : 메서드 매개변수 검토
//단계 5 : 메서드 리턴 유형(값) 검토

public class Banner {
    private final String _content;
    public Banner(String content) {
        _content = content;
    }
    public void print(int times) {
    	printBorder();
    	printContent(times);
        printBorder();
    }
    //단계 1 : 새로운 메서드에 적절한 이름 붙이기. 동사+명사 형식 선호, 무엇을 하는지 표현
    //단계 4 : 메서드 매개변수 검토
    //단계 5 : 메서드 리턴 유형(값) 검토
    public void printBorder() {
    	//단계 2 : 기존메서드에서 새로운 메서드로 코드 복사
        System.out.print("+");
        //단계 3 : 메서드 내부의 지역변수 검토
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public void printContent(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("|" + _content + "|");
        }
    }
}
