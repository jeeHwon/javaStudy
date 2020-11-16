package test_refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.JUnit4TestAdapter;
import util.StandardOutputTest;

public class Ex02Test extends StandardOutputTest{

	@Test
	public void testMain() {
		//assertEquals(String 메시지, expected, actual);
		//expected : 예상되는 값
		String expected = getExpectedOutput("max eats","max stops","max jumps");
		
		//actural
		Ex02_Ref.main(new String[0]);
		String actual = getActualOutput();
		
		assertEquals(expected, actual);
		
	}
	public static junit.framework.Test suite(){
		return new JUnit4TestAdapter(Ex02Test.class);
	}
	

}
