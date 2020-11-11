package ch12;


//손님수가 제한된 식당프로그램이라고 가정
//식당에서 자리가 비면 손님을 다시 채우는 작업을 구현
//만약 고객의 수가 꽉 채워져있다면 고객을 더 들일 수 없다
//식당이 허용할 수 있는 인원이 채워지면 손님을 채우는 쓰레드를 wait()메서드를
//	호출해서 waiting pool에 대기시키는 방법

//손님이 들어오고 나가는 기능을 정의한 클래스를 사용하는 클래스
public class InOutEx01 {
	
    public static int MAX_GUEST = 5;	//최대고객의 수
    int guestNum = 0;	//현재 고객의 수
    
    public synchronized void inGuest() {
    	System.out.println("손님 들어갑니다");
    	guestNum++;
    	System.out.println("현재의 손님수: "+guestNum);
    	//허용할 수 있는 인원이 모두 채워지면
    	if (guestNum==MAX_GUEST) {
    		//손님을 채우는 쓰레드를 wait()메서드를 호출해서 waiting pool에 대기시키자
    		try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
    public synchronized void outGuest() {
    	if (guestNum<1) {
    		notify();	//waiting pool에서 대기중인 쓰레드 하나를 깨운다
			return;
		}
    	guestNum--;
    	System.out.println("감사합니다 또오세요");
    	System.out.println("현재의 손님수: "+guestNum);
    }
    

	public static void main(String[] args) {
		InOutEx01 io = new InOutEx01();
		InGuestThread igt = new InGuestThread(io);
		OutGuestThread ogt = new OutGuestThread(io);
		igt.start();
		ogt.start();
		
		
	}

}
