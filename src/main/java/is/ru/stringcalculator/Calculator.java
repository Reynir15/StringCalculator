package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers) {
		String delimSplit = ",|\n";
		if(numbers.equals("")){
			return 0;	
		}
		else{
			if(numbers.startsWith("//")) {
				delimSplit = numbers.substring(2, 3);
				numbers = numbers.substring(4);
			}
			
			String theNumbers[] = numbers.split(delimSplit);
				
			return sum(theNumbers);
			
		}
	}
		private static int toInt(String number){
			return Integer.parseInt(number);
		}

		private static int sum(String [] theNumbers){
			int total = 0;
			for(String number : theNumbers) {
				int validNumber = Integer.parseInt(number);
				if(validNumber <= 1000) {
					total += toInt(number);
				}
				
			}
			return total;
		}
}