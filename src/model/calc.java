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
public class calc {

	public String name;
	public double income;
	public double taxamt;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getTaxamt() {
		return taxamt;
	}
	public void setTaxamt(double taxamt) {
		this.taxamt = taxamt;
	}
	
	
	
	/**
	 * @param name
	 * @param income
	 * @param taxamt
	 */
	
	public calc() {

		name = "";
		income = 14650;
		taxamt = 0.1;
	}
	
	public calc(String name, double income, double taxamt) {
		super();
		this.name = name;
		this.income = income;
		this.taxamt = taxamt;
	}
	
	@Override
	public String toString() {
		return "calc [name=" + name + ", income=" + income + ", taxamt=" + taxamt + "]";
	}
	
	
	
	
	
}
