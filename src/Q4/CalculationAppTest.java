package Q4;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

public class CalculationAppTest {
	//정적변수로서 CalculationApp 객체주소 담는 변수와 
	//Scanner로 입력 받을 값을 변수로 선언해 준뒤 test 실시한다
	static CalculationApp testCal;
	static String input = "10+2*3";
	
	@BeforeClass
	public static void initialize() {	//모든 test 전 객체 생성해 input 해주는 method
		testCal = new CalculationApp();
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    testCal.input();
	}
	
	@Test
	public void testInputStr() {	//입력값이 String 형태로 저장되는지 test
		String actual = testCal.str;
	    assertEquals("10+2*3", actual);
	}
	
	@Test
	public void testInputList() {	//string이 연산자를 기준으로 분해되어 list에 저장되는지 test
	    assertEquals("10", testCal.list.get(0));
	    assertEquals("+", testCal.list.get(1));
	    assertEquals("2", testCal.list.get(2));
	    assertEquals("*", testCal.list.get(3));
	    assertEquals("3", testCal.list.get(4));
	}
	
	@Test
	public void testCalculate() {	//사칙연산 수행하여 값이 맞는지 test
		testCal.calculate();
		double actual = testCal.result;
	    assertEquals(16.0, actual, 1e-8);
	}
}