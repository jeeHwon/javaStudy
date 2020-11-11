package ch12;

//동기화 코드
//열차예매시스템으로 가정, 여러매표소에서 쓰레드 이용해서 좌석을 예매
//현재 잔여 좌석이 1개 남아 있을 경우 여러 쓰레드에서 동시에 열차를 예매하는 
//메소드에 접근 할 수 있다고 가정

//잔여 좌석은 1개인데 여러 쓰레드에서 동시에 메서드에 접근해서 예매처리가 된다
//이런 경우의 작업을 처리할 때는 한 쓰레드가 메서드에 접근해서 예매 작업을 실행 할 때에
//다른 쓰레드에서 해당 메서드에 접근 할 수 없게 처리하는 작업이 필요
//==>동기화 작업(Synchronized)
public class SynchronizedEx02 {

	public static void main(String[] args) {
		Ticket02 tck = new Ticket02();
		//runnable 구현했을 땐 반드시 쓰레드생성
		Thread tr1 = new Thread(tck, "구매자 박보영님");
		Thread tr2 = new Thread(tck, "구매자 류아벨님");
		tr1.start();
		tr2.start();
				
	}

}
//예매작업
class Ticket02 implements Runnable{
	
	int ticketNum = 10;	//잔여 좌석수
	
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			try {
				Thread.sleep(1000);
				getTicket();//티켓구매함수 호출
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//티켓구매함수
	public synchronized void getTicket() {
		ticketNum -= 1;
		System.out.print(Thread.currentThread().getName()+"구매 - ");
		if (ticketNum<=0) {
			System.out.println("잔여 좌석이 없습니다");
			return;
		}
		
		System.out.println("현재 잔여좌석수: "+ticketNum);
	}
}
