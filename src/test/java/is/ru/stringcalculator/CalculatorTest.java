package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptySrting() {
		assertEquals(0, Calculator.add(""));
	}
}