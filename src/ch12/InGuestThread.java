package ch12;

//손님이 들어오는 기능을 정의한 클래스
public class InGuestThread extends Thread {
	InOutEx01 io;
	
	
	public InGuestThread(InOutEx01 io) {
		this.io = io;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 110; i++) {
			try {
				double n = Math.random()*1000;
				Thread.sleep((long) n);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			io.inGuest();
		}
	}

}
