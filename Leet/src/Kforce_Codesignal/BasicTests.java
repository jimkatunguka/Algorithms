//
//package Kforce_Codesignal;
//
//import junit.framework.Test;
//import junit.framework.TestSuite;
//
///**
// * Basic tests
// */
//public class BasicTests extends TestCase {
//	/**
//	 * Create the test case
//	 *
//	 * @param testName name of the test case
//	 */
//	public BasicTests(String testName) {
//		super(testName);
//	}
//
//	/**
//	 * @return the suite of tests being tested
//	 */
//	public static Test suite() {
//		return new TestSuite(BasicTests.class);
//	}
//
//	/**
//	 * 1 + 2 = 3
//	 */
//	public void testAdd() {
//		try {
//			Expression result = new Parser().parse("x + y");
//			int res = result.evaluate(1, 2);
//			assert res == 3 : "Result was: " + res;
//		} catch (Exception e) {
//			System.err.println("There should be no exception, but was: " + e);
//			assertTrue(false);
//		}
//	}
//
//	/**
//	 * 50 - 100 = -50
//	 */
//	public void testSub() {
//		try {
//			Expression result = new Parser().parse("y - 100");
//			int res = result.evaluate(100, 50);
//			assert res == -50 : "Result was: " + res;
//		} catch (Exception e) {
//			System.err.println("There should be no exception, but was: " + e);
//			assertTrue(false);
//		}
//	}
//
//	/**
//	 * 5 * 6 = 30
//	 */
//	public void testMul() {
//		try {
//			Expression result = new Parser().parse("x * y");
//			int res = result.evaluate(5, 6);
//			assert res == 30 : "Result was: " + res;
//		} catch (Exception e) {
//			System.err.println("There should be no exception, but was: " + e);
//			assertTrue(false);
//		}
//	}
//
//	/**
//	 * 10 / 2 = 5
//	 */
//	public void testDiv() {
//		try {
//			Expression result = new Parser().parse("10 / x");
//			int res = result.evaluate(2, 3);
//			assert res == 5 : "Result was: " + res;
//		} catch (Exception e) {
//			System.err.println("There should be no exception, but was: " + e);
//			assertTrue(false);
//		}
//	}
//
//	/**
//	 * -20 = -20
//	 */
//	public void testNeg() {
//		try {
//			Expression result = new Parser().parse("-y");
//			int res = result.evaluate(10, 20);
//			assert res == -20 : "Result was: " + res;
//		} catch (Exception e) {
//			System.err.println("There should be no exception, but was: " + e);
//			assertTrue(false);
//		}
//	}
//
//	/**
//	 * abs(-10) = 10
//	 */
//	public void testAbs() {
//		try {
//			Expression result = new Parser().parse("abs(x)");
//			int res = result.evaluate(-10, 20);
//			assert res == 10 : "Result was: " + res;
//		} catch (Exception e) {
//			System.err.println("There should be no exception, but was: " + e);
//			assertTrue(false);
//		}
//	}
//
//	/**
//	 * no first argument
//	 */
//	public void testFail1() {
//		try {
//			Expression result = new Parser().parse("* x * y");
//			System.err.println("There should be an exception!");
//		} catch (Exception e) {
//			assertTrue(e instanceof ParseErrorException);
//		}
//	}
//
//	/**
//	 * no opening parenthesis
//	 */
//	public void testFail2() {
//		try {
//			Expression result = new Parser().parse("x * y)");
//			System.err.println("There should be an exception!");
//		} catch (Exception e) {
//			assertTrue(e instanceof ParseErrorException);
//		}
//	}
//
//	/**
//	 * incorrect symbol
//	 */
//	public void testFail3() {
//		try {
//			Expression result = new Parser().parse("x * y@");
//			System.err.println("There should be an exception!");
//		} catch (Exception e) {
//			assertTrue(e instanceof ParseErrorException);
//		}
//	}
//}
//
//class TestCase {
//
//}
