
public abstract class Number {

	Digit firstDigit, lastDigit;
	
	public void attach(char symbol) {
		Digit newDigit = new Digit(symbol);
				
		if (firstDigit == null) {
			firstDigit = newDigit;
		}
		
		if (lastDigit == null) {
			lastDigit = newDigit;
		} else {
			lastDigit.rightDigit = newDigit;
			newDigit.leftDigit = lastDigit;
			lastDigit = lastDigit.rightDigit;
		}		
	}
	
	public abstract Number convert();
	public abstract Number convertToDecimal();
	public abstract Number convertToBinary();
	public abstract Number convertToHex();
	
	public String toString() {
		String output = "";
		
		for (Digit currentDigit = firstDigit; currentDigit != null; currentDigit = currentDigit.rightDigit) {
			output = output.concat(currentDigit.toString());
		}
		
		return output;
	}
	
	
}
