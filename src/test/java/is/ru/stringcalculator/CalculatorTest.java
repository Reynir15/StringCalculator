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
	public void testOneNumeR() {
		assertEquals(3, Calculator.add("1,2"));
	}
}


/*for(int i ...){
	if(numbers[] < 1000)
	continue
}
*/