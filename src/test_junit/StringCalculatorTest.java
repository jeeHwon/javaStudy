package test_junit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringCalculatorTest {

	//add() 메소드를 테스트하는 test메소드
	//public int add(int x, int y){
	//	return x+y;
	static StringCalculator calc = null;
	
	
	//@BeforeClass
	//Test 클래스 실행시 가장 처음 딱 한번 호출
	//=> 공통적으로 사용이 되는 코드는 @BeforeClass를 이용하면 된다
	//@Test 메소드는 매번 Test 클래스 객체를 생성한다
	
	@BeforeClass
	public static void Setup() {
		System.out.println("@BeforeClass");
		calc = new StringCalculator();
	}
	
	@Test
	public void testAdd() {
		System.out.println("testAdd()");
		StringCalculator calc = new StringCalculator();
		int actual = calc.add(10, 90);
		assertEquals(100, actual);
	}
	@Test
	public void testMinus() {
		System.out.println("testMinus()");
		StringCalculator calc = new StringCalculator();
		int actual = calc.minus(10, 90);
		assertEquals(-80, actual);
	}
	
	
}
