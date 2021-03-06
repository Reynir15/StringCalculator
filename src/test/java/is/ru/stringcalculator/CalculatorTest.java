package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptySrting() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testContainsNewLine() {
		assertEquals(15, Calculator.add("4,5\n6"));
	}

	@Test
	public void testBiggerThan1K() {
		assertEquals(7, Calculator.add("1001,2\n5,2000"));
	}

	@Test
	public void testDifferentDelimeter() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}
}	


	
/*for(int i ...){
	if(numbers[] < 1000)
	continue
}
*/