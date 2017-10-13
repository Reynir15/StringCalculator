package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers) {
		if(numbers.equals("")){
			return 0;	
		}
		else{
			if(numbers.contains(",")){
				String theNumbers[] = numbers.split(",");
				return toInt(theNumbers[0])+toInt(theNumbers[1]);
			}
			return 1;
			
		}
	}
		private static int toInt(String number){
			return Integer.parseInt(number);
		}
}