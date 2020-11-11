package ch12;

public class ThreadEx01 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread("뜨래드");	//쓰레드 객체 생성
		//이름을 제시하지 않으면 Thread-0, Thread-1...로 자동으로 이름 만든다
		myThread.start();	//myThread를 시작시키는 부분
		//start()메서드를 호출하면 새로운 callback을 할당받고
		//Runnable 상태가 되었다가 쓰레드 스케줄러에 의해서 선택되면
		//해당 쓰레드의 run()이 실행된다.
	}

}

//Thread 클래스를 상속받아 생성하기
class MyThread extends Thread {
	public MyThread() {}
	public MyThread(String name) {super(name);}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//public static Thread currentThread() :현재 실행중인 쓰레드 리턴
			System.out.print(currentThread().getName());//현재 실행중인 쓰레드 이름 가져오기
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(" run: "+i);
			System.out.println();//줄바꿈
		}
	}
}
