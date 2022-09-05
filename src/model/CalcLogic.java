/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */
package model;

/**
 * @author 15152
 *
 */
public class CalcLogic {

	//strings for different assert methods.
	public String sayHi(calc calc) {
		String helloUser = calc.getName();
		
		
		if(helloUser.isEmpty()) {
			helloUser = null;
		} else {
			helloUser = ("Hello" + helloUser);
		}

		return helloUser;
	}
	
	//simple tax calculator logic
	public double calculateTaxAmt(calc calc) {
		
		double TA = 0;
		double income = 0;
		
		//tax brackets - high point
		double tb1 = 14650;
		double tb2 = 55900;
		double tb3 = 89050;
		double tb4 = 170050;
		double tb5 = 215950;
		double tb6 = 539900;
		
		//add 1 for 37% tb.
		double tb7 = 539900 + 1;
		
		//tax rates
		double r1 = 0.1;
		double r2 = 0.12;
		double r3 = 0.22;
		double r4 = 0.24;
		double r5 = 0.32;
		double r6 = 0.35;
		double r7 = 0.37;
		
		
		income = calc.getIncome();
		
		if(income <= tb1) {
			TA = r1 * tb1;
		} else if (income <= tb2) {
			TA = r2 * tb2;
		}else if (income <= tb3) {
			TA = r3 * tb3;
		}else if (income <= tb4) {
			TA = r4 * tb4;
		} else if (income <= tb5) {
			TA = r5 * tb5;
		}else if (income <= tb6) {
			TA = r6 * tb6;
		}else if (income <= tb7) {
			TA = r7 * tb7;
		} 
		
		return TA;
	}


	
	
	
	
	
	
	
}

