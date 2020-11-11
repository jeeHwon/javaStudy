package ch12;

import java.util.ArrayList;

//join()
//쓰레드를 여러개 동시에 실행 할 때는 어떤 쓰레드가 실행될지 정확히 제어하기 어렵다
//따라서 특정한 쓰레드가 전부 실행 된 후에 다른 쓰레드가 실행되게 하려면 일정한
//	처리를 하여야 하는데 이때 사용하는 메서드가 join()
//join() : join()메서드를 호출한 쓰레드 작업이 모두 끝날때까지 다른 쓰레드가 대기하게
//			하는 기능을 제공

//여기서는 객체 2개 생성 후 동시에 실행
//join을 적용한 멀티쓰레드
public class JoinEx02 {
	
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {
		BeforeThread2 bt = new BeforeThread2("비포쓰레드");
		AfterThread2 at = new AfterThread2("애프터쓰레드");
		bt.start();
		try {
			bt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		at.start();
	}

}
//목록에 자동차명을 추가
class BeforeThread2 extends Thread{
	public BeforeThread2(String name) {
		super(name);
	}
	private void addCar() {
		System.out.println("addCar 진입");
		JoinEx02.carList.add("porsche boxster");
		JoinEx02.carList.add("porsche 911");
		JoinEx02.carList.add("porsche cayman");
		JoinEx02.carList.add("porsche macan");
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName()+"의 run()호출 성공");
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addCar();
		
	}
}
//자동차명 목록을 출력
class AfterThread2 extends Thread{
	public AfterThread2(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName()+"의 run()호출 성공");
		for (int i = 0; i < JoinEx02.carList.size(); i++) {
			System.out.println(JoinEx02.carList.get(i));//자동차 목록 출력
		}
	}
	
}


