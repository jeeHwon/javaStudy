package test_junit;

import junit.framework.TestCase;

public class FiboTest extends TestCase{

	public static void main(String[] args) {
		//junit.textui.TestRunner.run(FiboTest.class)를 호출함으로써
		//Test가 진행됨 junit은 FiboTest라느 클래스의 method 중에서
		//test로 시작하는 이름의 method를 테스트메서드로 자동인식하여 
		//자동으로 test해 준다
		junit.textui.TestRunner.run(FiboTest.class);
	
	}
	public void testFibo01() {
		Fibo f1 = new Fibo();
		assertEquals(f1.fibo1(48)+f1.fibo1(49), f1.fibo1(50));
	}
	
	public void testFibo02() {
		Fibo f1 = new Fibo();
		//assertEquals(0, f1.fibo2(0));
		//assertEquals(1, f1.fibo2(1));
		//assertEquals(1, f1.fibo2(2));
		//assertEquals(2, f1.fibo2(3));
		//assertEquals(34, f1.fibo2(9));
		assertEquals(f1.fibo2(48)+f1.fibo2(49), f1.fibo2(50));
	}

}
