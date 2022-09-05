/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author 15152
 *
 */
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//CalcLogic
		Result result = JUnitCore.runClasses(TestCalcLogic.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		//StringLogic
		Result resultString = JUnitCore.runClasses(testHelloString.class);
		for (Failure failure : resultString.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(resultString.wasSuccessful());
	}

}
