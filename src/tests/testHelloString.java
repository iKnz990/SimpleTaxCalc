/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */
package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import model.CalcLogic;
import model.calc;

/**
 * @author 15152
 *
 */
public class testHelloString {
	CalcLogic calclogic = new CalcLogic();
	calc calc = new calc();
	
	
	@Test
	public void nameTest() {
		calc.setName("ted");
		String helloUser = calclogic.sayHi(calc);
		assertNotNull(helloUser);
		
	}
	@Test
	public void nullString() {
		calc.setName("");
		String helloUser = calclogic.sayHi(calc);
		assertNull(helloUser);
	}
}
