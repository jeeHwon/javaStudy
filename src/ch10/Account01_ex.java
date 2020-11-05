package ch10;

public class Account01_ex {

	public static void main(String[] args) {
		Account01 account = new Account01();
		
		//입금하기
		account.deposit(100000);
		
		//잔고확인
		System.out.println(account.getBalance());
		
		//출금하기
		try {
			account.withDraw(150000);
		} catch (BalanceInsufficientException e) {
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
		}
		System.out.println("출금 후 잔고: "+account.getBalance());
	}
}
