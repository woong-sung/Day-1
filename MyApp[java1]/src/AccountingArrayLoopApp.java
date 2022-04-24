
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
 		double valueOfSupply = Double.parseDouble(args[0]);
 		double vatRate = 0.1;
 		double expenseRate = 0.3;
 		double incomeRate = 0.7;
 		double income = valueOfSupply * incomeRate;

 		

 		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + valueOfSupply * vatRate);
		System.out.println("Total : "+ (valueOfSupply + valueOfSupply * vatRate));
		System.out.println("Expense : "+ (valueOfSupply * expenseRate ));
		System.out.println("Income : "+ income);


		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income*dividendRates[0];
		double dividend2 = income*dividendRates[1];
		double dividend3 = income*dividendRates[2];
	
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend "+ (i+1)+" : " + income*dividendRates[i] );
			i = i+1;
		}
	
	}

}
