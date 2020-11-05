package ch10;

//사용자 정의 예외 클래스
//입금 및 출력
public class Account01 {
	private long balance;	//잔고
	
	//constructor
	public Account01() {}
	
	//잔고조회
	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int money) {
		balance += money;
	}
	
	//출금
	public void withDraw(int money) throws BalanceInsufficientException {
		if (balance<money) {
			//사용자 정의 예외 발생
			throw new BalanceInsufficientException("잔고부족: "+(money-balance)+"원이 모자람");
		}
		balance -= money;
	}
	

}
