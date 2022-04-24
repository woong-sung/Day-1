
public class AccountingAppIfUnder10000App {

	public static void main(String[] args) {
		
 		double valueOfSupply = Double.parseDouble(args[0]);
 		double vatRate = 0.1;
 		double expenseRate = 0.3;
 		double incomeRate = 0.7;
 		double income = valueOfSupply * incomeRate;
		double dividend1 = income*0.5;
 		double dividend2 = income*0.3;
 		double dividend3 = income*0.2;

 		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + valueOfSupply * vatRate);
		System.out.println("Total : "+ (valueOfSupply + valueOfSupply * vatRate));
		System.out.println("Expense : "+ (valueOfSupply * expenseRate ));
		System.out.println("Income : "+ income);
		System.out.println("Dividend 1 : "+ dividend1);
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);
		
	}

}
