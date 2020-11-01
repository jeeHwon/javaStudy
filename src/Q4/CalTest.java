package Q4;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class CalTest {
	private ByteArrayOutputStream byteArrayOutputStream;
	private PrintStream console;
	
	@Before
	public void setup() {
		byteArrayOutputStream = new ByteArrayOutputStream();
		console = System.out;
	}

	@Test
	public void testInput() {
		CalculationApp cal = new CalculationApp();
		cal.input();
		
	}

	@Test
	public void testCalculate() {
		fail("Not yet implemented");
	}

	@Test
	public void testRun() {
		fail("Not yet implemented");
	}

}
