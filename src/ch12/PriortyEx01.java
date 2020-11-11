package ch12;


//쓰레드 우선순위
//public static final int MAX_PRIORITY=10
//public static final int MIN_PRIORITY=1
//public static final int NORM_PRIORITY=5
public class PriortyEx01 {
	public static boolean test = false;
	public static void main(String[] args) {
		MinThread mnt = new MinThread("@@@@MinThr~!");
		MaxThread mxt = new MaxThread("         MaxThr~!@@@@");
		
		//쓰레드에 우선순위 지정
		mnt.setPriority(Thread.MIN_PRIORITY);
		mxt.setPriority(Thread.MAX_PRIORITY);
		
		mnt.start();
	    mxt.start();
		
		System.out.println(test);
		System.out.println("main Thr end!");
		
	}

}

//덜 중요한 클래스라고 가정
class MinThread extends Thread{
	public MinThread(String name) {super(name);}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(currentThread().getName()+i);
			if (i==10) {
				PriortyEx01.test = true;
			}
		}
	}
	
}

//더 중요한 클래스라고 가정
class MaxThread extends Thread{
	public MaxThread(String name) {super(name);}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(currentThread().getName()+i);
			if (i==10) {
				PriortyEx01.test = true;
			}
		}
	}
}
