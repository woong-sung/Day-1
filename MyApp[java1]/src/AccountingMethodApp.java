
public class AccountingMethodApp {
		
	public static double valueOfSupply ;
	public static double vatRate ;
	public static double expenseRate;
	public static double incomeRate;
	
	public static void main(String[] args) {
		
		valueOfSupply = 20000.0 ;
		vatRate = 1;
 		expenseRate = 3 ;
 		incomeRate = 7 ;
 		
 		print();}
 

		public static void print() {
			System.out.println("Value of supply : " + valueOfSupply);
			System.out.println("VAT : " + getVAT());
			System.out.println("Total : "+ getTotal());
			System.out.println("Expense : "+ getExpense());
			System.out.println("Income : "+ getIncome());
			System.out.println("Dividend 1 : "+ getDividend1());
			System.out.println("Dividend 2 : "+ getDividend2());
			System.out.println("Dividend 3 : "+ getDividend3());
		}

	public static double getDividend1() {
		return getIncome() *5/10;
	}
	public static double getDividend2() {
		return getIncome() *3/10;
	}
	public static double getDividend3() {
		return getIncome() *2/10;
	}

	public static double getExpense() {
		return valueOfSupply*expenseRate/10;
	}

	private static double getIncome() {
		return valueOfSupply* incomeRate/10;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate/10;
	}

}
