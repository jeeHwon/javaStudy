package test_junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/*참고	 Hamcrest란?
 *  소프트웨어 테스트를 위한 framework
 *  import static org.hamcrest.CoreMatchers.*;해야한다
 */
//junit4에서는 Test클래스가 junit.framework.TestCase를 상속받지 않아도 된다
//public class EqualTest extends TestCase{

import java.util.Arrays;
import java.util.List;


import org.junit.Test;
import org.junit.Ignore;



//import junit.framework.TestCase;

//junit4에서는 Test클래스가 junit.framework.TestCase import 안해도 된다
public class EqualTest {
	//junit4에서 테스트메소드명은 반드시 test로 시작하지 않아도 된다

	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "starcraft".getBytes();
		byte[] actual = "starcraft".getBytes();
		assertArrayEquals("filaure-byte array not same", expected, actual);
	}
	@Test
	public void testAssertArrayEquals2() {
		String[] expected = new String[] {"a","b","c"};
		String[] actual = new String[] {"a","b","c"};
		assertArrayEquals("filaure-byte array not same", expected, actual);
	}
	
	
	//reference 비교
	@Test
	public void testReferenceEqual() {
		String str1 = new String("레오나르도");
		//String str2 = new String("레오나르도");
		String str2 = str1;
		//System.out.println("reference 비교결과 :"+(str1==str2)); //false
		//assertEquals(str1, str2);
		assertSame("두 객체의 주소값이 동일", str1, str2);
		
	}
	//value 비교
	@Test
	public void testValueEqual() {
		String str1 = new String("디카프리오");
		String str2 = new String("디카프리오");
		//System.out.println("value 비교결과 :"+(str1.equals(str2)));
		assertEquals("두 객체의 값이 동일", str1, str2);
	}
	//List 비교
	//Array.asList() : 일반 배열을 ArrayList로 변환
	//get(), contains()는 사용가능하지만
	//add() 사용불가
	@Test
	public void testValueEqual2() {
		List<Integer> expected = Arrays.asList(1,2,3);
		List<Integer> actual = Arrays.asList(1,2,3);
		assertEquals("두 List의 값과 순서가 같음", expected, actual);
	
	}
	
	@Test
	public void testAssertFalse() {
		//assertFalse("fail-false가 나와야함", true);
		assertFalse("fail-false가 나와야함", false);
	}
	
	@Test
	public void testAssertNotNull() {
		//String str1 = null;
		//assertNotNull("not null이어야 한다", str1); //fail
		assertNotNull("not null이어야 한다", new Object());
		
	}
	
	@Test
	public void testAssertTrue() {
		assertTrue("True 이어야 한다", true);
		
	}
	
	//assertThat(검사할 대상데이터, 조건);

	@Test
	public void testAssertThat() {
		Object result = "test";
		assertTrue(result instanceof String); //success
		assertThat(result, instanceOf(String.class)); //success
		
		int i = 3;
		assertThat(i,is(3));
	}
	
	//@Ignore는 Test에서 제외하라
	@Ignore //import org.junit.Ignore
	@Test
	public void testIgnore() throws Exception{
		assertTrue(false);
	}
	
	@Test(timeout = 1000)
	public void testTimeOut() throws Exception{
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j < 100000; j++) {
				sum+=j;
			}
		}
		System.out.println(sum);
	}

}
