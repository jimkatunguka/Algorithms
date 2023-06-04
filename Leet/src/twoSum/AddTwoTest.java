package twoSum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoTest {

	@Test
	public void addTest() {

		int actual = AddTwo.add(7, 4);
		int expected = 11;

		assertEquals("My comment", expected, actual);
	}

}
