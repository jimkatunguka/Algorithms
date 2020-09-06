package reverseString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void reverseTest() {
		String actual = ReverseString.reverse("01234");
		String expected = "43210";

		assertEquals("My String", expected, actual);
	}

}
