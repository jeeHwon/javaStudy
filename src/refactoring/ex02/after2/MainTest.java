package refactoring.ex02.after2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.JUnit4TestAdapter;
import util.StandardOutputTest;

public class MainTest extends StandardOutputTest{

	@Test
	public void testMain() {
		//assertEquals(String 메세지, expected, actual);
		//expected
		String expected = getExpectedOutput("nana eats.",
											"nana stop.",
											"nana jumping.",										
											"error code.");
		
		//actual
		Main.main(new String[0]);
		String actual = getActualOutput();
		
		assertEquals( expected, actual);
	}

	public static junit.framework.Test suite(){
		return new JUnit4TestAdapter(MainTest.class);
	}
}







