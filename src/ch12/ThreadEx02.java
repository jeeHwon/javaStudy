package ch12;

public class ThreadEx02 {

	public static void main(String[] args) {
		//YourThread yourThread = new YourThread();
		//이름을 제시하지 않으면 Thread-0, Thread-1..식으로 이름 자동생성
		YourThread your = new YourThread();
		//Thread(Runnable target, String name)
		Thread yourThread = new Thread(your, "너의쓰레드");//쓰레드객체생성
		yourThread.start();

	}

}

//Runnable 인터페이스를 구현해서 생성하기
//Runnable 인터페이스에는 void run() 메서드만이 있다
//아래의 클래스는 Runnable 인터페이스를 구현하는 클래스
class YourThread implements Runnable{
		public YourThread() {}
		
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				//public static Thread currentThread() :현재 실행중인 쓰레드 리턴
				System.out.print(Thread.currentThread().getName());//현재 실행중인 쓰레드 이름 가져오기
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(" run: "+i);
				System.out.println();//줄바꿈
			}
		}
		
}