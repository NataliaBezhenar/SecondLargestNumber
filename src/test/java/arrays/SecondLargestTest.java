package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SecondLargestTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test(expected = IllegalArgumentException.class)
	public void testEmptyArray() {
		int[] array = {};
		doTest(1, array);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOneElementArray() {
		int[] array = { 1 };
		doTest(1, array);
	}

	@Test(expected = IllegalArgumentException.class)
	public void allValuesEqual() {
		int[] array = { 5, 5, 5, 5, 5, 5, 5 };
		doTest(1, array);
	}

	@Test
	public void testAllPositiveValues() {
		int[] array = { 4, 15, 10, 2, 3, 5, 6, 9, 8 };
		doTest(10, array);
	}

	@Test
	public void testMinValueOnFirstPosition() {
		int[] array = { -200, 4, 15, 10, 2, 3, 5, 6, 9, 8 };
		doTest(10, array);
	}

	@Test
	public void testMaxValueOnFirstPosition() {
		int[] array = { 200, 4, 15, 10, 2, 3, 5, 6, 9, 8 };
		doTest(15, array);
	}

	@Test
	public void allNegativeValues() {
		int[] array = { -5, -9, -25, -4 };
		doTest(-5, array);
	}

	@Test
	public void testArr() {
		int[] array = { 1, 1, 1, 1, 3, 3, 3, 3 };
		doTest(1, array);
	}

	@Test
	public void testWithMaxVal() {
		int[] array = { 1, 1, 1, 1, 3, 3, 3, 3, Integer.MAX_VALUE,
				Integer.MAX_VALUE };
		doTest(3, array);
	}

	private void doTest(int expectedValue, int[] array) {
		int actualValue = SecondLargestEl.secondLargestNumber(array);
		assertEquals(expectedValue, actualValue);
	}

}
