/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CalcLogic;
import model.calc;

/**
 * @author 15152
 *
 */
public class TestCalcLogic {
CalcLogic calclogic = new CalcLogic();
calc calc = new calc();



	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void Bracket1Test() {
		calc.setIncome(14650);
		double taxAmt = calclogic.calculateTaxAmt(calc);
		assertEquals(1465, taxAmt, 0.0);
		
	}
	@Test
	public void Bracket2Test() {
		calc.setIncome(55900);
		double taxAmt = calclogic.calculateTaxAmt(calc);
		assertEquals(6708, taxAmt, 0.0);
	}
	@Test
	public void Bracket3Test() {
		calc.setIncome(89050);
		double taxAmt = calclogic.calculateTaxAmt(calc);
		assertEquals(19591, taxAmt, 0.0);
	}
	
	@Test
	public void Bracket4Test() {
		calc.setIncome(170050);
		double taxAmt = calclogic.calculateTaxAmt(calc);
		assertEquals(40812, taxAmt, 0.0);
	}
	@Test
	public void Bracket5Test() {
		calc.setIncome(215950);
		double taxAmt = calclogic.calculateTaxAmt(calc);
		assertEquals(69104, taxAmt, 0.0);
	}
	@Test
	public void Bracket6Test() {
		calc.setIncome(539900);
		double taxAmt = calclogic.calculateTaxAmt(calc);
		assertEquals(188965, taxAmt, 0.0);
	}
	
}
