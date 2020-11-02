package junitTest;


//피보나치 수열 : 어떤 수열의 항이 앞의 두항의 합과 같은 수열
// 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233..
public class Fibo {
	
	
	static int x = 1;
	static int y = 1;
	static int z = 0;
	public static void main(String[] args) {
		Fibo f1 = new Fibo();
		
		
		
		
		
	}
	//0.myStyle
	public static void fibo00() {
		while (true) {
			z = x+y;
			x = y;
			y = z;
			
			double d = (y*1.0)/(x*1.0);
			System.out.println(d);
			if (z>200) {
				break;
			}
		}
		
	}
	
	//1.반복문 이용
	public int  fibo1(int n) {
		//1. 반복문 이용
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,...
		if(n==0) { 
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			int result = 0;
			int a=0; int b=1;
			for(int i=2; i<=n; i++) {
				result=a+b;
				a=b;
				b=result;
			}
			return result;
		}	
	}
	
	//2.재귀함수 이용
	public int fibo2(int n) {
		if(n==0) return 0;
		else if( n==1 || n==2 )  return 1;
		return fibo2(n-2)+fibo2(n-1);
		
	}

}
