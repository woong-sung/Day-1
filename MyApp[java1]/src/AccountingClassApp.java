class Accounting{
	public double valueOfSupply ;
	public double vatRate ;
	public double expenseRate;
	public double incomeRate;
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
		}

	public double getDividend1() {
		return getIncome() *5/10;
	}
	public double getDividend2() {
		return getIncome() *3/10;
	}
	public double getDividend3() {
		return getIncome() *2/10;
	}

	public double getExpense() {
		return valueOfSupply*expenseRate/10;
	}

	public double getIncome() {
		return valueOfSupply* incomeRate/10;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getVAT() {
		return valueOfSupply * vatRate/10;
	}
}

public class AccountingClassApp {
		

	
	public static void main(String[] args) {
		
//		Accounting.valueOfSupply = 20000.0 ;
//		Accounting.vatRate = 1;
//		Accounting.expenseRate = 3 ;
//		Accounting.incomeRate = 7 ;
// 		//..
//		Accounting.print();
//		//..
//		Accounting.valueOfSupply = 30000.0 ;
//		Accounting.vatRate = 2;
//		Accounting.expenseRate = 5 ;
//		Accounting.incomeRate = 5 ;
// 		//..
		
		// 인스턴스
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 20000.0;
		a1.vatRate = 1;
		a1.expenseRate = 3;
		a1.incomeRate = 7;
		System.out.println("a1의 ");
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 30000.0;
		a2.vatRate = 1;
		a2.expenseRate = 5;
		a2.incomeRate = 5;
		a2.print();
	}
}
