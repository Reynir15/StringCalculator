package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers) {

		if(numbers.equals("")){
			return 0;	
		}
		else{
			if(numbers.contains(",") || numbers.contains("\n")){
				String theNumbers[] = numbers.split(",|\n");
				return sum(theNumbers);
			}
						

			
			return 1;
			
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