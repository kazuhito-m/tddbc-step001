package tk.bnbm.tddbc.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {
	public static Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void multiply正常系() {
		int actual = testee.multiply(3, 2);
		assertThat(actual, is(6));
	}

	@Test
	public void divide正常系() {
		int actual = testee.divide(15, 5);
		assertThat(actual, is(3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void devideゼロ割り例外を発生させること() {
		testee.divide(1, 0);
	}
}
